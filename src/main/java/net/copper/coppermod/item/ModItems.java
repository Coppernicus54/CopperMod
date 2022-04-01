package net.copper.coppermod.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.copper.coppermod.CopperMod;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {
    public static final Item BRONZE_INGOT = registerItem("bronze_ingot",
            new Item(new FabricItemSettings().group(ModItemGroup.BRONZE)));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(CopperMod.MOD_ID, name), item);
    }

    public static void registerModItems() {
        CopperMod.LOGGER.info("Registering Mod Items for " + CopperMod.MOD_ID);
    }
}
