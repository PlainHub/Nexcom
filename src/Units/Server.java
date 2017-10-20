package Units;

public class Server extends Unit{
	
	private int serialNumber;
	private int kCSNumber;
	private String fRUType;
	private int knodeNumber;
	private int[] kCSNumberHistory;
	
	// Construct a server with only serial number.
	Server (int serialNumber){
		this.serialNumber = serialNumber;
	}
	
	// Construct a server with serial number and KCS number
	Server (int serialNumber, int kCSNumber){
		this.serialNumber = serialNumber;
		this.kCSNumber = kCSNumber;
	}
}
