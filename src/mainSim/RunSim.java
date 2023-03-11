package Lab6.mainSim;

import java.util.ArrayList;
import Lab6.generellSim.Event;
import Lab6.generellSim.EventQueue;
import Lab6.snabbköp.Snabbköp;
import Lab6.snabbköp.SnabbköpState;
import Lab6.snabbköp.kunder.*;

/**
 * This class runs the events created by the Event class in the order set by the EventQueue class. 
 * 
 * @author Ludvig Lidén, Botan Guzel, Sergij Wennström
 */

public class RunSim {
	
	/**
	 * A variable for the maximum people who are allowwed inside the 
	 */
	public static int maxAntal = 100;	
	
	/**
	 * The main method which will run the program.
	 * @param args 
	 */
	public static void main(String[] args) {
		
		/**
		 * Creates an ArrayList object named eventList.
		 */
		ArrayList<Event> eventList = new ArrayList<Event>();

		/**
		 * Creates an eventqueue object eQ. That takes the variables 
		 * (eventTid, eventNamn and händelseKö) as input.
		 */
		EventQueue eQ = new EventQueue(20, "test", eventList); //what is meant by eventList
		
		/**
		 * Creates an ArrayList object namede kundList. 
		 */
		ArrayList<KundID> kundList = new ArrayList<KundID>();
		
		/**
		 * Creates a SnabbköpState object named state.
		 */
		SnabbköpState state = new SnabbköpState();
		
		/**
		 * Creates a Snabbköp object named Snabbköp. Takes 4 parameters as input. 
		 */
		Snabbköp sk = new Snabbköp(true, state, kundList, eQ);
		
		/**
		 * Calls the method in Snabbköp for creating the first customer. The first 
		 * customer will then lead to the first
		 */
		sk.skapaFörstaKund();
		
		for (int i = 0; i< sk.kundList.size(); i++) {
			System.out.println("kund:\t" + sk.kundList.toArray()[i]);
			
			KundID förstaKund = sk.kundList.get(0);
			förstaKund.create();
			
			EventQueue a = sk.getEQ();
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