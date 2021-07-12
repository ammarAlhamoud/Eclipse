package schiffe_versenkt_V4;

public class Profi extends Spieler {

	public Profi(String ss_name, int id) {
		super(ss_name, id);
	}
	public double spielerNote_berechne(int ss_schuss_ergebnis, boolean ss_is_spielende)
		{if(ss_schuss_ergebnis ==1 || ss_schuss_ergebnis == 3)
			{z_treffer +=1;
			}
		if(ss_is_spielende) 
			{bonus = 10;
			}
		double note = z_treffer + bonus;
		System.out.println("z_treffer: " + z_treffer);	
		return note;
		}
}
