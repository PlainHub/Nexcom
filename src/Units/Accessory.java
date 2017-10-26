package Units;

public class Accessory extends Unit{
	private Accessory[] compList;
	
	// constructor for single accessory
	public Accessory(String PartNum, String PartName, String serialNum) {
		super.PN = PartNum;
		super.Des = PartName;
		super.SN = serialNum;
	}

	// constructor for accessory kit
	public Accessory(String PartNum, String PartName, String serialNum, Accessory[] compList) {
		super.PN = PartNum;
		super.Des = PartName;
		super.SN = serialNum;
		this.compList = compList;
	}
}
