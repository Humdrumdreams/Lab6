package Lab6.generellSim;

import java.util.Observable;

/**
 * The class that shows the "print-out" from the simulator. 
 * The class only includes the method update().
 *
 * @author Ludvig Lidén, Botan Guzel, Sergij Wennström
 */

@SuppressWarnings("deprecation")
public abstract class SimView extends Observable{
	
	/**
	 * An abstract method that is inherited by a View  class
	 * of a specific simulator. It shows the view of the simulator.
	 */
	public abstract void update();
	
	
	public abstract void printUt(); //Jag tror att denna metoden
									//ska tas bort. 
}
