package network.starplum;

import org.bukkit.plugin.java.JavaPlugin;

public class GUIManager extends JavaPlugin {
	
	private static GUIManager manager;
	public static GUIManager getManager() { return manager; }
	
	@Override public void onLoad() {}
	@Override public void onEnable() { manager = this; }
	@Override public void onDisable() {}
	
}
