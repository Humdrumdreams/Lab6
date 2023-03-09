package Lab6.generellSim;

import Lab6.snabbköp.Snabbköp;
import Lab6.snabbköp.SnabbköpState;

public abstract class CreateObject {

	public int objectID;
	public SnabbköpState state;
	public Snabbköp snabbköp;
	public EventQueue eQ;
	public CreateObject(int objectID, SnabbköpState state, Snabbköp snabbköp, EventQueue eQ) {
		this.objectID = objectID;
		this.state = state;
		this.snabbköp = snabbköp;
		this.eQ = eQ;
	}

	public abstract void create();
}
