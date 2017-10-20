package Units;

public class Kblock {
	private PairOfKnodes[] PON;
	private JBOD[] shelf;
	private PairofSwitch POS;
	
	public Kblock(PairOfKnodes[] PON, JBOD[] shelf) {
		this.PON = PON;
		this.shelf = shelf;
	}
	
	public Kblock(PairOfKnodes[] PON, JBOD[] shelf, PairofSwitch POS) {
		this.PON = PON;
		this.shelf = shelf;
		this.POS = POS;
	}
}
