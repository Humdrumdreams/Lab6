package Lab6.generellSim;

import Lab6.snabbköp.Snabbköp;
import Lab6.snabbköp.SnabbköpState;

/**
 * An abstract class so that the classes in händelser can inherit this class.s
 * 
 * @author Ludvig Lidén, Botan Guzel, Sergij Wennström
 */

public abstract class Event {
	
	/**
	 * Represents a variable that refers to the state of the variables inside Snabbköp
	*/
	protected SnabbköpState state;
	
	/**
	 * Represents a variable that refers to Snabbköp. 
	 */
	protected Snabbköp snabbköp;
	
	/**
	 * Represents a variable that refers to the EventQueue. 
	 */
	protected EventQueue eQ;
	/**
	 * 
	 * @param state
	 * @param snabbköp
	 * @param eQ
	 */
	
	public Event(SnabbköpState state, Snabbköp snabbköp, EventQueue eQ) {
		this.state = state;
		this.snabbköp = snabbköp;
		this.eQ = eQ;
	}

	/**
	 * The method that the other classes in händelser inherits.
	 * 
	 * @param lambda
	 * @param seed
	 * @param kundID
	 */
	public abstract void createEvent(double lambda, long seed, int kundID);
	//Klassen Event måste ha en referens till kön så dessa nya framtida
	//händelser kan lagras med övriga framtida händelser.
}