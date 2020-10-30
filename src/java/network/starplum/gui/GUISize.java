public enum GUISize {
	
	ROW1(9),
	ROW2(18),
	ROW3(27),
	ROW4(36),
	ROW5(45),
	ROW6(54),
	
	NORMAL(27),
	STAFFMODULE(9),
	
	;

	private int size;
	private GUISize(int size) { this.size = size; }
	public int getSize() { return size; }
	
}
