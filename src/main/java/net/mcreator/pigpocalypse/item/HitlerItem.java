
package net.mcreator.pigpocalypse.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class HitlerItem extends Item {
	public HitlerItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
