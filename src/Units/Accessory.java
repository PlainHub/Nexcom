package Units;

public class Accessory extends Unit{
	private Accessory[] compList;
	
	public Accessory(String PartNum, String PartName, String serialNum) {
		super.PN = PartNum;
		super.Des = PartName;
		super.SN = serialNum;
	}

	public Accessory(String PartNum, String PartName, String serialNum, Accessory[] compList) {
		super.PN = PartNum;
		super.Des = PartName;
		super.SN = serialNum;
		this.compList = compList;
	}
}
