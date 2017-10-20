package Units;

public class PairofSwitch extends Unit{
	private Switch [] pair = new Switch[2];
	
	public PairofSwitch (Switch switch1, Switch switch2) {
		pair[0] = switch1;
		pair[1] = switch2;
	}
}
