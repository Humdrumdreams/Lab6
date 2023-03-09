package Lab6.generellSim;

import Lab6.snabbköp.Snabbköp;
import Lab6.snabbköp.SnabbköpState;

public abstract class Event {
	
	protected SnabbköpState state;
	protected Snabbköp snabbköp;
	protected EventQueue eQ;
	
	public Event(SnabbköpState state, Snabbköp snabbköp, EventQueue eQ) {
		this.state = state;
		this.snabbköp = snabbköp;
		this.eQ = eQ;
	}

	public abstract void createEvent(double lambda, long seed, int kundID);
	//Klassen Event måste ha en referens till kön så dessa nya framtida
	//händelser kan lagras med övriga framtida händelser.
	
}
