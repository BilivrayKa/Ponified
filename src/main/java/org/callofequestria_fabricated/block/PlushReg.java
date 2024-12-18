package org.callofequestria_fabricated.block;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import org.callofequestria_fabricated.Callofequestria_fabricated;
import org.callofequestria_fabricated.block.custom.PlushBaseBlock;
import org.callofequestria_fabricated.sound.ModSounds;

public class PlushReg {
    public static final Block PLUSH_PINKIE_PIE = registerBlock("plush_pinkie_pie",
            new PlushBaseBlock(ModSounds.PINKIE1,ModSounds.PINKIE2, FabricBlockSettings.copy(Blocks.PINK_WOOL).strength(2).nonOpaque()));
    public static final Block PLUSH_ROSE = registerBlock("plush_rose",
            new PlushBaseBlock(ModSounds.ROSE1, ModSounds.ROSE2, FabricBlockSettings.copy(Blocks.PINK_WOOL).strength(2).nonOpaque()));
    public static final Block PLUSH_FLUTTERSHY = registerBlock("plush_fluttershy",
            new PlushBaseBlock(ModSounds.YAY, ModSounds.YAY2, FabricBlockSettings.copy(Blocks.YELLOW_WOOL).strength(2).nonOpaque()));
    public static final Block PLUSH_APPLEJACK = registerBlock("plush_applejack",
            new PlushBaseBlock(ModSounds.APPLEJACK1, ModSounds.APPLEJACK2, FabricBlockSettings.copy(Blocks.ORANGE_WOOL).strength(2).nonOpaque()));
    public static final Block PLUSH_RAINBOW_DASH = registerBlock("plush_rainbow_dash",
            new PlushBaseBlock(ModSounds.RAINBOW_DASH1, ModSounds.RAINBOW_DASH2, FabricBlockSettings.copy(Blocks.CYAN_WOOL).strength(2).nonOpaque()));
    public static final Block PLUSH_RARITY = registerBlock("plush_rarity",
            new PlushBaseBlock(ModSounds.RARITY1, ModSounds.RARITY2, FabricBlockSettings.copy(Blocks.WHITE_WOOL).strength(2).nonOpaque()));
    public static final Block PLUSH_SPARKLE = registerBlock("plush_sparkle",
            new PlushBaseBlock(ModSounds.SPARKLE1, ModSounds.SPARKLE2, FabricBlockSettings.copy(Blocks.MAGENTA_WOOL).strength(2).nonOpaque()));
    public static final Block PLUSH_DERPY = registerBlock("plush_derpy",
            new PlushBaseBlock(ModSounds.DERPY1, ModSounds.DERPY2, FabricBlockSettings.copy(Blocks.GRAY_WOOL).strength(2).nonOpaque()));
    public static final Block PLUSH_STARLIGHT = registerBlock("plush_starlight",
            new PlushBaseBlock(ModSounds.STARLIGHT1, ModSounds.STARLIGHT2, FabricBlockSettings.copy(Blocks.CYAN_WOOL).strength(2).nonOpaque()));
    public static final Block PLUSH_TRIXIE = registerBlock("plush_trixie",
            new PlushBaseBlock(ModSounds.TRIXIE1, ModSounds.TRIXIE2, FabricBlockSettings.copy(Blocks.CYAN_WOOL).strength(2).nonOpaque()));
    public static final Block PLUSH_SWIRL = registerBlock("plush_swirl",
            new PlushBaseBlock(ModSounds.SWIRL1, ModSounds.SWIRL2, FabricBlockSettings.copy(Blocks.CYAN_WOOL).strength(2).nonOpaque()));
    public static final Block PLUSH_MINUETTE = registerBlock("plush_minuette",
            new PlushBaseBlock(ModSounds.MINUETTE1, ModSounds.MINUETTE2, FabricBlockSettings.copy(Blocks.CYAN_WOOL).strength(2).nonOpaque()));
    public static final Block PLUSH_MAUD_PIE = registerBlock("plush_maud_pie",
            new PlushBaseBlock(ModSounds.MAUD_PIE1, ModSounds.MAUD_PIE2, FabricBlockSettings.copy(Blocks.GRAY_WOOL).strength(2).nonOpaque()));
    public static final Block PLUSH_MARBLE_PIE = registerBlock("plush_marble_pie",
            new PlushBaseBlock(ModSounds.MARBLE_PIE1, ModSounds.MARBLE_PIE2, FabricBlockSettings.copy(Blocks.GRAY_WOOL).strength(2).nonOpaque()));
    public static final Block PLUSH_DARING_DO = registerBlock("plush_daring_do",
            new PlushBaseBlock(ModSounds.DARING_DO1, ModSounds.DARING_DO2, FabricBlockSettings.copy(Blocks.BROWN_WOOL).strength(2).nonOpaque()));
    public static final Block PLUSH_GRANNY_SMITH = registerBlock("plush_granny_smith",
            new PlushBaseBlock(ModSounds.GRANNY_SMITH1, ModSounds.GRANNY_SMITH2, FabricBlockSettings.copy(Blocks.GREEN_WOOL).strength(2).nonOpaque()));
    public static final Block PLUSH_LIMESTONE_PIE = registerBlock("plush_limestone_pie",
            new PlushBaseBlock(ModSounds.LIMESTONE_PIE1, ModSounds.LIMESTONE_PIE2, FabricBlockSettings.copy(Blocks.GRAY_WOOL).strength(2).nonOpaque()));
    public static final Block PLUSH_NURSE_REDHEART = registerBlock("plush_nurse_redheart",
            new PlushBaseBlock(ModSounds.NURSE_REDHEART1, ModSounds.NURSE_REDHEART2, FabricBlockSettings.copy(Blocks.WHITE_WOOL).strength(2).nonOpaque()));
    public static final Block PLUSH_LILY_VALLEY = registerBlock("plush_lily_valley",
            new PlushBaseBlock(ModSounds.LILY_VALLEY1, ModSounds.LILY_VALLEY2, FabricBlockSettings.copy(Blocks.PINK_WOOL).strength(2).nonOpaque()));
    public static final Block PLUSH_DAISY = registerBlock("plush_daisy",
            new PlushBaseBlock(ModSounds.DAISY1, ModSounds.DAISY2, FabricBlockSettings.copy(Blocks.PINK_WOOL).strength(2).nonOpaque()));
    public static final Block PLUSH_LOTUS_BLOSSOM = registerBlock("plush_lotus_blossom",
            new PlushBaseBlock(ModSounds.LOTUS_BLOSSOM1, ModSounds.LOTUS_BLOSSOM2, FabricBlockSettings.copy(Blocks.CYAN_WOOL).strength(2).nonOpaque()));
    public static final Block PLUSH_ALOE_VERA = registerBlock("plush_aloe_vera",
            new PlushBaseBlock(ModSounds.ALOE_VERA1, ModSounds.ALOE_VERA2, FabricBlockSettings.copy(Blocks.PINK_WOOL).strength(2).nonOpaque()));
    public static final Block PLUSH_OCTAVIA_MELODY = registerBlock("plush_octavia_melody",
            new PlushBaseBlock(ModSounds.OCTAVIA_MELODY1, ModSounds.OCTAVIA_MELODY2, FabricBlockSettings.copy(Blocks.GRAY_WOOL).strength(2).nonOpaque()));
    public static final Block PLUSH_DJ_PON3 = registerBlock("plush_dj_pon3",
            new PlushBaseBlock(ModSounds.DJ_PON31, ModSounds.DJ_PON32, FabricBlockSettings.copy(Blocks.WHITE_WOOL).strength(2).nonOpaque()));
    public static final Block PLUSH_CHEERILEE = registerBlock("plush_cheerilee",
            new PlushBaseBlock(ModSounds.CHEERILEE1, ModSounds.CHEERILEE2, FabricBlockSettings.copy(Blocks.PINK_WOOL).strength(2).nonOpaque()));
    public static final Block PLUSH_SPITFIRE = registerBlock("plush_spitfire",
            new PlushBaseBlock(ModSounds.SPITFIRE1, ModSounds.SPITFIRE2, FabricBlockSettings.copy(Blocks.YELLOW_WOOL).strength(2).nonOpaque()));
    public static final Block PLUSH_CHERRY_BERRY = registerBlock("plush_cherry_berry",
            new PlushBaseBlock(ModSounds.CHERRY_BERRY1, ModSounds.CHERRY_BERRY2, FabricBlockSettings.copy(Blocks.PINK_WOOL).strength(2).nonOpaque()));
    public static final Block PLUSH_SUGAR_BELLE = registerBlock("plush_sugar_belle",
            new PlushBaseBlock(ModSounds.SUGAR_BELLE1, ModSounds.SUGAR_BELLE2, FabricBlockSettings.copy(Blocks.PINK_WOOL).strength(2).nonOpaque()));
    public static final Block PLUSH_TWILIGHT_VELVET = registerBlock("plush_twilight_velvet",
            new PlushBaseBlock(ModSounds.TWILIGHT_VELVET1, ModSounds.TWILIGHT_VELVET2, FabricBlockSettings.copy(Blocks.WHITE_WOOL).strength(2).nonOpaque()));
    public static final Block PLUSH_LIGHTNING_DUST = registerBlock("plush_lightning_dust",
            new PlushBaseBlock(ModSounds.LIGHTNING_DUST1, ModSounds.LIGHTNING_DUST2, FabricBlockSettings.copy(Blocks.CYAN_WOOL).strength(2).nonOpaque()));


    private static Block registerBlock(String name, Block block) {
        return Registry.register(Registries.BLOCK, new Identifier(Callofequestria_fabricated.MOD_ID, name), block);
    }

    public static void registerPlushBlocks() {
        Callofequestria_fabricated.LOGGER.info("Registering Plushies for " + Callofequestria_fabricated.MOD_ID);
    }
}
