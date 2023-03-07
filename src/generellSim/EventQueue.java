package Lab6.generellSim;

import java.util.ArrayList;

public class EventQueue {
	
	private int eventTid;
	private String eventNamn;
	private ArrayList<Event> händelseKö;
	
	public EventQueue(int eventtid, String eventNamn, ArrayList<Event> händelseKö) {
		this.eventTid = eventtid;
		this.eventNamn = eventNamn;
		this.händelseKö = händelseKö;
	}
	
	public int getEventtid() {
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
