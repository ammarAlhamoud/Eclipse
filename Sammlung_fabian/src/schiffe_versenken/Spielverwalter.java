package schiffe_versenken;

public class Spielverwalter {
	private Schiffsverwalter meinSchiffsverwalter = new Schiffsverwalter();
	private Spielerverwalter meinSpielerverwalter = new Spielerverwalter();
	
	public boolean is_einBott_in( int ss_x_point, int ss_y_point, char ss_ausrichtung, int ss_laenge) {
		return meinSchiffsverwalter.is_einBott_in(ss_x_point, ss_y_point, ss_ausrichtung, ss_laenge);
	}
	
	public void schiffe_erzeugen(int z_feldmax, int z_schiffe, int z_uboote, int laengemax) {
		meinSchiffsverwalter.schiffe_erzeugen(z_feldmax, z_schiffe, z_uboote, laengemax);
	}
	
	public void schuss_auf_schiffe_setzen(int x_schuss,int y_schuss) {
		meinSchiffsverwalter.schuss_auf_schiffe_setzen(x_schuss,y_schuss);
	}
	
	public int get_last_schussergebnis() {
		return meinSchiffsverwalter.get_last_schussergebnis();
	}
	
	public boolean is_alle_versenkt() {
		return meinSchiffsverwalter.is_alle_versenkt();
	}
	
	public int create_Spieler(char ss_leistungsstufe) {
		return meinSpielerverwalter.create_Spieler(ss_leistungsstufe);
	}
	
	public void set_nextSpieler() {
		meinSpielerverwalter.set_nextSpieler();
	}
	
	public int get_aktSpieler() {
		return meinSpielerverwalter.get_aktSpieler();
	}
	
	public void registriere_Treffer(boolean ss_bonus) {
		meinSpielerverwalter.registriere_Treffer(ss_bonus);
	}
	
	public double[][] get_Spielernoten() {
		return meinSpielerverwalter.get_Spielernoten();
	}
	
	public int get_z_moeglicheAbfragen() {
		return meinSpielerverwalter.get_z_moeglicheAbfragen();
	}
	
	public void registriere_Abfrageoption() {
		meinSpielerverwalter.registriere_Abfrageoption();
	}

	
}
