package Lab6.snabbköp.kunder;

public class KundIDGenerator {
	protected int ID;
	
	public KundIDGenerator() { this.ID = -1;}
	
	public int generate() { return this.ID += 1; }

}
