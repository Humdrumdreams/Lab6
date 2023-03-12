package Lab6.snabbköp.kunder;

import Lab6.generellSim.Event;
import Lab6.generellSim.EventQueue;
import Lab6.snabbköp.SnabbköpState;

public class Ankomst extends KundHändelse {

	public Ankomst ( SnabbköpState state, EventQueue eQ, double tid, Kund kund) {
		super(state, eQ, tid, kund);
	}
	
	@Override
	public void createEvent() {
		state.setCurrentEvent(this);
		if (state.isSnabbköpÖppet()) {
			if (state.getAntalKunderIButik() < state.getMaxKunder()) {
				eQ.addEvent(new Plock(state, eQ, state.getPlockTid(), kund));
				state.ökaAntalKunderIButik();
			} else state.läggMissadKund();
			Kund nKund = new Kund();
			eQ.addEvent(new Ankomst(state, eQ, state.getAnkomstTid(), nKund));
			state.ökaTotalAntalKunder();
		}
		this.setEventState(true);
	}
	@Override
	public String getName() { return "Ankomst"; }
}
