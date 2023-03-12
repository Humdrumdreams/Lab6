package Lab6.snabbköp;

import java.util.ArrayList;

import Lab6.generellSim.EventQueue;
import Lab6.snabbköp.kunder.Ankomst;
import Lab6.snabbköp.kunder.Kund;

public class Snabbköp {
	SnabbköpState state;
	EventQueue eQ;
	Kund kund;
	
	public ArrayList<Kund> kundList;
	public Snabbköp(SnabbköpState state, ArrayList<Kund> kundList, EventQueue eQ) {
		this.kund = new Kund();
		this.state = state;
		this.kundList = kundList;
		this.eQ = eQ;
	}
	
	public void köTid() {
		while (state.getKassaKöLängd() != 0) {
			for (int i = 0; i <= state.getKassaKöLängd(); i++) {
				state.ökaSummaKöTid();
			}
		}
	}

}