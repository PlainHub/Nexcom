package Units;

public class PairofSwitch extends Unit{
	private Switch [] SWIPair = new Switch[2];
	
	public PairofSwitch (String SerialNum, Switch switch1, Switch switch2) {
		super.SN = SerialNum;
		SWIPair[0] = switch1;
		SWIPair[1] = switch2;
	}
}
