package Lab6.snabbköp;
import Lab6.generellSim.EventQueue;
import Lab6.snabbköp.kunder.*;
import java.util.LinkedList;

public class KassaKöFIFO extends LinkedList{

	EventQueue eQ;
	SnabbköpState state;
	
	public KassaKöFIFO(SnabbköpState state, EventQueue eQ) {
		this.eQ = eQ;
		this.state = state;
	}
	@Override
	public boolean add(Object e) {
		this.add(0, e);
		return true;
	}
	
	public void removeFirst(Object e) {
		this.removeFirst();
	}
	
	public void ordnaKö() {
		if (state.getAntalLedigaKassor() != 0) {
			this.removeFirst();
			int ledKassor = state.getAntalLedigaKassor();
			state.setAntalLedigaKassor(ledKassor-1);
		}
	}
}
