package com.regnegade.firstmod.util;

import com.regnegade.firstmod.FirstMod;
import com.regnegade.firstmod.blocks.BlockItemBase;
import com.regnegade.firstmod.blocks.EtherealThreadBlock;
import com.regnegade.firstmod.items.ItemBase;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

//contains items, blocks inside of deferred registries
public class RegistryHandler {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, FirstMod.MOD_ID);
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, FirstMod.MOD_ID);

    public static void init() {
        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
        BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }

    //Items
    public static final RegistryObject<Item> ETHEREAL_THREAD = ITEMS.register("ethereal_thread", ItemBase::new);
    public static final RegistryObject<Item> SIMPLE_THREAD = ITEMS.register("simple_thread", ItemBase::new);
    public static final RegistryObject<Item> THICK_THREAD = ITEMS.register("thick_thread", ItemBase::new);

    //Blocks
    public static final RegistryObject<Block> ETHEREAL_THREAD_BLOCK = BLOCKS.register("ethereal_thread_block", EtherealThreadBlock::new);

    //Block Items
    public static final RegistryObject<Item> ETHEREAL_THREAD_BLOCK_ITEM = ITEMS.register("ethereal_thread_block", () -> new BlockItemBase(ETHEREAL_THREAD_BLOCK.get()));

}

