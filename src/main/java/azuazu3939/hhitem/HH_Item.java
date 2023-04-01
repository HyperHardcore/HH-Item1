package azuazu3939.hhitem;

import org.bukkit.plugin.java.JavaPlugin;

public final class HH_Item extends JavaPlugin {

    private static HH_Item item;

    @Override
    public void onEnable() {
        item = this;
        // Plugin startup logic

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }

    public static HH_Item inst() {return item;}
}
