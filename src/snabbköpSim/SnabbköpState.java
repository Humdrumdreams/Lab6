package snabbköpSim;

import genSim.SimState;

public class SnabbköpState extends SimState{
	
	private int tidAnkomst;
	private int tidPlock;
	private int tidBetalning;
	private int antalKunderIButik;
	private int antalKunderSomHandlat;
	private int antalKunderSomKöat;
	private int summaTidKunderIKö;
	private int kassaKöLängd;
	private int kassaKöFIFO;
	private int summaKöTid;
	private int antalLedigaKassor;
	private int summaTidLedigaKassor;
	
	
	public SnabbköpState() {//Ska man lägga in alla parameter värden här?

	}
	
	//Getters funktioner till alla privata instansvariabler.
	public int getTidAnkomst() {
		return this.tidAnkomst;
	}
	public int getTidPlock() {
		return this.tidPlock;
	}
	public int getTidBetalning() {
		return this.tidBetalning;
	}
	public int getAntalKunderIButik() {
		return this.antalKunderIButik;
	}
	public int getAntalKunderSomHandlat() {
		return this.antalKunderSomHandlat;
	}
	public int getAntalKunderSomKöat() {
		return this.antalKunderSomKöat;
	}
	public int getSummaTidKunderIKö() {
		return this.summaTidKunderIKö;
	}
	public int getKassaKöLängd() {
		return this.kassaKöLängd;
	}
	public int getKassaKöFIFO() {
		return this.kassaKöFIFO;
	}
	public int getSummaKöTid() {
		return this.summaKöTid;
	}
	public int getAntalLedigaKassor() {
		return this.antalLedigaKassor;
	
	}
	public int getSummaTidLedigaKassor() {
		return this.summaTidLedigaKassor;
	}


}
