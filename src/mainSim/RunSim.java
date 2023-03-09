package Lab6.mainSim;

import java.util.ArrayList;

import Lab6.generellSim.Event;
import Lab6.generellSim.EventQueue;
import Lab6.generellSim.Sim;
import Lab6.snabbköp.kunder.KundID;
import Lab6.snabbköp.KassaKöFIFO;
import Lab6.snabbköp.Snabbköp;
import Lab6.snabbköp.SnabbköpState;

public class RunSim {
	public static int maxAntal = 100;	
	public static void main(String[] args) {
		SnabbköpState state = new SnabbköpState();
		ArrayList<Event> eventList = new ArrayList<Event>();
		EventQueue eQ = new EventQueue(20, "test", eventList);
		ArrayList<KundID> kundList = new ArrayList<KundID>();//skapas in i simulator
		Snabbköp sk = new Snabbköp(true, state, kundList, eQ);
		sk.skapaFörstaKund();
		for (int i = 0; i< sk.kundList.size(); i++) {
			System.out.println("kund:\t" + sk.kundList.toArray()[i]);
			KundID förstaKund = sk.kundList.get(0);
			förstaKund.create();
			EventQueue a = sk.getEq();
			System.out.println(a.getHändelseKö());
		}
		
		/*KundID kID = new KundID();
		kID.kundList.clear();
		Snabbkop ss = new Snabbkop();
		
		ss.setSnabbköpÖppet(true);
		ss.setAntalKunderIButik(1);
		
		SnabbkopState sss = new SnabbkopState();
		Ankomst ankomst = new Ankomst(sss );
		
		ankomst.createEvent(12, 1234);
		System.out.println("\t"+sss.getTidAnkomst());
*/
	}

}
