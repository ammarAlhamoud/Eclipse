package schiffe_versenken;

public class Profi extends Spieler {

	public Profi(int ss_nr) {
		super(ss_nr);
		z_moeglicheAbfragen=0;
	}
	
	public double get_Spielernote() {
		double ss_note = trefferstand;
		if(bonus) ss_note += 10;
		return ss_note;
	}
	
}
