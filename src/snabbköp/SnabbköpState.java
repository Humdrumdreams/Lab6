package Lab6.snabbköp;

import Lab6.generellSim.SimState;

public class SnabbköpState extends SimState{
	
	private double tidAnkomst = -1.5;
	private double tidPlock;
	private double tidBetalning;
	private int antalKunderSomHandlat;
	private int antalKunderSomKöat;
	private int summaTidKunderIKö;
	private int kassaKöLängd;
	private double summaKöTid;
	private int summaTidLedigaKassor;
	private int antalMissadeKunder;

	private int antalKunderIButik;
	private KassaKöFIFO kassaKöFIFO;
	private int antalLedigaKassor;
	private boolean snabbköpÖppet = true;
	private int maxKunder = 1;
	
	
	public SnabbköpState() {//Ska man lägga in alla parameter värden här?

	}
	
	//Getters funktioner till alla privata instansvariabler.
	public double getTidAnkomst() {
		return this.tidAnkomst;
	}
	public void setTidAnkomst(double tid) {
		this.tidAnkomst = tid;
	}
	public double getTidPlock() {
		return this.tidPlock;
	}
	public double getTidBetalning() {
		return this.tidBetalning;
	}
	public int getAntalKunderSomHandlat() {
		return this.antalKunderSomHandlat;
	}
	public void setAntalKunderSomHandlat() {
		this.antalKunderSomHandlat += 1;
	}
	public int getAntalKunderSomKöat() {
		return this.antalKunderSomKöat;
	}
	public void setAntalKunderSomKöat(int kund) {
		this.antalKunderSomKöat += kund;
	}
	public int getSummaTidKunderIKö() {
		return this.summaTidKunderIKö;
	}
	public int getKassaKöLängd() {
		return this.kassaKöLängd;
	}
	public double getSummaKöTid() {
		return this.summaKöTid;
	}
	public int getSummaTidLedigaKassor() {
		return this.summaTidLedigaKassor;
	}

	public int getAntalMissadeKunder() {
		return this.antalMissadeKunder;
	}

	public void setAntalMissadeKunder(int antalMissadeKunder) {
		this.antalMissadeKunder = antalMissadeKunder;
	}
	
	public int getAntalKunderIButik() {
		return this.antalKunderIButik;
	}
	public void setAntalKunderIButik(int antalKunderIButik) {
		this.antalKunderIButik = antalKunderIButik;
	}
	public void setKassaKöLängd(int kassaKöLängd) {
		this.kassaKöLängd = kassaKöLängd;
	}
	public KassaKöFIFO getKassaKöFIFO() {
		return this.kassaKöFIFO;
	}
	public void setKassaKöFIFO(KassaKöFIFO kassaKöFIFO) {
		this.kassaKöFIFO = kassaKöFIFO;
	}
	public int getAntalLedigaKassor() {
		return antalLedigaKassor;
	}
	public void setAntalLedigaKassor(int antalLedigaKassor) {
		this.antalLedigaKassor = antalLedigaKassor;
	}
	public boolean isSnabbköpÖppet() {
		return snabbköpÖppet;
	}
	public void setSnabbköpÖppet(boolean snabbköpÖppet) {
		this.snabbköpÖppet = snabbköpÖppet;
	}
	public int getMaxKunder() {
		return maxKunder;
	}
	public void setMaxKunder(int maxKunder) {
		this.maxKunder = maxKunder;
	}
}
