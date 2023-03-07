package Lab6.snabbköpSim.Kunder;

import Lab6.generellSim.Event;
import Lab6.snabbköpSim.SnabbkopState;

public class Plock extends Event{
	public Plock(SnabbkopState state) {
		super(state);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void createEvent(double lambda, long seed) {
		if (state.getAntalLedigaKassor() == 0) {
			state.getKassaKöFIFO()
		}
		
	}
}
