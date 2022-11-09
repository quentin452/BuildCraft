package buildcraft.api.tablet;

import cpw.mods.fml.relauncher.Side;
import net.minecraft.nbt.NBTTagCompound;

public interface ITablet {
    Side getSide();

    void refreshScreen(TabletBitmap data);

    int getScreenWidth();

    int getScreenHeight();

    void launchProgram(String name);

    void sendMessage(NBTTagCompound compound);
}
