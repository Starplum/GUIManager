package network.starplum.gui;

import java.util.HashMap;
import java.util.Map;

import org.bukkit.entity.HumanEntity;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.inventory.InventoryCloseEvent;
import org.bukkit.event.inventory.InventoryDragEvent;
import org.bukkit.event.inventory.InventoryInteractEvent;
import org.bukkit.event.inventory.InventoryOpenEvent;
import org.bukkit.event.inventory.InventoryCreativeEvent;

public abstract class GUI {

	private static Map<GUI, String> guis = new HashMap<GUI, String>();
	public static Map<GUI, String> getGuis() { return guis; }
	
	protected abstract String ID();
	
	protected abstract void constructor();
	protected abstract void init();
	
	public abstract void inventoryClickEvent(InventoryClickEvent inventoryClickEvent);
	public abstract void inventoryDragEvent(InventoryDragEvent inventoryDragEvent);
	public abstract void inventoryOpenEvent(InventoryOpenEvent inventoryOpenEvent);
	public abstract void inventoryCloseEvent(InventoryCloseEvent inventoryCloseEvent);
	public abstract void inventoryCreativeEvent(InventoryCreativeEvent inventoryCreativeEvent);
	public abstract void inventoryInteractEvent(InventoryInteractEvent inventoryInteractEvent);
	
	public abstract void closeInventory(HumanEntity humanEntity);
	public abstract void openInventory(HumanEntity humanEntity);
	
}
