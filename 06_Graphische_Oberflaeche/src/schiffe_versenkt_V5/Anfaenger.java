package schiffe_versenkt_V5;

public class Anfaenger extends Spieler {

	public Anfaenger(String ss_name,int id) {
		super(ss_name, id);
	}
	
	public double spielerNote_berechne(int ss_schuss_ergebnis, boolean ss_is_spielende)
	{double note;
		if(ss_schuss_ergebnis ==1 || ss_schuss_ergebnis == 3)
		{z_treffer +=1;
		}
		if(ss_is_spielende) 
			{bonus = 10;
			}
	note = z_treffer*1.5 + bonus*3;
	System.out.println("z_treffer: " + z_treffer);	
	return note;
	}
	
	

	

}
