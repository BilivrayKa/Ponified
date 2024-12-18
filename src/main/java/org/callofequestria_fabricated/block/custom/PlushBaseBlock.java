package org.callofequestria_fabricated.block.custom;

import org.callofequestria_fabricated.sound.ModSounds;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.ShapeContext;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.BooleanProperty;
import net.minecraft.state.property.DirectionProperty;
import net.minecraft.state.property.Properties;
import net.minecraft.util.ActionResult;
import net.minecraft.util.BlockMirror;
import net.minecraft.util.BlockRotation;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;


import java.util.Random;

public class PlushBaseBlock extends Block {
    public static final BooleanProperty POWERED = BooleanProperty.of("powered");
    public static final DirectionProperty FACING = Properties.FACING;
    protected final SoundEvent sound2;
    protected final SoundEvent sound3;

    private static final Random rnd = new Random();

    private static final VoxelShape SHAPE = VoxelShapes.union(
            Block.createCuboidShape(6, 0, 3, 10, 7, 12)  // пример формы, можно настроить
    );
    private static final VoxelShape SHAPE2 = VoxelShapes.union(
            Block.createCuboidShape(3, 0, 6, 12, 7, 10)  // пример формы, можно настроить
    );

    public PlushBaseBlock(SoundEvent sound2, SoundEvent sound3, Settings settings) {
        super(FabricBlockSettings.of().sounds(new BlockSoundGroup(1.0F, rnd.nextFloat(1.25f, 1.35f),
                rnd.nextInt(2) + 1 == 1 ? sound2 : sound3, SoundEvents.BLOCK_WOOL_STEP,
                rnd.nextInt(2) + 1 == 1 ? sound2 : sound3, SoundEvents.BLOCK_WOOL_HIT, SoundEvents.BLOCK_WOOL_FALL)));
        this.sound2 = sound2;
        this.sound3 = sound3;

        //this.setDefaultState(this.stateManager.getDefaultState().with(POWERED, false));
        this.setDefaultState(this.stateManager.getDefaultState().with(FACING, Direction.SOUTH));
    }


    @Override
    public ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit) {
        if (world.isClient()) {
            return ActionResult.SUCCESS;
        }

        playSound(world, pos);

        return ActionResult.CONSUME;
    }

    public void playSound(World pLevel, BlockPos pPos){
        float pitch = rnd.nextFloat(1,1.15f);
        SoundEvent sound = ModSounds.SQUEE1;
        switch (rnd.nextInt(3)+1){
            case 2 :
                sound = ModSounds.SQUEE2;
                break;
            case 3 :
                sound = ModSounds.SQUEE3;
                break;

        }
        switch (rnd.nextInt(3)+1){
            case 2 :
                sound = sound2;
                break;
            case 3 :
                sound = sound3;
                break;

        }
        pLevel.playSound(null, pPos,
                sound, SoundCategory.BLOCKS, 1.0F, pitch);
    }

    @Override
    public VoxelShape getCollisionShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        Direction facing = state.get(FACING);
        switch (facing) {
            case NORTH:
                return this.SHAPE;
            case SOUTH:
                return this.SHAPE;
            case EAST:
                return this.SHAPE2;
            case WEST:
                return this.SHAPE2;
            default:
                return SHAPE;
        }
    }

    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        Direction facing = state.get(FACING);
        switch (facing) {
            case NORTH:
                return this.SHAPE;
            case SOUTH:
                return this.SHAPE;
            case EAST:
                return this.SHAPE2;
            case WEST:
                return this.SHAPE2;
            default:
                return SHAPE;
        }
    }

    @Override
    public BlockState getPlacementState(ItemPlacementContext context) {
        return this.getDefaultState().with(FACING, context.getPlayerLookDirection().getOpposite());
    }

    @Override
    public BlockState rotate(BlockState state, BlockRotation rotation) {
        return state.with(FACING, rotation.rotate(state.get(FACING)));
    }

    @Override
    public BlockState mirror(BlockState state, BlockMirror mirror) {
        return state.rotate(mirror.getRotation(state.get(FACING)));
    }

    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(FACING, POWERED);
    }

    @Override
    public void neighborUpdate(BlockState state, World world, BlockPos pos, Block block, BlockPos fromPos, boolean notify) {
        if (!world.isClient()) {
            boolean powered = world.isReceivingRedstonePower(pos);
            if (powered != state.get(POWERED)) {
                playSound(world, pos);
                world.setBlockState(pos, state.with(POWERED, powered), Block.NOTIFY_ALL);
            }
        }
    }

}
