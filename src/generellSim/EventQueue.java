package Lab6.generellSim;

import java.util.ArrayList;

public class EventQueue {
	
	private int eventTid;
	private String eventNamn;
	private ArrayList<Event> händelseKö;
	
	public EventQueue(int eventTid, String eventNamn, ArrayList<Event> händelseKö) {
		this.eventTid = eventTid;
		this.eventNamn = eventNamn;
		this.händelseKö = händelseKö;
	}
	
	public int getEventTid() {
		return this.eventTid;
	}
	
	public String getEventNamn() {
		return this.eventNamn;
	}
	
	public ArrayList<Event> getHändelseKö() {
		return this.händelseKö;
	}
	
	public Event ordnaKö() { //TODO Funktionen måste implementeras
		return null;
	}

}
