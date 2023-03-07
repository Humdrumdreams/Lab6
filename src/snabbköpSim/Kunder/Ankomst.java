package Lab6.snabbköpSim.Kunder;

import java.util.ArrayList;

import Lab6.generellSim.Event;
import Lab6.mainSim.RunSim;
import Lab6.snabbköpSim.Snabbkop;
import Lab6.snabbköpSim.SnabbkopState;
import Lab6.randomNum.ExponentialRandomStream;

public class Ankomst extends Event {
	
	public Ankomst (SnabbkopState state) {
		super(state);
	}
	@Override
	public void createEvent(double lambda, long seed) {
		Snabbkop ss = new Snabbkop();
		KundID kID = new KundID();
		Plock plock = new Plock(state);
		ExponentialRandomStream xrs = new ExponentialRandomStream(lambda, seed);
		if (ss.isSnabbköpÖppet()) {
			if (ss.getMaxKunder() < RunSim.maxAntal ) {
				if (kID.kundList.isEmpty()) {
					kID.kundList.add(1);
					state.setTidAnkomst(xrs.next());
					plock.createEvent(lambda, seed);
				}
				else {
					int last = kID.kundList.get(kID.kundList.size()-1);
					kID.kundList.add(last+1);
				}
			}
			else {
				int lost = state.getAntalMissadeKunder();
				state.setAntalMissadeKunder(lost+1);
			}
		}
	}
}
