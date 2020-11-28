package com.regnegade.firstmod.items;

import com.regnegade.firstmod.FirstMod;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;

public class ItemBase extends Item {

    public ItemBase() {
        super(new Item.Properties().group(FirstMod.TAB));
    }
}
