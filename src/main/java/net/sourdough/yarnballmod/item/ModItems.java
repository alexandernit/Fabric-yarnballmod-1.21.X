package net.sourdough.yarnballmod.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.sourdough.yarnballmod.YarnBallMod;

public class ModItems {

    //own idea
    public static final Item BLACK_YARN_BALL = registerItem("black_yarn_ball", new Item(new Item.Settings()));
    public static final Item BLUE_YARN_BALL = registerItem("blue_yarn_ball", new Item(new Item.Settings()));
    public static final Item BROWN_YARN_BALL = registerItem("brown_yarn_ball", new Item(new Item.Settings()));
    public static final Item CYAN_YARN_BALL = registerItem("cyan_yarn_ball", new Item(new Item.Settings()));
    public static final Item GREEN_YARN_BALL = registerItem("green_yarn_ball", new Item(new Item.Settings()));
    public static final Item LIGHT_BLUE_YARN_BALL = registerItem("light_blue_yarn_ball", new Item(new Item.Settings()));
    public static final Item LIGHT_GREY_YARN_BALL = registerItem("light_grey_yarn_ball", new Item(new Item.Settings()));
    public static final Item LIME_YARN_BALL = registerItem("lime_yarn_ball", new Item(new Item.Settings()));
    public static final Item MAGENTA_YARN_BALL = registerItem("magenta_yarn_ball", new Item(new Item.Settings()));
    public static final Item ORANGE_YARN_BALL = registerItem("orange_yarn_ball", new Item(new Item.Settings()));
    public static final Item PINK_YARN_BALL = registerItem("pink_yarn_ball", new Item(new Item.Settings()));
    public static final Item PURPLE_YARN_BALL = registerItem("purple_yarn_ball", new Item(new Item.Settings()));
    public static final Item RED_YARN_BALL = registerItem("red_yarn_ball", new Item(new Item.Settings()));
    public static final Item WHITE_YARN_BALL = registerItem("white_yarn_ball", new Item(new Item.Settings()));
    public static final Item YELLOW_YARN_BALL = registerItem("yellow_yarn_ball", new Item(new Item.Settings()));


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(YarnBallMod.MOD_ID, name), item);
    }

    public static void registerModItems() {
        YarnBallMod.LOGGER.info("Registering ModItems for " + YarnBallMod.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
            entries.add(BLACK_YARN_BALL);
            entries.add(BLUE_YARN_BALL);
            entries.add(BROWN_YARN_BALL);
            entries.add(CYAN_YARN_BALL);
            entries.add(GREEN_YARN_BALL);
            entries.add(LIGHT_BLUE_YARN_BALL);
            entries.add(LIGHT_GREY_YARN_BALL);
            entries.add(LIME_YARN_BALL);
            entries.add(MAGENTA_YARN_BALL);
            entries.add(ORANGE_YARN_BALL);
            entries.add(PINK_YARN_BALL);
            entries.add(PURPLE_YARN_BALL);
            entries.add(RED_YARN_BALL);
            entries.add(WHITE_YARN_BALL);
            entries.add(YELLOW_YARN_BALL);
        });
    }
}
