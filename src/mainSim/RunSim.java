package Lab6.mainSim;

import Lab6.generellSim.Sim;
import Lab6.snabbköpSim.Snabbkop;
import Lab6.snabbköpSim.SnabbkopState;
import Lab6.snabbköpSim.Kunder.Ankomst;
import Lab6.snabbköpSim.Kunder.KundID;

public class RunSim {
	public static int maxAntal = 100;	
	public static void main(String[] args) {
		KundID kID = new KundID();
		kID.kundList.clear();
		Snabbkop ss = new Snabbkop();
		
		ss.setSnabbköpÖppet(true);
		ss.setAntalKunderIButik(1);
		
		SnabbkopState sss = new SnabbkopState();
		Ankomst ankomst = new Ankomst(sss );
		
		ankomst.createEvent(12, 1234);
		System.out.println("\t"+sss.getTidAnkomst());

	}

}
