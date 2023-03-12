package Lab6.snabbköp.kunder;

import java.util.ArrayList;

import Lab6.generellSim.CreateObject;
import Lab6.generellSim.EventQueue;
import Lab6.snabbköp.Snabbköp;
import Lab6.snabbköp.SnabbköpState;
import Lab6.snabbköp.kunder.*;
public class Kund extends KundIDGenerator {
	public Kund() {
		this.ID = new KundIDGenerator().generate();
	}
	public int getKundID() {
		return this.ID;
	}
}
