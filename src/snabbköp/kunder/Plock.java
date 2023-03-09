package Lab6.snabbköp.kunder;

import Lab6.generellSim.Event;
import Lab6.generellSim.EventQueue;
import Lab6.randomNum.ExponentialRandomStream;
import Lab6.snabbköp.Snabbköp;
import Lab6.snabbköp.SnabbköpState;

public class Plock extends Event{
	double tid;
	public Plock( SnabbköpState state, Snabbköp snabbköp, EventQueue eQ) {
		super(state, snabbköp, eQ);
	}

	@Override
	public void createEvent(double lambda, long seed, int kundID) {
		ExponentialRandomStream xrs = new ExponentialRandomStream(lambda);
		this.tid = xrs.next();
		state.getKassaKöFIFO().add(kundID);
		int kundKö = state.getAntalKunderSomKöat()+1;
		state.setAntalKunderSomKöat(kundKö);
		state.getKassaKöFIFO().ordnaKö();
	}
}
