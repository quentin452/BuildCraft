package buildcraft.api.items;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.item.ItemStack;

public interface IItemCustomPipeRender {
    float getPipeRenderScale(ItemStack stack);

    /**
     *
     * @return False to use the default renderer, true otherwise.
     */
    @SideOnly(Side.CLIENT)
    boolean renderItemInPipe(ItemStack stack, double x, double y, double z);
}
