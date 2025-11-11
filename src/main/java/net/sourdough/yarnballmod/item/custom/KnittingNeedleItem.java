package net.sourdough.yarnballmod.item.custom;

import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.ActionResult;
import net.minecraft.world.World;
import net.sourdough.yarnballmod.block.ModBlocks;

import java.util.HashMap;
import java.util.Map;

// add new Item called Knitting needles
public class KnittingNeedleItem extends Item {

    // turn wool blocks into yarn_blocks by using the knitting_needle_item
    private static final Map<Block, Block> KNITTING_NEEDLE_MAP =
            Map.ofEntries(
                    Map.entry(Blocks.BLACK_WOOL, ModBlocks.BLACK_YARN_BLOCK),
                    Map.entry(Blocks.BLUE_WOOL, ModBlocks.BLUE_YARN_BLOCK),
                    Map.entry(Blocks.BROWN_WOOL, ModBlocks.BROWN_YARN_BLOCK),
                    Map.entry(Blocks.CYAN_WOOL, ModBlocks.CYAN_YARN_BLOCK),
                    Map.entry(Blocks.GREEN_WOOL, ModBlocks.GREEN_YARN_BLOCK),
                    Map.entry(Blocks.GRAY_WOOL, ModBlocks.GREY_YARN_BLOCK),
                    Map.entry(Blocks.LIGHT_BLUE_WOOL, ModBlocks.LIGHT_BLUE_YARN_BLOCK),
                    Map.entry(Blocks.LIGHT_GRAY_WOOL, ModBlocks.LIGHT_GREY_YARN_BLOCK),
                    Map.entry(Blocks.LIME_WOOL, ModBlocks.LIME_YARN_BLOCK),
                    Map.entry(Blocks.MAGENTA_WOOL, ModBlocks.MAGENTA_YARN_BLOCK),
                    Map.entry(Blocks.ORANGE_WOOL, ModBlocks.ORANGE_YARN_BLOCK),
                    Map.entry(Blocks.PINK_WOOL, ModBlocks.PINK_YARN_BLOCK),
                    Map.entry(Blocks.PURPLE_WOOL, ModBlocks.PURPLE_YARN_BLOCK),
                    Map.entry(Blocks.RED_WOOL, ModBlocks.RED_YARN_BLOCK),
                    Map.entry(Blocks.WHITE_WOOL,  ModBlocks.WHITE_YARN_BLOCK),
                    Map.entry(Blocks.YELLOW_WOOL, ModBlocks.YELLOW_YARN_BLOCK)
            );

    public KnittingNeedleItem(Settings settings) {
        super(settings);
    }

    // CHECK THIS AGAIN!
    @Override
    public ActionResult useOnBlock(ItemUsageContext context) {
        World world = context.getWorld();
        Block clickedBlock = context.getBlockState(context.getBlockPos()).getBlock();

        // check
        if (KNITTING_NEEDLE_MAP.containsKey(clickedBlock)) {
            // what if we are on server
            if (!world.isClient) {
                // we are on the server

                //change the block at this position
                world.setBlockState(context.getBlockPos(), KNITTING_NEEDLE_MAP.get(clickedBlock).getDefaultState());

                context.getStack().damage(1, ((ServerWorld) world), ((ServerPlayerEntity) context.getPlayer()),
                        item -> context.getPlayer().sendEquipmentBreakStatus(item, EquipmentSlot.MAINHAND));

                world.playSound(null, context.getBlockPos()), SoundEvents.BLOCK_GRINDSTONE_USE, SoundCategory.BLOCKS;
            }
        }

        return ActionResult.SUCCESS;
    }
}
