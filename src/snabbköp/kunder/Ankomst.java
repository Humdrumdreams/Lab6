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
		state.setKundID(this.getKund().getKundID());
		state.setCurrentEvent(this);
		state.setTime(tid);
		if (state.isSnabbköpÖppet()) {
			if (state.getAntalKunderIButik() < state.getMaxKunder()) {
				eQ.addEvent(new Plock(state, eQ, state.getPlockTid(), kund));
				state.ökaAntalKunderIButik();
				
				state.ökaTotalAntalKunder();
			} else state.läggMissadKund();
		}
		Kund nKund = new Kund();
		eQ.addEvent(new Ankomst(state, eQ, state.getAnkomstTid(), nKund));
		this.setEventState(true);
		eQ.remove(this);
	}
	@Override
	public String getName() { return "Ankomst"; }
}
