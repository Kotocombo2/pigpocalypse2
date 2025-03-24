
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.pigpocalypse.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.Item;

import net.mcreator.pigpocalypse.item.HitlerItem;
import net.mcreator.pigpocalypse.PigpocalypseMod;

public class PigpocalypseModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, PigpocalypseMod.MODID);
	public static final RegistryObject<Item> HITLER = REGISTRY.register("hitler", () -> new HitlerItem());
	// Start of user code block custom items
	// End of user code block custom items
}
