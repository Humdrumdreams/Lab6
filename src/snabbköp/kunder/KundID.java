package Lab6.snabbköp.kunder;

import java.util.ArrayList;

import Lab6.generellSim.CreateObject;
import Lab6.generellSim.EventQueue;
import Lab6.snabbköp.Snabbköp;
import Lab6.snabbköp.SnabbköpState;
import Lab6.snabbköp.kunder.*;
public class KundID extends CreateObject{
	
	
	private int kundID;
	public KundID(int kundID, SnabbköpState state, Snabbköp snabbköp, EventQueue eQ) {
		super(kundID, state, snabbköp, eQ);
		this.setKundID(kundID);
	}
	public int getKundID() {
		return this.kundID;
	}
	public void setKundID(int kundID) {
		this.kundID = kundID;
	}
	@Override
	public void create() {
		Ankomst ankomst = new Ankomst(state, snabbköp, eQ);
		ankomst.createEvent(4, 1234, this.kundID);
	}
}
