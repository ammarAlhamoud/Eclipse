package dlgBankautomat;

public class FestKonto extends Konto implements Druckbar{
	double sperrfrist,ertragszins;

	public FestKonto(int ss_nr, double ss_stand, double ss_sperrfrist,
			double ss_ertragszins) {
		super(ss_nr, ss_stand);
		this.sperrfrist = ss_sperrfrist;
		this.ertragszins = ss_ertragszins;
	}
	public String get_Druckinhalt() {
		return "Nr:"+nr + "Stand"+stand + "Sperrfrist"+sperrfrist
		+"Ertragszins"+ertragszins ;
	}
	
	public void setSperrfrist(int ss_tage) {
		sperrfrist = ss_tage;
	}
	
	

}
