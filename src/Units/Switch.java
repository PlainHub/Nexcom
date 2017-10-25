package Units;

public class Switch extends Unit {
	private int NumofPorts;
	
	public Switch(String SerialNum, int numOfPorts) {
		super.SN = SerialNum;
		
		if (NumofPorts == 12)
			super.Des = "Pair of IB Switch 12P";
		
		else if (NumofPorts == 18) 
			super.Des = "Pair of IB Switch 18P";
		
		else
			System.out.println("Invalid port number, please enter again.");
	}
}
