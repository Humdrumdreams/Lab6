package Lab6.snabbköp;
import Lab6.generellSim.EventQueue;
import Lab6.snabbköp.kunder.*;
import java.util.LinkedList;

public class KassaKöFIFO extends LinkedList<Kund>{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	EventQueue eQ;
	SnabbköpState state;
	
	public KassaKöFIFO(SnabbköpState state, EventQueue eQ) {
		this.eQ = eQ;
		this.state = state;
	}
	@Override
	public boolean add(Kund e) {
		this.add(-1, e);
		return true;
	}
	public Kund removeFirst() {
		return this.removeFirst();
	}
	
	public void ordnaKö() {
		if (state.getAntalLedigaKassor() != 0) {
			this.removeFirst();
			state.minskaAntalLedigaKassor();
		}
	}
}
