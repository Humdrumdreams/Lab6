package Lab6.snabbköp;

import Lab6.generellSim.Event;
import Lab6.generellSim.SimState;
import Lab6.snabbköp.Time.TimeCalculations;

public class SnabbköpState extends SimState{
	
	final TimeCalculations tC;
	private int antalKunderSomHandlat, antalKunderSomKöat,
		kassaKöLängd, summaKöTid, summaTidLedigaKassor,
		antalMissadeKunder, maxKassor, antalKunderIButik, 
		antalLedigaKassor, maxKunder, totalAntalKunder;
	
	private KassaKöFIFO kassaKöFIFO;
	
	private boolean snabbköpÖppet;
	private double lambda, ankomstTid, plockTid, betalningsTid, kMin, kMax, pMin, pMax;
	private long seed;
	private Event currentEvent;
	
	public SnabbköpState(int maxKunder, int maxKassor, double lambda, 
			long seed, double kMin, double kMax, double pMin, double pMax) {
		this.maxKunder = maxKunder;
		this.maxKassor = maxKassor;
		this.lambda = lambda;
		this.seed = seed;
		this.kMin = kMin;
		this.kMax = kMax;
		this.pMin = pMin;
		this.pMax = pMax;
		this.tC = new TimeCalculations(lambda, seed, kMin, kMax, pMin, pMax);
	}
	
	public int getAntalKunderSomHandlat() { return antalKunderSomHandlat; }
	public int getAntalKunderSomKöat() { return this.antalKunderSomKöat; }
	public int getKassaKöLängd() { return this.kassaKöLängd; }
	public int getMaxKassor() { return this.maxKassor; }
	public int getAntalKunderIButik() { return this.antalKunderIButik; }
	public int getSummaKöTid() { return this.summaKöTid; }
	public int getSummaTidLedigaKassor() { return this.summaTidLedigaKassor; }
	public int getAntalMissadeKunder() { return this.antalMissadeKunder; }
	public int getAntalLedigaKassor() { return this.antalLedigaKassor; }
	public int getMaxKunder() { return this.maxKunder; }
	public int getTotalAntalKunder() { return this.totalAntalKunder; }
	public double getLambda() { return this.lambda; }
	public double getAnkomstTid() { return this.ankomstTid; }
	public double getPlockTid() { return this.plockTid; }
	public double getBetalningsTid() { return this.betalningsTid; }
	public double getKMin() { return this.kMin; }
	public double getKMax() { return this.kMax; }
	public double getPMin() { return this.pMin; }
	public double getPMax() { return this.pMax; }
	public long getSeed() { return seed; }
	public boolean isSnabbköpÖppet() { return snabbköpÖppet; }
	public KassaKöFIFO getKassaKöFIFO() { return kassaKöFIFO; }
	public Event getCurrentEvent() { return this.currentEvent; }
	
	public void setSnabbköpÖppet(boolean a) { this.snabbköpÖppet = a; }
	public void setCurrentEvent(Event e) { this.currentEvent = e; }
	
	public void läggMissadKund() {this.antalMissadeKunder += 1; }
	public void minskaAntalKunderIButik() { this.antalKunderIButik -= 1; }
	public void ökaAntalLedigaKassor() { this.antalLedigaKassor += 1; }
	public void ökaAntalKunderSomHandlat() { this.antalKunderSomHandlat += 1; }
	public void minskaAntalLedigaKassor() { this.antalLedigaKassor -= 1;	}
	public void ökaSummaKöTid() { this.summaKöTid += 1; }
	public void ökaAntalKunderIButik() { this.antalKunderIButik += 1; }
	public void ökaTotalAntalKunder() { this.totalAntalKunder += 1; }		
	}
	

