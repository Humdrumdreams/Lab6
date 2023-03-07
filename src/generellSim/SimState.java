package generellSim;

import java.util.Observable;

public class SimState extends Observable{
	
	public void runSimulation() { //kolla över denna
		boolean avslutaProgram = false;
		
		while (!avslutaProgram) {
			// Programmet körs
			if (/* något händer*/) {
				avslutaProgram = true;
				setChanged();
				notifyObservers();
			}
		}
	}
}
