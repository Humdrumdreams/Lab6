package Lab6.snabbköp.kunder;

import Lab6.generellSim.Event;
import Lab6.generellSim.EventQueue;
import Lab6.snabbköp.Snabbköp;
import Lab6.snabbköp.SnabbköpState;

public class Betalning extends KundHändelse{
	int tid;
	int ID;
	public Betalning(SnabbköpState state, EventQueue eQ, double tid, Kund kund) { super(state, eQ, tid, kund); }
	
	@Override
	public void createEvent() {
		state.minskaAntalKunderIButik();
		
		state.ökaAntalKunderSomHandlat();
		if (state.getKassaKöFIFO().isEmpty()) {
			eQ.addEvent(new Betalning(state, eQ, state.getBetalningsTid(), kund));
			state.ökaAntalLedigaKassor();
		}
	}

	@Override
	public String getName() { return "Betalning"; }
}
