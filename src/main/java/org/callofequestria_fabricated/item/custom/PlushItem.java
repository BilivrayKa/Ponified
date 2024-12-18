package org.callofequestria_fabricated.item.custom;

import net.minecraft.block.Block;
import net.minecraft.entity.EntityPose;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.*;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvent;
import net.minecraft.state.property.DirectionProperty;
import net.minecraft.state.property.Properties;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.RaycastContext;
import net.minecraft.world.World;
import org.callofequestria_fabricated.sound.ModSounds;

import java.util.Random;

public class PlushItem extends Item {

    private static final Random rnd = new Random();
    protected final Block block;
    protected final SoundEvent sound2;
    protected final SoundEvent sound3;
    protected final SoundEvent stereo_sound2;
    protected final SoundEvent stereo_sound3;
    public static final DirectionProperty FACING = Properties.FACING;
    private static SoundEvent sound;
    private static SoundEvent stereoSound;
    private static float pitch;
    public PlushItem(SoundEvent sound2, SoundEvent sound3,
                     SoundEvent stereoSound2, SoundEvent stereoSound3, Block block, Settings settings) {
        super(settings);
        this.block = block;
        this.sound2 = sound2;
        this.sound3 = sound3;
        this.stereo_sound2 = stereoSound2;
        this.stereo_sound3 = stereoSound3;
    }

    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity player, Hand hand) {
        if (!world.isClient && player instanceof ServerPlayerEntity serverPlayer) {
        }

        Vec3d lookDirection = player.getRotationVec(1.0F);
        Vec3d start = player.getEyePos();
        double reachDistance = 5.0D;
        Vec3d end = start.add(lookDirection.x * reachDistance, lookDirection.y * reachDistance, lookDirection.z * reachDistance);
        RaycastContext raycastContext = new RaycastContext(start, end, RaycastContext.ShapeType.OUTLINE, RaycastContext.FluidHandling.NONE, player);
        BlockHitResult hitResult = world.raycast(raycastContext);
        Random rnd = new Random();
        pitch = rnd.nextFloat(1, 1.15f);

        sound = ModSounds.SQUEE1;
        stereoSound = ModSounds.STEREO_SQUEE1;

        switch (rnd.nextInt(3) + 1) {
            case 2:
                sound = ModSounds.SQUEE2;
                stereoSound = ModSounds.STEREO_SQUEE2;
                break;
            case 3:
                sound = ModSounds.SQUEE3;
                stereoSound = ModSounds.STEREO_SQUEE3;
                break;
        }

        switch (rnd.nextInt(3) + 1) {
            case 2:
                sound = sound2;
                stereoSound = stereo_sound2;
                break;
            case 3:
                sound = sound3;
                stereoSound = stereo_sound3;
                break;
        }
        if (!world.isClient && hitResult.getType() != BlockHitResult.Type.BLOCK) {
            world.playSound(null, player.getSteppingPos(), sound, SoundCategory.PLAYERS, 1.0F, pitch);
        }
        world.playSoundFromEntity(null, player, stereoSound, SoundCategory.PLAYERS, 1.0f, pitch);
        player.getItemCooldownManager().set(this, 10);
        if(player.isInPose(EntityPose.CROUCHING) && player.getEquippedStack(EquipmentSlot.HEAD).isEmpty() && hitResult.getType() != BlockHitResult.Type.BLOCK){
            player.equipStack(EquipmentSlot.HEAD, player.getStackInHand(hand).split(1));
            return TypedActionResult.success(player.getStackInHand(hand));
        }

        return TypedActionResult.pass(player.getStackInHand(hand));
    }


    public ActionResult useOnBlock(ItemUsageContext context) {
        World world = context.getWorld();
        PlayerEntity player = context.getPlayer();
        Hand hand = context.getHand();

        if (!world.isClient) {
            Vec3d lookDirection = player.getRotationVec(1.0F);
            Vec3d start = player.getEyePos();
            double reachDistance = 5.0D;
            Vec3d end = start.add(lookDirection.x * reachDistance, lookDirection.y * reachDistance, lookDirection.z * reachDistance);
            RaycastContext raycastContext = new RaycastContext(start, end, RaycastContext.ShapeType.OUTLINE, RaycastContext.FluidHandling.NONE, player);
            BlockHitResult hitResult = world.raycast(raycastContext);

            if (hitResult.getType() == BlockHitResult.Type.BLOCK) {
                BlockPos targetPos = hitResult.getBlockPos();
                targetPos = targetPos.offset(hitResult.getSide());
                world.playSound(null, hitResult.getBlockPos().offset(hitResult.getSide()), sound, SoundCategory.BLOCKS, 1.0F, pitch);
                if (world.isAir(targetPos)) {
                    world.setBlockState(targetPos, block.getDefaultState().with(FACING, getDirectionFromLook(lookDirection).getOpposite()));

                    ItemStack stack = player.getStackInHand(hand);
                    stack.decrement(1);

                    if (stack.isEmpty()) {
                        player.setStackInHand(hand, ItemStack.EMPTY);
                    }
                    return ActionResult.SUCCESS;
                }
            }
        }
        return ActionResult.PASS;
    }

    private Direction getDirectionFromLook(Vec3d lookDirection) {
        if (Math.abs(lookDirection.x) > Math.abs(lookDirection.z)) {
            return lookDirection.x > 0 ? Direction.EAST : Direction.WEST;
        } else {
            return lookDirection.z > 0 ? Direction.SOUTH : Direction.NORTH;
        }
    }
}
