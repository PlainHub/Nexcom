package Units;

public class PairOfKnodes extends Unit{
	private Server[] pair = new Server[2];
	
	public PairOfKnodes (String SerialNum, Server kNode1, Server kNode2) {
		super.SN = SerialNum;
		pair[0] = kNode1;
		pair[1] = kNode2;
	}
}
