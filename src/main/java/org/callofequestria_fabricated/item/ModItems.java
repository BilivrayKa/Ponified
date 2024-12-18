package org.callofequestria_fabricated.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import org.callofequestria_fabricated.Callofequestria_fabricated;
import org.callofequestria_fabricated.block.PlushReg;
//import net.bilivrayka.callofequestria.fluid.ModFluids;
import org.callofequestria_fabricated.item.custom.PlushItem;
import org.callofequestria_fabricated.sound.ModSounds;


public class ModItems {

    public static final Item PLUSH_PINKIE_PIE = registerItem("plush_pinkie_pie",
            new PlushItem(ModSounds.PINKIE1, ModSounds.PINKIE2, ModSounds.STEREO_PINKIE1, ModSounds.STEREO_PINKIE2, PlushReg.PLUSH_PINKIE_PIE, new FabricItemSettings()));
    public static final Item PLUSH_ROSE = registerItem("plush_rose",
            new PlushItem(ModSounds.ROSE1, ModSounds.ROSE2, ModSounds.STEREO_ROSE1, ModSounds.STEREO_ROSE2, PlushReg.PLUSH_ROSE, new FabricItemSettings()));
    public static final Item PLUSH_FLUTTERSHY = registerItem("plush_fluttershy",
            new PlushItem(ModSounds.YAY, ModSounds.YAY2, ModSounds.STEREO_YAY, ModSounds.STEREO_YAY2, PlushReg.PLUSH_FLUTTERSHY, new FabricItemSettings()));
    public static final Item PLUSH_APPLEJACK = registerItem("plush_applejack",
            new PlushItem(ModSounds.APPLEJACK1, ModSounds.APPLEJACK2, ModSounds.STEREO_APPLEJACK1, ModSounds.STEREO_APPLEJACK2, PlushReg.PLUSH_APPLEJACK, new FabricItemSettings()));
    public static final Item PLUSH_RAINBOW_DASH = registerItem("plush_rainbow_dash",
            new PlushItem(ModSounds.RAINBOW_DASH1, ModSounds.RAINBOW_DASH2, ModSounds.STEREO_RAINBOW_DASH1, ModSounds.STEREO_RAINBOW_DASH2, PlushReg.PLUSH_RAINBOW_DASH, new FabricItemSettings()));
    public static final Item PLUSH_RARITY = registerItem("plush_rarity",
            new PlushItem(ModSounds.RARITY1, ModSounds.RARITY2, ModSounds.STEREO_RARITY1, ModSounds.STEREO_RARITY2, PlushReg.PLUSH_RARITY, new FabricItemSettings()));
    public static final Item PLUSH_SPARKLE = registerItem("plush_sparkle",
            new PlushItem(ModSounds.SPARKLE1, ModSounds.SPARKLE2, ModSounds.STEREO_SPARKLE1, ModSounds.STEREO_SPARKLE2, PlushReg.PLUSH_SPARKLE, new FabricItemSettings()));
    public static final Item PLUSH_DERPY = registerItem("plush_derpy",
            new PlushItem(ModSounds.DERPY1, ModSounds.DERPY2, ModSounds.STEREO_DERPY1, ModSounds.STEREO_DERPY2, PlushReg.PLUSH_DERPY, new FabricItemSettings()));
    public static final Item PLUSH_STARLIGHT = registerItem("plush_starlight",
            new PlushItem(ModSounds.STARLIGHT1, ModSounds.STARLIGHT2, ModSounds.STEREO_STARLIGHT1, ModSounds.STEREO_STARLIGHT2, PlushReg.PLUSH_STARLIGHT, new FabricItemSettings()));
    public static final Item PLUSH_TRIXIE = registerItem("plush_trixie",
            new PlushItem(ModSounds.TRIXIE1, ModSounds.TRIXIE2, ModSounds.STEREO_TRIXIE1, ModSounds.STEREO_TRIXIE2, PlushReg.PLUSH_TRIXIE, new FabricItemSettings()));
    public static final Item PLUSH_SWIRL = registerItem("plush_swirl",
            new PlushItem(ModSounds.SWIRL1, ModSounds.SWIRL2, ModSounds.STEREO_SWIRL1, ModSounds.STEREO_SWIRL2, PlushReg.PLUSH_SWIRL, new FabricItemSettings()));
    public static final Item PLUSH_MINUETTE = registerItem("plush_minuette",
            new PlushItem(ModSounds.MINUETTE1, ModSounds.MINUETTE2, ModSounds.STEREO_MINUETTE1, ModSounds.STEREO_MINUETTE2, PlushReg.PLUSH_MINUETTE, new FabricItemSettings()));
    public static final Item PLUSH_MAUD_PIE = registerItem("plush_maud_pie",
            new PlushItem(ModSounds.MAUD_PIE1, ModSounds.MAUD_PIE2, ModSounds.STEREO_MAUD_PIE1, ModSounds.STEREO_MAUD_PIE2, PlushReg.PLUSH_MAUD_PIE, new FabricItemSettings()));
    public static final Item PLUSH_MARBLE_PIE = registerItem("plush_marble_pie",
            new PlushItem(ModSounds.MARBLE_PIE1, ModSounds.MARBLE_PIE2, ModSounds.STEREO_MARBLE_PIE1, ModSounds.STEREO_MARBLE_PIE2, PlushReg.PLUSH_MARBLE_PIE, new FabricItemSettings()));
    public static final Item PLUSH_DARING_DO = registerItem("plush_daring_do",
            new PlushItem(ModSounds.DARING_DO1, ModSounds.DARING_DO2, ModSounds.STEREO_DARING_DO1, ModSounds.STEREO_DARING_DO2, PlushReg.PLUSH_DARING_DO, new FabricItemSettings()));
    public static final Item PLUSH_GRANNY_SMITH = registerItem("plush_granny_smith",
            new PlushItem(ModSounds.GRANNY_SMITH1, ModSounds.GRANNY_SMITH2, ModSounds.STEREO_GRANNY_SMITH1, ModSounds.STEREO_GRANNY_SMITH2, PlushReg.PLUSH_GRANNY_SMITH, new FabricItemSettings()));
    public static final Item PLUSH_LIMESTONE_PIE = registerItem("plush_limestone_pie",
            new PlushItem(ModSounds.LIMESTONE_PIE1, ModSounds.LIMESTONE_PIE2, ModSounds.STEREO_LIMESTONE_PIE1, ModSounds.STEREO_LIMESTONE_PIE2, PlushReg.PLUSH_LIMESTONE_PIE, new FabricItemSettings()));
    public static final Item PLUSH_NURSE_REDHEART = registerItem("plush_nurse_redheart",
            new PlushItem(ModSounds.NURSE_REDHEART1, ModSounds.NURSE_REDHEART2, ModSounds.STEREO_NURSE_REDHEART1, ModSounds.STEREO_NURSE_REDHEART2, PlushReg.PLUSH_NURSE_REDHEART, new FabricItemSettings()));
    public static final Item PLUSH_LILY_VALLEY = registerItem("plush_lily_valley",
            new PlushItem(ModSounds.LILY_VALLEY1, ModSounds.LILY_VALLEY2, ModSounds.STEREO_LILY_VALLEY1, ModSounds.STEREO_LILY_VALLEY2, PlushReg.PLUSH_LILY_VALLEY, new FabricItemSettings()));
    public static final Item PLUSH_DAISY = registerItem("plush_daisy",
            new PlushItem(ModSounds.DAISY1, ModSounds.DAISY2, ModSounds.STEREO_DAISY1, ModSounds.STEREO_DAISY2, PlushReg.PLUSH_DAISY, new FabricItemSettings()));
    public static final Item PLUSH_LOTUS_BLOSSOM = registerItem("plush_lotus_blossom",
            new PlushItem(ModSounds.LOTUS_BLOSSOM1, ModSounds.LOTUS_BLOSSOM2, ModSounds.STEREO_LOTUS_BLOSSOM1, ModSounds.STEREO_LOTUS_BLOSSOM2, PlushReg.PLUSH_LOTUS_BLOSSOM, new FabricItemSettings()));
    public static final Item PLUSH_ALOE_VERA = registerItem("plush_aloe_vera",
            new PlushItem(ModSounds.ALOE_VERA1, ModSounds.ALOE_VERA2, ModSounds.STEREO_ALOE_VERA1, ModSounds.STEREO_ALOE_VERA2, PlushReg.PLUSH_ALOE_VERA, new FabricItemSettings()));
    public static final Item PLUSH_OCTAVIA_MELODY = registerItem("plush_octavia_melody",
            new PlushItem(ModSounds.OCTAVIA_MELODY1, ModSounds.OCTAVIA_MELODY2, ModSounds.STEREO_OCTAVIA_MELODY1, ModSounds.STEREO_OCTAVIA_MELODY2, PlushReg.PLUSH_OCTAVIA_MELODY, new FabricItemSettings()));
    public static final Item PLUSH_DJ_PON3 = registerItem("plush_dj_pon3",
            new PlushItem(ModSounds.DJ_PON31, ModSounds.DJ_PON32, ModSounds.STEREO_DJ_PON31, ModSounds.STEREO_DJ_PON32, PlushReg.PLUSH_DJ_PON3, new FabricItemSettings()));
    public static final Item PLUSH_CHEERILEE = registerItem("plush_cheerilee",
            new PlushItem(ModSounds.CHEERILEE1, ModSounds.CHEERILEE2, ModSounds.STEREO_CHEERILEE1, ModSounds.STEREO_CHEERILEE2, PlushReg.PLUSH_CHEERILEE, new FabricItemSettings()));
    public static final Item PLUSH_SPITFIRE = registerItem("plush_spitfire",
            new PlushItem(ModSounds.SPITFIRE1, ModSounds.SPITFIRE2, ModSounds.STEREO_SPITFIRE1, ModSounds.STEREO_SPITFIRE2, PlushReg.PLUSH_SPITFIRE, new FabricItemSettings()));
    public static final Item PLUSH_CHERRY_BERRY = registerItem("plush_cherry_berry",
            new PlushItem(ModSounds.CHERRY_BERRY1, ModSounds.CHERRY_BERRY2, ModSounds.STEREO_CHERRY_BERRY1, ModSounds.STEREO_CHERRY_BERRY2, PlushReg.PLUSH_CHERRY_BERRY, new FabricItemSettings()));
    public static final Item PLUSH_SUGAR_BELLE = registerItem("plush_sugar_belle",
            new PlushItem(ModSounds.SUGAR_BELLE1, ModSounds.SUGAR_BELLE2, ModSounds.STEREO_SUGAR_BELLE1, ModSounds.STEREO_SUGAR_BELLE2, PlushReg.PLUSH_SUGAR_BELLE, new FabricItemSettings()));
    public static final Item PLUSH_TWILIGHT_VELVET = registerItem("plush_twilight_velvet",
            new PlushItem(ModSounds.TWILIGHT_VELVET1, ModSounds.TWILIGHT_VELVET2, ModSounds.STEREO_TWILIGHT_VELVET1, ModSounds.STEREO_TWILIGHT_VELVET2, PlushReg.PLUSH_TWILIGHT_VELVET, new FabricItemSettings()));
    public static final Item PLUSH_LIGHTNING_DUST = registerItem("plush_lightning_dust",
            new PlushItem(ModSounds.LIGHTNING_DUST1, ModSounds.LIGHTNING_DUST2, ModSounds.STEREO_LIGHTNING_DUST1, ModSounds.STEREO_LIGHTNING_DUST2, PlushReg.PLUSH_LIGHTNING_DUST, new FabricItemSettings()));
    public static final Item BOULDER = registerItem("boulder",
            new Item(new FabricItemSettings()));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(Callofequestria_fabricated.MOD_ID, name), item);

    }

    public static void registerItems() {
        Callofequestria_fabricated.LOGGER.info("Registering Items for " + Callofequestria_fabricated.MOD_ID);
    }
}

