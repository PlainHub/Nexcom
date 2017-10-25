package Units;

/* Use Case:
	- Load the most recent added KCS number from the KCS number history as the current KCS number.
*/

public class JBOD extends Unit{
	
	private String fRUType;
	private int kCSNumber;
	private int[] kCSNumberHistory;
	
	// New manufactured JBOD
	public JBOD(String SerialNum) {
		super.SN = SerialNum;
	}
	
	// Construct a JBOD with serial number and KCS number.
	public JBOD(String SerialNum, int kCSNumber) {
		super.SN = SerialNum;
		this.kCSNumber = kCSNumber;
	}
	
}
