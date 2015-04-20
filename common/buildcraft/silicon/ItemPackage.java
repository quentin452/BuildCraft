package buildcraft.silicon;

import java.util.List;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.IRecipe;
import net.minecraft.nbt.NBTTagCompound;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import buildcraft.core.lib.items.ItemBuildCraft;
import buildcraft.core.lib.utils.NBTUtils;
import buildcraft.silicon.render.PackageFontRenderer;

public class ItemPackage extends ItemBuildCraft {
	public ItemPackage() {
		super();
		setMaxStackSize(1);
	}

	@Override
	@SideOnly(Side.CLIENT)
	public void getSubItems(Item item, CreativeTabs tab, List list) {

	}

	public static IRecipe getRecipe(ItemStack stack) {
		return null;
	}

	public static void update(ItemStack stack) {

	}

	@Override
	@SideOnly(Side.CLIENT)
	public FontRenderer getFontRenderer(ItemStack stack) {
		return new PackageFontRenderer(stack);
	}

	@SideOnly(Side.CLIENT)
	public void addInformation(ItemStack stack, EntityPlayer player, List strings, boolean adv) {
		NBTTagCompound tag = NBTUtils.getItemData(stack);
		if (!tag.hasNoTags()) {
			strings.add("|S0 |S1 |S2");
			strings.add("|S3 |S4 |S5");
			strings.add("|S6 |S7 |S8");
		}
	}
}
