package Units;

public class PairOfKnodes extends Unit{
	private Server[] pair = new Server[2];
	
	public PairOfKnodes (Server kNode1, Server kNode2) {
		pair[0] = kNode1;
		pair[1] = kNode2;
	}
}
