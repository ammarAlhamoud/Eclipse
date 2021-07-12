package schiffe_versenken;

public abstract class Spieler {
	protected int trefferstand=0;
	protected boolean bonus=false;
	protected int z_moeglicheAbfragen;
	protected int nr;
	
	public Spieler(int ss_nr) {
		nr = ss_nr;
	}
	
	public int get_nr() {
		return nr;
	}
	
	public abstract double get_Spielernote();
	
	public void registriere_Treffer(boolean ss_bonus) {
		trefferstand += 1;
		if(ss_bonus) bonus = true;
	}
	
	public void registriere_Abfrageoption() {
		z_moeglicheAbfragen--;
	}
	public int get_z_moeglicheAbfragen() {
		return z_moeglicheAbfragen;
	}
}
