package schiffe_versenken;

public class Anfaenger extends Spieler {

	public Anfaenger(int ss_nr) {
		super(ss_nr);
		z_moeglicheAbfragen=3;
	}
	
	public double get_Spielernote() {
		double ss_note = trefferstand * 1.5;
		if(bonus) ss_note += 30;
		return ss_note;

	}
	
}
