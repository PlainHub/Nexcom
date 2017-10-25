package Units;

/* Use Case:
 	- Load the most recent added KCS number from the KCS number history as the current KCS number.
*/

public class Server extends Unit{
	
	private int KCSNum;
	private String FRUType;
	private int K_NodeNum;
	private int[] KCSNumHistory;
	
	//	Newly manufactured server instance.
	Server (String SerialNum){
		super.SN = SerialNum;
	}
	
	// RMA server instance
	Server (String SerialNum, int KCSNum, int K_NodeNum){
		super.SN = SerialNum;
		this.KCSNum = KCSNum;
		this.K_NodeNum = K_NodeNum;
	}
}
