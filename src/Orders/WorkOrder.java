package Orders;

import Units.Unit;

public class WorkOrder {
	private String wONumber;
	private Unit[] wOUnits;
	
	public WorkOrder(String wONumber, Unit[] wOUnits) {
		this.wONumber = wONumber;
		this.wOUnits = wOUnits;
	}
}
