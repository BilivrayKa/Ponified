package org.callofequestria_fabricated.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import org.callofequestria_fabricated.Callofequestria_fabricated;

public class ModCreativeModTabs {

    public static final ItemGroup PLUSHIES = FabricItemGroup.builder()
            .displayName(Text.translatable("itemGroup.callofequestria_fabricated.plushies_tab"))
            .icon(() -> new ItemStack(ModItems.PLUSH_ALOE_VERA))
            .entries((displayContext, entries) -> {
                entries.add(ModItems.PLUSH_PINKIE_PIE);
                entries.add(ModItems.PLUSH_ROSE);
                entries.add(ModItems.PLUSH_FLUTTERSHY);
                entries.add(ModItems.PLUSH_APPLEJACK);
                entries.add(ModItems.PLUSH_RAINBOW_DASH);
                entries.add(ModItems.PLUSH_RARITY);
                entries.add(ModItems.PLUSH_SPARKLE);
                entries.add(ModItems.PLUSH_DERPY);
                entries.add(ModItems.PLUSH_STARLIGHT);
                entries.add(ModItems.PLUSH_TRIXIE);
                entries.add(ModItems.PLUSH_SWIRL);
                entries.add(ModItems.PLUSH_MINUETTE);
                entries.add(ModItems.PLUSH_MAUD_PIE);
                entries.add(ModItems.PLUSH_MARBLE_PIE);
                entries.add(ModItems.PLUSH_DARING_DO);
                entries.add(ModItems.PLUSH_GRANNY_SMITH);
                entries.add(ModItems.PLUSH_LIMESTONE_PIE);
                entries.add(ModItems.PLUSH_NURSE_REDHEART);
                entries.add(ModItems.PLUSH_LILY_VALLEY);
                entries.add(ModItems.PLUSH_DAISY);
                entries.add(ModItems.PLUSH_LOTUS_BLOSSOM);
                entries.add(ModItems.PLUSH_ALOE_VERA);
                entries.add(ModItems.PLUSH_OCTAVIA_MELODY);
                entries.add(ModItems.PLUSH_DJ_PON3);
                entries.add(ModItems.PLUSH_CHEERILEE);
                entries.add(ModItems.PLUSH_SPITFIRE);
                entries.add(ModItems.PLUSH_CHERRY_BERRY);
                entries.add(ModItems.PLUSH_SUGAR_BELLE);
                entries.add(ModItems.PLUSH_TWILIGHT_VELVET);
                entries.add(ModItems.PLUSH_LIGHTNING_DUST);
            })
            .build();

    public static void registerItemGroups() {
        Registry.register(Registries.ITEM_GROUP, new Identifier(Callofequestria_fabricated.MOD_ID, "plushies"), PLUSHIES);
    }
}
