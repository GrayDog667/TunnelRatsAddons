package com.grayson.traddons.item;

import com.grayson.traddons.TunnelRatsAddons;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item SWIFT_BOOTS = registerItem("swift_boots", new Item(new Item.Settings()
            .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(TunnelRatsAddons.MOD_ID, "swift_boots")))));
    public static final Item TITANIUM = registerItem("titanium", new Item(new Item.Settings()
            .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(TunnelRatsAddons.MOD_ID, "titanium")))));


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(TunnelRatsAddons.MOD_ID, name), item);
    }

    public static void registerModItems() {
        TunnelRatsAddons.LOGGER.info("Registering Mod Items for " + TunnelRatsAddons.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register(entries -> {
            entries.add(SWIFT_BOOTS);
        });
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
            entries.add(TITANIUM);
        });
    }
}
