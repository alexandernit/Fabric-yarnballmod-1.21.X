package net.sourdough.yarnballmod.block;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.sourdough.yarnballmod.YarnBallMod;

public class ModBlocks {

    // Add Yarn Blocks
    // make yarn block have wool sound
    public static final Block BLACK_YARN_BLOCK = registerBlock("black_yarn_block",
            new Block(AbstractBlock.Settings.create().strength(4f).sounds(BlockSoundGroup.WOOL)));

    public static final Block BLUE_YARN_BLOCK = registerBlock("blue_yarn_block",
            new Block(AbstractBlock.Settings.create().strength(4f).sounds(BlockSoundGroup.WOOL)));

    public static final Block BROWN_YARN_BLOCK = registerBlock("brown_yarn_block",
            new Block(AbstractBlock.Settings.create().strength(4f).sounds(BlockSoundGroup.WOOL)));

    public static final Block CYAN_YARN_BLOCK = registerBlock("cyan_yarn_block",
            new Block(AbstractBlock.Settings.create().strength(4f).sounds(BlockSoundGroup.WOOL)));

    public static final Block GREY_YARN_BLOCK = registerBlock("grey_yarn_block",
            new Block(AbstractBlock.Settings.create().strength(4f).sounds(BlockSoundGroup.WOOL)));

    public static final Block GREEN_YARN_BLOCK = registerBlock("green_yarn_block",
            new Block(AbstractBlock.Settings.create().sounds(BlockSoundGroup.WOOL).strength(4f)));

    public static final Block LIGHT_BLUE_YARN_BLOCK = registerBlock("light_blue_yarn_block",
            new Block(AbstractBlock.Settings.create().strength(4f).sounds(BlockSoundGroup.WOOL)));

    public static final Block LIGHT_GREY_YARN_BLOCK = registerBlock("light_grey_yarn_block",
            new Block(AbstractBlock.Settings.create().strength(4f).sounds(BlockSoundGroup.WOOL)));

    public static final Block LIME_YARN_BLOCK = registerBlock("lime_yarn_block",
            new Block(AbstractBlock.Settings.create().sounds(BlockSoundGroup.WOOL).strength(4f)));

    public static final Block MAGENTA_YARN_BLOCK = registerBlock("magenta_yarn_block",
            new Block(AbstractBlock.Settings.create().sounds(BlockSoundGroup.WOOL).strength(4f)));

    public static final Block ORANGE_YARN_BLOCK = registerBlock("orange_yarn_block",
            new Block(AbstractBlock.Settings.create().sounds(BlockSoundGroup.WOOL).strength(4f)));

    public static final Block PINK_YARN_BLOCK = registerBlock("pink_yarn_block",
            new Block(AbstractBlock.Settings.create().sounds(BlockSoundGroup.WOOL).strength(4f)));

    public static final Block PURPLE_YARN_BLOCK = registerBlock("purple_yarn_block",
            new Block(AbstractBlock.Settings.create().sounds(BlockSoundGroup.WOOL).strength(4f)));

    public static final Block RED_YARN_BLOCK = registerBlock("red_yarn_block",
            new Block(AbstractBlock.Settings.create().sounds(BlockSoundGroup.WOOL).strength(4f)));

    public static final Block WHITE_YARN_BLOCK = registerBlock("white_yarn_block",
            new Block(AbstractBlock.Settings.create().sounds(BlockSoundGroup.WOOL).strength(4f)));

    public static final Block YELLOW_YARN_BLOCK = registerBlock("yellow_yarn_block",
            new Block(AbstractBlock.Settings.create().sounds(BlockSoundGroup.WOOL).strength(4f)));

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(YarnBallMod.MOD_ID, name), block);
    }

    //register associated item
    private static void registerBlockItem(String name, Block block) {
        Registry.register(Registries.ITEM, Identifier.of(YarnBallMod.MOD_ID, name),
                new BlockItem(block, new Item.Settings()));
    }

    public static void registerModBlocks() {
        YarnBallMod.LOGGER.info("Registering ModBlocks for " +  YarnBallMod.MOD_ID);

        // add Yarn Blocks as Building Blocks?
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> {
            entries.add(BLACK_YARN_BLOCK);
            entries.add(BLUE_YARN_BLOCK);
            entries.add(CYAN_YARN_BLOCK);
            entries.add(GREEN_YARN_BLOCK);
            entries.add(LIGHT_BLUE_YARN_BLOCK);
            entries.add(LIGHT_GREY_YARN_BLOCK);
            entries.add(LIME_YARN_BLOCK);
            entries.add(MAGENTA_YARN_BLOCK);
            entries.add(ORANGE_YARN_BLOCK);
            entries.add(PINK_YARN_BLOCK);
            entries.add(PURPLE_YARN_BLOCK);
            entries.add(RED_YARN_BLOCK);
            entries.add(WHITE_YARN_BLOCK);
            entries.add(YELLOW_YARN_BLOCK);
        });
    }
}
