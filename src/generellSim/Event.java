package Lab6.generellSim;

import Lab6.snabbköpSim.SnabbkopState;

public abstract class Event {
	
	protected SnabbkopState state;
	
	public Event(SnabbkopState state) {
		// TODO Auto-generated constructor stub
	}

	public abstract void createEvent(double lambda, long seed);
	//Klassen Event måste ha en referens till kön så dessa nya framtida
	//händelser kan lagras med övriga framtida händelser.
	
}
