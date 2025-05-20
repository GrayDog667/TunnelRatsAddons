package com.grayson.traddons.item;

import com.grayson.traddons.TunnelRatsAddons;
import com.grayson.traddons.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup MODDED_ITEMS_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(TunnelRatsAddons.MOD_ID, "modded_items"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.SWIFT_BOOTS))
                    .displayName(Text.translatable("itemgroup.traddons.modded_items"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.SWIFT_BOOTS);
                        entries.add(ModItems.TITANIUM);
                        entries.add(ModBlocks.TITANIUM_BLOCK);

                    }).build());




    public static void registerItemGroups() {
        TunnelRatsAddons.LOGGER.info("Registering Item Groups for " + TunnelRatsAddons.MOD_ID);
    }
}
