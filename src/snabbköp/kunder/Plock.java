package Lab6.snabbköp.kunder;

import Lab6.generellSim.Event;
import Lab6.generellSim.EventQueue;
import Lab6.snabbköp.SnabbköpState;

public class Plock extends KundHändelse{
	
	public Plock (SnabbköpState state, EventQueue eQ, double tid, Kund kund) { super(state, eQ, tid, kund); }

	@Override
	public void createEvent() {
		state.setCurrentEvent(this);
		if (state.getAntalLedigaKassor() > 0) {
			eQ.addEvent(new Betalning(state, eQ, state.getBetalningsTid(), kund));
			state.minskaAntalLedigaKassor();
		}
		else {
			state.getKassaKöFIFO().add(this.kund);
		}
	}	
	
	public String getName() { return "Plock"; }
	
}
