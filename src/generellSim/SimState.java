package Lab6.generellSim;

import java.util.Observable;
/**
 * The class that keeps track of the state of the simulator.
 * It calculates how long time the simulator has been running,
 * and when the simulator should stop.
 *  
 * @author Ludvig Lidén, Botan Guzel, Sergij Wennström
 *
 */

@SuppressWarnings("deprecation")
public class SimState extends Observable{
	
	/**
	 * Variable that describes how much time that has passed since
	 * the simulator started runnning.
	 */
	
	private int UträknadTid; 
	
	public SimState() {
	}
	
	/**
	 * The method that checks if the simulator should continue 
	 * running or stop. If the variable avslutaProgram os set to
	 * false the program will stop and observers to this class
	 * will be notified using setChanged() and notifyObservers();
	 */
	public void runSimulation() { //kolla över denna
		boolean avslutaProgram = false;
		
		while (!avslutaProgram) { 
			//if (/* något händer*/) {
				avslutaProgram = true;
				setChanged();
				notifyObservers();
				
			//}
		}
	}
	/**
	 * 
	 * @return Returns the time the simulator has been running.
	 */
	public int getUträknadTid() {
		return this.UträknadTid;
	}

	
}
