package network.starplum.gui;

import org.bukkit.event.inventory.InventoryType;

public enum GUIType {
	
	PLAYER(InventoryType.PLAYER),
	ANVIL(InventoryType.ANVIL),
	BEACON(InventoryType.BEACON),
	BREW(InventoryType.BREWING),
	CRAFTING(InventoryType.WORKBENCH),
	CHEST(InventoryType.CHEST),
	CREATIVE(InventoryType.CREATIVE),
	DISPENSER(InventoryType.DISPENSER),
	DROPPER(InventoryType.DROPPER),
	ENDERCHEST(InventoryType.ENDER_CHEST),
	ENCHANT(InventoryType.ENCHANTING),
	FURNACE(InventoryType.FURNACE),
	HOPPER(InventoryType.HOPPER),
	MERCHANT(InventoryType.MERCHANT),
	SHULKER(InventoryType.SHULKER_BOX)
	
	;
	
	private InventoryType type;
	private GUIType(InventoryType type) { this.type = type; }
	public InventoryType getType() { return type; }
	
	@Override public String toString() { return "Nah, to lazy to actually convert it to a string lol"; }
	
}
