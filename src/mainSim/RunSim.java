package Lab6.mainSim;

import Lab6.generellSim.EventQueue;
import Lab6.snabbköp.Run;
import Lab6.snabbköp.SnabbköpState;
import Lab6.snabbköp.SnabbköpView;
import Lab6.snabbköp.Stop;
import Lab6.snabbköp.kunder.Ankomst;
import Lab6.snabbköp.kunder.Kund;
import Lab6.generellSim.Sim;

public class RunSim {
	SnabbköpState state;
	EventQueue eQ;
	Sim sim;
	
	public RunSim(double startTid, double stopTid, double closeTid, double lambda, double kMin,
			double kMax, double pMin, double pMax, long seed, int maxKunder, int maxKassor) {
		this.eQ = new EventQueue();
		this.state = new SnabbköpState(maxKunder, maxKassor, lambda, seed, kMin, kMax, pMin, pMax);
		this.eQ.addEvent(new Run(state, eQ, startTid));
		Kund kund = new Kund();
		this.eQ.addEvent(new Ankomst(state, eQ, state.getAnkomstTid(), kund));
		this.eQ.addEvent(new Stop(state, eQ, stopTid));
		SnabbköpView view = new SnabbköpView(state, eQ);
		state.addObserver(view);
		sim = new Sim(eQ, state, state);
		sim.körHändelser();
	}
	
	public static void main(String[] args) {
		RunSim rSim = new RunSim(0, 10.00, 999, 1.0, 2.0, 3.0, .5, 1.0, 1234, 5, 2);
	}

}
