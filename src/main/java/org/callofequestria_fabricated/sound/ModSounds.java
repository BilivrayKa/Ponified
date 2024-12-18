package org.callofequestria_fabricated.sound;

import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;
import org.callofequestria_fabricated.Callofequestria_fabricated;

public class ModSounds {

    public static final SoundEvent YAY = registerSound("yay");
    public static final SoundEvent YAY2 = registerSound("yay2");

    public static final SoundEvent PINKIE1 = registerSound("pinkie1");
    public static final SoundEvent PINKIE2 = registerSound("pinkie2");
    public static final SoundEvent SQUEE1 = registerSound("squee1");
    public static final SoundEvent SQUEE2 = registerSound("squee2");
    public static final SoundEvent SQUEE3 = registerSound("squee3");
    public static final SoundEvent ROSE1 = registerSound("rose1");
    public static final SoundEvent ROSE2 = registerSound("rose2");
    public static final SoundEvent APPLEJACK1 = registerSound("applejack1");
    public static final SoundEvent APPLEJACK2 = registerSound("applejack2");
    public static final SoundEvent RAINBOW_DASH1 = registerSound("rainbow_dash1");
    public static final SoundEvent RAINBOW_DASH2 = registerSound("rainbow_dash2");
    public static final SoundEvent RARITY1 = registerSound("rarity1");
    public static final SoundEvent RARITY2 = registerSound("rarity2");
    public static final SoundEvent SPARKLE1 = registerSound("sparkle1");
    public static final SoundEvent SPARKLE2 = registerSound("sparkle2");
    public static final SoundEvent DERPY1 = registerSound("derpy1");
    public static final SoundEvent DERPY2 = registerSound("derpy2");
    public static final SoundEvent STARLIGHT1 = registerSound("starlight1");
    public static final SoundEvent STARLIGHT2 = registerSound("starlight2");
    public static final SoundEvent TRIXIE1 = registerSound("trixie1");
    public static final SoundEvent TRIXIE2 = registerSound("trixie2");
    public static final SoundEvent SWIRL1 = registerSound("swirl1");
    public static final SoundEvent SWIRL2 = registerSound("swirl2");
    public static final SoundEvent MINUETTE1 = registerSound("minuette1");
    public static final SoundEvent MINUETTE2 = registerSound("minuette2");
    public static final SoundEvent MAUD_PIE1 = registerSound("maud_pie1");
    public static final SoundEvent MAUD_PIE2 = registerSound("maud_pie2");
    public static final SoundEvent MARBLE_PIE1 = registerSound("marble_pie1");
    public static final SoundEvent MARBLE_PIE2 = registerSound("marble_pie2");
    public static final SoundEvent DARING_DO1 = registerSound("daring_do1");
    public static final SoundEvent DARING_DO2 = registerSound("daring_do2");
    public static final SoundEvent GRANNY_SMITH1 = registerSound("granny_smith1");
    public static final SoundEvent GRANNY_SMITH2 = registerSound("granny_smith2");
    public static final SoundEvent LIMESTONE_PIE1 = registerSound("limestone_pie1");
    public static final SoundEvent LIMESTONE_PIE2 = registerSound("limestone_pie2");
    public static final SoundEvent NURSE_REDHEART1 = registerSound("nurse_redheart1");
    public static final SoundEvent NURSE_REDHEART2 = registerSound("nurse_redheart2");
    public static final SoundEvent LILY_VALLEY1 = registerSound("lily_valley1");
    public static final SoundEvent LILY_VALLEY2 = registerSound("lily_valley2");
    public static final SoundEvent DAISY1 = registerSound("daisy1");
    public static final SoundEvent DAISY2 = registerSound("daisy2");
    public static final SoundEvent LOTUS_BLOSSOM1 = registerSound("lotus_blossom1");
    public static final SoundEvent LOTUS_BLOSSOM2 = registerSound("lotus_blossom2");
    public static final SoundEvent ALOE_VERA1 = registerSound("aloe_vera1");
    public static final SoundEvent ALOE_VERA2 = registerSound("aloe_vera2");
    public static final SoundEvent OCTAVIA_MELODY1 = registerSound("octavia_melody1");
    public static final SoundEvent OCTAVIA_MELODY2 = registerSound("octavia_melody2");
    public static final SoundEvent DJ_PON31 = registerSound("dj_pon31");
    public static final SoundEvent DJ_PON32 = registerSound("dj_pon32");
    public static final SoundEvent CHEERILEE1 = registerSound("cheerilee1");
    public static final SoundEvent CHEERILEE2 = registerSound("cheerilee2");
    public static final SoundEvent SPITFIRE1 = registerSound("spitfire1");
    public static final SoundEvent SPITFIRE2 = registerSound("spitfire2");
    public static final SoundEvent CHERRY_BERRY1 = registerSound("cherry_berry1");
    public static final SoundEvent CHERRY_BERRY2 = registerSound("cherry_berry2");
    public static final SoundEvent SUGAR_BELLE1 = registerSound("sugar_belle1");
    public static final SoundEvent SUGAR_BELLE2 = registerSound("sugar_belle2");
    public static final SoundEvent TWILIGHT_VELVET1 = registerSound("twilight_velvet1");
    public static final SoundEvent TWILIGHT_VELVET2 = registerSound("twilight_velvet2");
    public static final SoundEvent LIGHTNING_DUST1 = registerSound("lightning_dust1");
    public static final SoundEvent LIGHTNING_DUST2 = registerSound("lightning_dust2");

    public static final SoundEvent STEREO_YAY = registerSound("stereo_yay");
    public static final SoundEvent STEREO_YAY2 = registerSound("stereo_yay2");

    public static final SoundEvent STEREO_PINKIE1 = registerSound("stereo_pinkie1");
    public static final SoundEvent STEREO_PINKIE2 = registerSound("stereo_pinkie2");
    public static final SoundEvent STEREO_SQUEE1 = registerSound("stereo_squee1");
    public static final SoundEvent STEREO_SQUEE2 = registerSound("stereo_squee2");
    public static final SoundEvent STEREO_SQUEE3 = registerSound("stereo_squee3");
    public static final SoundEvent STEREO_ROSE1 = registerSound("stereo_rose1");
    public static final SoundEvent STEREO_ROSE2 = registerSound("stereo_rose2");
    public static final SoundEvent STEREO_APPLEJACK1 = registerSound("stereo_applejack1");
    public static final SoundEvent STEREO_APPLEJACK2 = registerSound("stereo_applejack2");
    public static final SoundEvent STEREO_RAINBOW_DASH1 = registerSound("stereo_rainbow_dash1");
    public static final SoundEvent STEREO_RAINBOW_DASH2 = registerSound("stereo_rainbow_dash2");
    public static final SoundEvent STEREO_RARITY1 = registerSound("stereo_rarity1");
    public static final SoundEvent STEREO_RARITY2 = registerSound("stereo_rarity2");
    public static final SoundEvent STEREO_SPARKLE1 = registerSound("stereo_sparkle1");
    public static final SoundEvent STEREO_SPARKLE2 = registerSound("stereo_sparkle2");
    public static final SoundEvent STEREO_DERPY1 = registerSound("stereo_derpy1");
    public static final SoundEvent STEREO_DERPY2 = registerSound("stereo_derpy2");
    public static final SoundEvent STEREO_STARLIGHT1 = registerSound("stereo_starlight1");
    public static final SoundEvent STEREO_STARLIGHT2 = registerSound("stereo_starlight2");
    public static final SoundEvent STEREO_TRIXIE1 = registerSound("stereo_trixie1");
    public static final SoundEvent STEREO_TRIXIE2 = registerSound("stereo_trixie2");
    public static final SoundEvent STEREO_SWIRL1 = registerSound("stereo_swirl1");
    public static final SoundEvent STEREO_SWIRL2 = registerSound("stereo_swirl2");
    public static final SoundEvent STEREO_MINUETTE1 = registerSound("stereo_minuette1");
    public static final SoundEvent STEREO_MINUETTE2 = registerSound("stereo_minuette2");
    public static final SoundEvent STEREO_MAUD_PIE1 = registerSound("stereo_maud_pie1");
    public static final SoundEvent STEREO_MAUD_PIE2 = registerSound("stereo_maud_pie2");
    public static final SoundEvent STEREO_MARBLE_PIE1 = registerSound("stereo_marble_pie1");
    public static final SoundEvent STEREO_MARBLE_PIE2 = registerSound("stereo_marble_pie2");
    public static final SoundEvent STEREO_DARING_DO1 = registerSound("stereo_daring_do1");
    public static final SoundEvent STEREO_DARING_DO2 = registerSound("stereo_daring_do2");
    public static final SoundEvent STEREO_GRANNY_SMITH1 = registerSound("stereo_granny_smith1");
    public static final SoundEvent STEREO_GRANNY_SMITH2 = registerSound("stereo_granny_smith2");
    public static final SoundEvent STEREO_LIMESTONE_PIE1 = registerSound("stereo_limestone_pie1");
    public static final SoundEvent STEREO_LIMESTONE_PIE2 = registerSound("stereo_limestone_pie2");
    public static final SoundEvent STEREO_NURSE_REDHEART1 = registerSound("stereo_nurse_redheart1");
    public static final SoundEvent STEREO_NURSE_REDHEART2 = registerSound("stereo_nurse_redheart2");
    public static final SoundEvent STEREO_LILY_VALLEY1 = registerSound("stereo_lily_valley1");
    public static final SoundEvent STEREO_LILY_VALLEY2 = registerSound("stereo_lily_valley2");
    public static final SoundEvent STEREO_DAISY1 = registerSound("stereo_daisy1");
    public static final SoundEvent STEREO_DAISY2 = registerSound("stereo_daisy2");
    public static final SoundEvent STEREO_LOTUS_BLOSSOM1 = registerSound("stereo_lotus_blossom1");
    public static final SoundEvent STEREO_LOTUS_BLOSSOM2 = registerSound("stereo_lotus_blossom2");
    public static final SoundEvent STEREO_ALOE_VERA1 = registerSound("stereo_aloe_vera1");
    public static final SoundEvent STEREO_ALOE_VERA2 = registerSound("stereo_aloe_vera2");
    public static final SoundEvent STEREO_OCTAVIA_MELODY1 = registerSound("stereo_octavia_melody1");
    public static final SoundEvent STEREO_OCTAVIA_MELODY2 = registerSound("stereo_octavia_melody2");
    public static final SoundEvent STEREO_DJ_PON31 = registerSound("stereo_dj_pon31");
    public static final SoundEvent STEREO_DJ_PON32 = registerSound("stereo_dj_pon32");
    public static final SoundEvent STEREO_CHEERILEE1 = registerSound("stereo_cheerilee1");
    public static final SoundEvent STEREO_CHEERILEE2 = registerSound("stereo_cheerilee2");
    public static final SoundEvent STEREO_SPITFIRE1 = registerSound("stereo_spitfire1");
    public static final SoundEvent STEREO_SPITFIRE2 = registerSound("stereo_spitfire2");
    public static final SoundEvent STEREO_CHERRY_BERRY1 = registerSound("stereo_cherry_berry1");
    public static final SoundEvent STEREO_CHERRY_BERRY2 = registerSound("stereo_cherry_berry2");
    public static final SoundEvent STEREO_SUGAR_BELLE1 = registerSound("stereo_sugar_belle1");
    public static final SoundEvent STEREO_SUGAR_BELLE2 = registerSound("stereo_sugar_belle2");
    public static final SoundEvent STEREO_TWILIGHT_VELVET1 = registerSound("stereo_twilight_velvet1");
    public static final SoundEvent STEREO_TWILIGHT_VELVET2 = registerSound("stereo_twilight_velvet2");
    public static final SoundEvent STEREO_LIGHTNING_DUST1 = registerSound("stereo_lightning_dust1");
    public static final SoundEvent STEREO_LIGHTNING_DUST2 = registerSound("stereo_lightning_dust2");


    private static SoundEvent registerSound(String name) {
        Identifier id = new Identifier(Callofequestria_fabricated.MOD_ID, name);
        return Registry.register(Registries.SOUND_EVENT, id, SoundEvent.of(id));
    }

    public static void registerSounds() {
        Callofequestria_fabricated.LOGGER.info("Registering Sounds for " + Callofequestria_fabricated.MOD_ID);
    }
}
