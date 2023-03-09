package Lab6.generellSim;

import java.util.Observable;

public class SimState extends Observable{
	
	public void runSimulation() { //kolla över denna
		boolean avslutaProgram = false;
		
		while (!avslutaProgram) {
			// Programmet körs
			if (0 ==0) {
				avslutaProgram = true;
				setChanged();
				notifyObservers();
			}
		}
	}
}
