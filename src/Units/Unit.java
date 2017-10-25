package Units;

public class Unit {
	
	protected String PN; // part name
	protected String Des; // part description
	protected String SN; // part serial number
	
	
	public Unit() {
	}
	
	// New part instance without quantity, Ex: Server, JBOD, 
	public Unit(String PN, String Des, String SN) {
		this.PN = PN;
		this.Des = Des;
		this.SN = SN;
	}
}
