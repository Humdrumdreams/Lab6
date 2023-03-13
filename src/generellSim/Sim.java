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
		//eQ.get(0).createEvent();
		//skV.update(ss, eQ);
		while(ss.getIo() && !eQ.isEmpty()) {
			//for (int i = 0; i < eQ.size(); i++) {System.out.println(eQ.get(i).getName());}
			eQ.get(0).createEvent();
			sss.setTime(eQ.get(0).händelseTid());
			eQ.remove(0);
			skV.update(sss, eQ);
			if (sss.getAntalKunderIButik() == 5) { break;}
		}
	}
}
