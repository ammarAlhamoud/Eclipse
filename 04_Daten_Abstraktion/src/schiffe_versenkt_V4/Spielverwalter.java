package schiffe_versenkt_V4;

public class Spielverwalter {
	public Spielerverwalter w_spielerverwalter;
	public Schiffsverwalter w_schiffsverwalter;
	public int  next_spielerID ;
	public Spielverwalter(int ss_z_spieler ,int ss_z_schiffe ) {
		this.w_spielerverwalter = new  Spielerverwalter(ss_z_spieler);
		this.w_schiffsverwalter = new  Schiffsverwalter(ss_z_schiffe, 10,10) ;
		w_schiffsverwalter.lst_schiff_toString();
	}
	
	
	
	public void set_nextSpielerID(int ss_akt_spielerID) {
		int schuss_ergebniss = w_schiffsverwalter.last_schuss_ergebnis;
		if (schuss_ergebniss == 1 || schuss_ergebniss == 3)
			{next_spielerID  = ss_akt_spielerID;	
			}
		else
			{w_spielerverwalter.set_nextSpielerID(ss_akt_spielerID);
			ss_akt_spielerID = w_spielerverwalter.getNext_spielerID();
			next_spielerID = ss_akt_spielerID;
			}
	}
	
	public double note_berechne (int schuss_ergebnis, int spieler_id, boolean ss_is_spielende)
		{return w_spielerverwalter.spielerNote_berechne(schuss_ergebnis, spieler_id , ss_is_spielende);
		}



	public int getNext_spielerID() {
		return next_spielerID;
	}

	




}
