package Lab6.generellSim;

import java.util.ArrayList;

/**
 * A class that represents the general lists of events in a Simulator.
 * The class will put the events in order depending on which time the
 * event will occur. 
 * 
 * @author Ludvig Lidén, Botan Guzel, Sergij Wennström
 */

public class EventQueue {
	
	/**
	 * The variable makes it so that the eventqueue links a time "eventTid" to the 
	 * specific even. This way the events can be called in the right time order. 
	 */
	private int eventTid;
	
	/**
	 * Links a name to the event that  will take place.
	 */
	private String eventNamn;
	
	/**
	 * Creates a list where all the events are placed within accordin to their "eventTid".
	 */
	private ArrayList<Event> händelseKö;
	
	public EventQueue(int eventTid, String eventNamn, ArrayList<Event> händelseKö) {
		this.eventTid = eventTid;
		this.eventNamn = eventNamn;
		this.händelseKö = händelseKö;
	}
	
	/**
	 * 
	 * @return Returns the time the event will happen.
	 */
	public int getEventTid() {
		return this.eventTid;
	}
	
	/**
	 * 
	 * @return Returns the name of the event. 
	 */
	public String getEventNamn() {
		return this.eventNamn;
	}
	
	/**
	 * 
	 * @return Returns the list of all the events.
	 */
	public ArrayList<Event> getHändelseKö() {
		return this.händelseKö;
	}
	
	/**
	 * 
	 * @return Returns the list of the events after it has been fixed depending on
	 * the time the event will happen.
	 */
	public Event ordnaKö() { //TODO Funktionen måste implementeras
		return null;
	}

}