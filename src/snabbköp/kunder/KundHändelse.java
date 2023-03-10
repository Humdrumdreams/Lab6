package Lab6.snabbköp.kunder;

import Lab6.generellSim.Event;
import Lab6.generellSim.EventQueue;
import Lab6.snabbköp.SnabbköpState;

public abstract class KundHändelse extends Event {
	protected Kund kund;

	public KundHändelse(SnabbköpState state, EventQueue eQ, double tid, Kund kund) {
		super(state, eQ, tid);
		this.kund = kund;
	}

	@Override
	public abstract void createEvent();

	@Override
	public abstract String getName();
	public Kund getKund() { return this.kund; }

}
