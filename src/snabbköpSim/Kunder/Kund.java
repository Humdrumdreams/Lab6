package Lab6.snabbköpSim.Kunder;

import java.util.ArrayList;

public class Kund {
	Ankomst ankomst;
	public ArrayList<Integer> kundList = new ArrayList<Integer>();
	
	public Kund(double lambda, long seed) {
		ankomst.createEvent(lambda, seed);
	}
}
