package Units;

public class JBOD extends Unit{
	
	private int serialNumber;
	private String fRUType;
	private int kCSNumber;
	private int[] kCSNumberHistory;
	
	// Construct a JBOD with only serial number.
	public JBOD(int serialNumber) {
		this.serialNumber = serialNumber;
	}
	
	// Construct a JBOD with serial number and KCS number.
	public JBOD(int serialNumber, int kCSNumber) {
		this.kCSNumber = kCSNumber;
	}
	
}
