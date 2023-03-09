package Lab6.snabbköp.kunder;

import Lab6.generellSim.Event;
import Lab6.generellSim.EventQueue;
import Lab6.snabbköp.Snabbköp;
import Lab6.snabbköp.SnabbköpState;

public class Betalning extends Event{
	int tid;
	SnabbköpState state;
	Snabbköp snabbköp;
	EventQueue eQ;
	public Betalning(SnabbköpState state, Snabbköp snabbköp, EventQueue eQ) {
		super(state, snabbköp, eQ);
		this.state = state;
		this.eQ = eQ;
	}
	
	@Override
	public void createEvent(double lambda, long seed, int kundID) {
		int kButik = state.getAntalKunderIButik();
		state.setAntalKunderIButik(kButik-1);
		int lKassor = state.getAntalLedigaKassor();
		state.setAntalLedigaKassor(lKassor+1);
		state.setAntalKunderSomHandlat();
	}
}
