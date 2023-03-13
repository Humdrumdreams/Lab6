package Lab6.mainSim;

import Lab6.generellSim.EventQueue;
import Lab6.snabbköp.KassaKöFIFO;
import Lab6.snabbköp.Run;
import Lab6.snabbköp.SnabbköpState;
import Lab6.snabbköp.SnabbköpView;
import Lab6.snabbköp.Stop;
import Lab6.snabbköp.kunder.Ankomst;
import Lab6.snabbköp.kunder.Kund;
import Lab6.generellSim.Sim;

public class RunSim {
	private SnabbköpState state;
	private EventQueue eQ;
	private Sim sim;
	
	public RunSim(double startTid, double stopTid, double closeTid, double lambda, double kMin,
			double kMax, double pMin, double pMax, long seed, int maxKunder, int maxKassor) {
		this.eQ = new EventQueue();
		this.state = new SnabbköpState(maxKunder, maxKassor, lambda, seed, kMin, kMax, pMin, pMax);
		Run run = new Run(state, eQ, startTid);
		this.eQ.addEvent(run);
		KassaKöFIFO kkF = new KassaKöFIFO(state, eQ);
		state.setKassaKöFIFO(kkF);
		this.eQ.addEvent(new Stop(state, eQ, stopTid));
		state.ökaAntalLedigaKassor();
		//Kund kund = new Kund();
		//this.eQ.addEvent(new Ankomst(state, eQ, state.getAnkomstTid(), kund));
		SnabbköpView view = new SnabbköpView(state, eQ);
		state.setSnabbköpÖppet(true);
		state.addObserver(view);
		sim = new Sim(eQ, state, state);
		state.setCurrentEvent(run);
		
		
		sim.körHändelser();
	}
	
	public SnabbköpState getState() { return this.state; }
	
	public static void main(String[] args) {
		RunSim rSim = new RunSim(0, 10.00, 999, 1.0, 2.0, 3.0, .5, 1.0, 1234, 5, 2);
	}

}
