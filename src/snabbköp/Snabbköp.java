package Lab6.snabbköp;

import java.util.ArrayList;

import Lab6.generellSim.EventQueue;
import Lab6.snabbköp.kunder.KundID;

public class Snabbköp {
	boolean snabbköpÖppet;
	SnabbköpState state;
	EventQueue eQ;
	public ArrayList<KundID> kundList;
	public Snabbköp(boolean öppet, SnabbköpState state, ArrayList<KundID> kundList, EventQueue eQ) {
		this.state = state;
		this.snabbköpÖppet = öppet;
		this.kundList = kundList;
		this.eQ = eQ;
	}
	public void skapaFörstaKund() {
		//Skapar första kund och lägger den i kundListan 
		if (this.snabbköpÖppet) {//Kollar om snabbköper är öppet 
			KundID förstaKund = new KundID(0, this.state, this, eQ); // Skapa första kund objekt
			this.kundList.add(förstaKund);//lägger första kunden i kund listan
		}
	}
	public EventQueue getEq() {
		return this.eQ;
	}
}
