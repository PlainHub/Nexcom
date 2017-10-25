package Units;

public class Kblock extends Unit{
	private PairOfKnodes[] PON;
	private JBOD[] shelf;
	private PairofSwitch POS;
	
	// K-Block without switch instance
	public Kblock(PairOfKnodes[] PON, JBOD[] shelf) {
		this.PON = PON;
		this.shelf = shelf;
	}
	
	// K-Block with switch instance
	public Kblock(PairOfKnodes[] PON, JBOD[] shelf, PairofSwitch POS) {
		this.PON = PON;
		this.shelf = shelf;
		this.POS = POS;
	}
}
