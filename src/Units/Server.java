package Units;

import java.util.Stack;

/* Use Case:
 	- Load the most recent added KCS number from the KCS number history as the current KCS number.
*/

public class Server extends Unit{
	
	private String FRUType;
	private Stack KCSNumHistory;
	private Accessory[] CPUs; 
	private Accessory[] MemoryCards;
	private Accessory[] SSDs;
	private Accessory PCICard;
	private Accessory SASHBACard;
	private Accessory IBCard;
	
	// empty constructor
	public Server (){
	}
	
	public void AddNewServer(String SN, Accessory[] CPUs, Accessory[] MemoryCards, Accessory[] SSDs,
			Accessory PCICard, Accessory SASHBACard, Accessory IBCard) {
		
	}
	
	public void AddRMAServer(String PartNum, String SerialNum, int KCSNum) {
		
		switch(PartNum) {
		
		case "KITL6KNS08001": super.Des = "Pair of V6 K-node 256GB - S";
			break;
		
		case "KITL6KNS16001": super.Des = "Pair of V6 K-node 516GB - S";
			break;
			
		default: System.out.println("Invalid Part Numbber, System Break.");
			return;
	}
	
		super.PN = PartNum;
		super.SN = SerialNum;
		this.KCSNumHistory.push(KCSNum);
	}
	
	
}
