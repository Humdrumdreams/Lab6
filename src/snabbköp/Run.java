package Lab6.snabbköp;

import Lab6.generellSim.Event;
import Lab6.generellSim.EventQueue;
import Lab6.snabbköp.kunder.Ankomst;
import Lab6.snabbköp.kunder.Kund;
public class Run extends Event {
	private Kund kund;
	

	public Run(SnabbköpState state, EventQueue eQ, double tid) {
		super(state, eQ, tid);
		this.kund = new Kund();
	}

	@Override
	public void createEvent() {
		System.out.println("RUN CREATE EVENT");
		state.setCurrentEvent(this);
		this.eQ.addEvent(new Ankomst(state, eQ, state.getAnkomstTid(), this.kund));
		state.ökaTotalAntalKunder();
		this.setEventState(true);
		eQ.remove(0);
	}

	@Override
	public String getName() { state.setCurrentEvent(this);  return "Start"; }
}