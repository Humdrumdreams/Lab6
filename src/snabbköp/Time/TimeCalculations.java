package Lab6.snabbköp.Time;
import Lab6.randomNum.*;

public class TimeCalculations {
	private ExponentialRandomStream xRS;
	private UniformRandomStream bURS;
	private UniformRandomStream pURS;
	
	public TimeCalculations(double lambda, long seed, double kMin, double kMax, double pMin, double pMax) {
		this.xRS= new ExponentialRandomStream(lambda, seed);
		this.pURS = new UniformRandomStream(pMin, pMax, seed);
		this.bURS = new UniformRandomStream(kMin, kMax, seed);
	}
	
	public double getAnkomstTid(double currTid) { return this.xRS.next() + currTid; }
	public double getPlockTid(double currTid) { return this.pURS.next() + currTid; }
	public double getBetalningsTid(double currTid) { return this.bURS.next() + currTid; }
}
