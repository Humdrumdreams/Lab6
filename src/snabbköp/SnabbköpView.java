package Lab6.snabbköp;

import java.util.Observable;

import Lab6.generellSim.Event;
import Lab6.generellSim.EventQueue;
import Lab6.generellSim.SimView;
import Lab6.snabbköp.kunder.Ankomst;

public class SnabbköpView extends SimView{
	private SnabbköpState state;
	private EventQueue eQ;

	public SnabbköpView(SnabbköpState state, EventQueue eQ) {
		super();
		this.state= state;
		this.eQ = eQ;
	}
	
	public void printUtRun(Observable o, Object e) {
		System.out.println(String.format(
				"""
				PARAMETRAR
				==========
				Antal kassor, N..........: %s
				Max som ryms, M..........: %s
				Ankomshastighet, lambda..: %s
				Plocktider, [P_min..Pmax]: [%s..%s]
				Betaltider, [K_min..Kmax]: [%s..%s]
				Frö, f...................: %s
				FÖRLOPP
				=======
				/tTid Händelse Kund ? led ledT I $ :-( köat köT köar [Kassakö..]
				%.2f %s""",
				state.getAntalLedigaKassor(),
				state.getMaxKunder(),
				state.getLambda(),
				state.getPMin(),
				state.getPMax(),
				state.getKMin(),
				state.getKMax(),
				state.getSeed(),
				state.getTime(),
				state.getCurrentEvent()));
	}
	
	public void Resultat() {
		System.out.println(String.format(
				"""
				%.2f Stop
				
				Resultat
				========
				
				1) Av %s kunder handlade %s medan %s missades.
				
				2) Total tid %s kassor varit ledig: %.2f te.
				   Genomsnittlig ledig kassatid: %.2f te (dvs 36.04% av tiden från öppning tills sista kunden betalat).
				   
				3) Total tid %s kunder tvingats köa: %.2f te.
				   Genomsnittlig kötid: %.2f te.
				""",
				state.getTime(),
				state.getTotalAntalKunder(),
				state.getAntalKunderSomHandlat(),
				state.getAntalMissadeKunder(),
				state.getMaxKassor(),
				state.getSummaTidLedigaKassor(),
				state.getSummaTidLedigaKassor() / state.getMaxKassor(),
				state.getSummaTidLedigaKassor() / state.getMaxKassor() / state.getTime() * 100,
				state.getAntalKunderSomKöat(),
				state.getSummaKöTid(),
				state.getSummaKöTid() / state.getAntalKunderSomKöat()));
	}
	
	@Override
	public void update(Observable o, Object e) {
		if (state.getCurrentEvent() instanceof Run) { printUtRun(o ,e); }	
		else if (state.getCurrentEvent() instanceof Stop) { Resultat(); }
		else {
			System.out.println(String.format(
					"%.2f %s %s %s %s %s %s %s %s %s %s %s %s",
					state.getTime(),
					state.getCurrentEvent().getName(),
					state.getKundID(),
					state.isSnabbköpÖppet() ? "Ö" : "S",
					state.getAntalLedigaKassor(),
					state.getSummaTidLedigaKassor(),
					state.getAntalKunderIButik(),
					state.getAntalKunderSomHandlat(),
					state.getAntalMissadeKunder(),
					state.getAntalKunderSomKöat(),
					state.getSummaKöTid(),
					state.getKassaKöLängd(),
					state.getKassaKöFIFO()));
		}
	}
}
