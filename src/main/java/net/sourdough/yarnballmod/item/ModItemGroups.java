package net.sourdough.yarnballmod.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.sourdough.yarnballmod.YarnBallMod;
import net.sourdough.yarnballmod.block.ModBlocks;

//adds custom Item Group for YarnBall and YarnBallBlock
public class ModItemGroups {

    public static final ItemGroup YARN_BALL_ITEMS_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(YarnBallMod.MOD_ID, "yarn_ball_items"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.BLACK_YARN_BALL))
                    .displayName(Text.translatable("itemgroup.yarn_ball_items.yarn_ball_items"))
                    .entries((displayContext, entries) ->  {
                        entries.add(ModItems.BLACK_YARN_BALL);
                        entries.add(ModItems.BLUE_YARN_BALL);
                        entries.add(ModItems.BROWN_YARN_BALL);
                        entries.add(ModItems.CYAN_YARN_BALL);
                        entries.add(ModItems.GREEN_YARN_BALL);
                        entries.add(ModItems.LIGHT_BLUE_YARN_BALL);
                        entries.add(ModItems.LIGHT_GREY_YARN_BALL);
                        entries.add(ModItems.LIME_YARN_BALL);
                        entries.add(ModItems.MAGENTA_YARN_BALL);
                        entries.add(ModItems.ORANGE_YARN_BALL);
                        entries.add(ModItems.PINK_YARN_BALL);
                        entries.add(ModItems.WHITE_YARN_BALL);
                        entries.add(ModItems.YELLOW_YARN_BALL);
                        entries.add(ModItems.PURPLE_YARN_BALL);
                        entries.add(ModItems.RED_YARN_BALL);
                    }).build());

    public static final ItemGroup YARN_BALL_BLOCKS_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(YarnBallMod.MOD_ID, "yarn_ball_blocks"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModBlocks.BLACK_YARN_BLOCK))
                    .displayName(Text.translatable("itemgroup.yarn_ball_items.yarn_ball_blocks"))
                    .entries((displayContext, entries) ->  {
                        entries.add(ModBlocks.BLACK_YARN_BLOCK);
                        entries.add(ModBlocks.BLUE_YARN_BLOCK);
                        entries.add(ModBlocks.BROWN_YARN_BLOCK);
                        entries.add(ModBlocks.CYAN_YARN_BLOCK);
                        entries.add(ModBlocks.GREEN_YARN_BLOCK);
                        entries.add(ModBlocks.LIGHT_BLUE_YARN_BLOCK);
                        entries.add(ModBlocks.LIGHT_GREY_YARN_BLOCK);
                        entries.add(ModBlocks.LIME_YARN_BLOCK);
                        entries.add(ModBlocks.MAGENTA_YARN_BLOCK);
                        entries.add(ModBlocks.ORANGE_YARN_BLOCK);
                        entries.add(ModBlocks.PINK_YARN_BLOCK);
                        entries.add(ModBlocks.WHITE_YARN_BLOCK);
                        entries.add(ModBlocks.YELLOW_YARN_BLOCK);
                        entries.add(ModBlocks.PURPLE_YARN_BLOCK);
                        entries.add(ModBlocks.RED_YARN_BLOCK);
                    }).build());

    public static void registerItemGroups() {
        YarnBallMod.LOGGER.info("Registering ItemGroups for " + YarnBallMod.MOD_ID);
    }
}
