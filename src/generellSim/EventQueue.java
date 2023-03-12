package Lab6.generellSim;

import java.util.ArrayList;

public class EventQueue extends ArrayList<Event> {

	public EventQueue() { super();	}
	
	public boolean addEvent(Event e) {
		if (!e.getEventState()) {
			if (this.isEmpty()) {
				this.add(e);
				return true;
			}
			else {
				this.add(e);
				/*
				for (int i = 0; i < this.size(); i++) {
					if (e.tid < this.get(i).tid) {
						System.out.println(i);
						this.add(i, e);
						return true;
					}
				}*/
			}
		}
		return false;
		
	}
	
	
	
	
	public Event nästaHändelse() { return this.get(0); }
	public void removeEvent() { this.remove(0); }

}
