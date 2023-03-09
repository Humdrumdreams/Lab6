package Lab6.snabbköp.kunder;

import java.util.ArrayList;

import Lab6.generellSim.Event;
import Lab6.generellSim.EventQueue;
import Lab6.mainSim.RunSim;
import Lab6.randomNum.ExponentialRandomStream;
import Lab6.snabbköp.Snabbköp;
import Lab6.snabbköp.SnabbköpState;

public class Ankomst extends Event {
	double tid;	
	public Ankomst ( SnabbköpState state, Snabbköp snabbköp, EventQueue eQ) {
		super(state, snabbköp, eQ);
	}
	@Override
	public void createEvent(double lambda, long seed, int kundID) {
		//Plock plock = new Plock(state);
		ExponentialRandomStream xrs = new ExponentialRandomStream(lambda);
		this.tid = xrs.next();
		if (state.isSnabbköpÖppet()) {
			if (state.getMaxKunder() < RunSim.maxAntal ) {
				state.setTidAnkomst(xrs.next());
				Plock plock = new Plock(state, snabbköp, eQ);
				plock.createEvent(lambda, seed, kundID);
			}
			else {
				int lost = state.getAntalMissadeKunder();
				state.setAntalMissadeKunder(lost+1);
			}
			int listSize = snabbköp.kundList.size();
			KundID newKund = new KundID(listSize+1, state, snabbköp, eQ);
			snabbköp.kundList.add(newKund);
			newKund.create();
		}
	}
}
