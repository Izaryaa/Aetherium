package name.aetherium.item;

import name.aetherium.Aetherium;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {

    public static final Item AETHERIUM_INGOT = registerItem("aetherium_ingot", new Item(new Item.Settings()));
    public static final Item AETHERIUM_SHARD = registerItem("aetherium_shard", new Item(new Item.Settings()));
    public static final Item AETHERIUM_UPGRADE_SMITHING_TEMPLATE = registerItem("aetherium_upgrade_smithing_template", new Item(new Item.Settings()));

private static Item registerItem(String name, Item item) {
    return Registry.register(Registries.ITEM, Identifier.of(Aetherium.MOD_ID, name), item);
}

public static final Item AETHERIUM_SWORD = registerItem("aetherium_sword",
        new SwordItem(ModToolMaterials.AETHERIUM, new Item.Settings()
                .attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterials.AETHERIUM, 3, -2.4f))));
public static final Item AETHERIUM_PICKAXE = registerItem("aetherium_pickaxe",
        new PickaxeItem(ModToolMaterials.AETHERIUM, new Item.Settings()
                .attributeModifiers(PickaxeItem.createAttributeModifiers(ModToolMaterials.AETHERIUM, 1, -2.8f))));
public static final Item AETHERIUM_AXE = registerItem("aetherium_axe",
        new AxeItem(ModToolMaterials.AETHERIUM, new Item.Settings()
                .attributeModifiers(AxeItem.createAttributeModifiers(ModToolMaterials.AETHERIUM, 5, -3.0f))));
public static final Item AETHERIUM_SHOVEL = registerItem("aetherium_shovel",
        new ShovelItem(ModToolMaterials.AETHERIUM, new Item.Settings()
                .attributeModifiers(ShovelItem.createAttributeModifiers(ModToolMaterials.AETHERIUM, 1.5f, -3.0f))));
public static final Item AETHERIUM_HOE = registerItem("aetherium_hoe",
        new HoeItem(ModToolMaterials.AETHERIUM, new Item.Settings()
                .attributeModifiers(HoeItem.createAttributeModifiers(ModToolMaterials.AETHERIUM, -5, -0))));

    public static void registerModItems() {
        Aetherium.LOGGER.info("Registering Mod Items for" + Aetherium.MOD_ID);
    }
}
