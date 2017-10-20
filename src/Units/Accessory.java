package Units;

public class Accessory {
	private String partNumber;
	private String partName;
	private String serialNumber;
	private Accessory[] componentList;
	
	public Accessory(String partNumber, String partName, String serialNumber) {
		this.partNumber = partNumber;
		this.partName = partName;
		this.serialNumber = serialNumber;
	}

	public Accessory(String partNumber, String partName, String serialNumber, Accessory[] componentList) {
		this.partNumber = partNumber;
		this.partName = partName;
		this.serialNumber = serialNumber;
		this.componentList = componentList;
	}
}
