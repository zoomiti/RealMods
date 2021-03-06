package com.zoomiti.realcore.objects.blocks;

import com.zoomiti.realcore.RealCore;
import com.zoomiti.realcore.init.CoreModBlocks;
import com.zoomiti.realcore.init.CoreModCreativeTabs;
import com.zoomiti.realcore.init.CoreModItems;
import com.zoomiti.realcore.util.interfaces.IHasModel;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;

public class BlockBase extends Block implements IHasModel {

	public BlockBase(String name, Material materialIn) {
		super(materialIn);	
		
		setUnlocalizedName(name);
		setRegistryName(name);
		init();

		CoreModBlocks.BLOCKS.add(this);
		CoreModItems.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
	}

	protected void init() {
		setCreativeTab(CoreModCreativeTabs.RealCoreMaterialsTab);
	}

	@Override
	public void registerModels() {
		RealCore.PROXY.registerItemRenderer(Item.getItemFromBlock(this), 0, "inventory");
	}
}
