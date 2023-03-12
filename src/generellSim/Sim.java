package Lab6.generellSim;

import Lab6.snabbköp.SnabbköpState;
import Lab6.snabbköp.SnabbköpView;

public class Sim {
	EventQueue eQ;
	SimState ss;
	SnabbköpState sss;

	SnabbköpView skV;
	public Sim(EventQueue eQ, SimState ss, SnabbköpState sss) {
		this.eQ = eQ;
		this.ss = ss;
		this.sss = sss;
		skV = new SnabbköpView(sss, eQ);
	}
	
	public void körHändelser() {
		while(ss.getIo() && !eQ.isEmpty()) {
			for (int i = 0; i < eQ.size(); i++) {System.out.println(eQ.get(i).getName());}
			skV.update(ss, eQ);
			if (eQ.get(0).getEventState()) { eQ.get(0).createEvent(); eQ.remove(0); }
		}
	}
}
