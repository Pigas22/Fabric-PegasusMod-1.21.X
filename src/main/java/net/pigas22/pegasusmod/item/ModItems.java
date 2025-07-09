package net.pigas22.pegasusmod.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.pigas22.pegasusmod.PegasusMod;

public class ModItems {
    public static final Item PEGASUS_SADDLE = registerItem("pegasus_saddle", new Item(new Item.Settings().maxCount(1)));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(PegasusMod.MOD_ID, name), item);
    }

    public static void registerModItems() {
        PegasusMod.LOGGER.info("Registrando os Items do Mod : " + PegasusMod.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
            entries.add(PEGASUS_SADDLE);
        });
    }
}
