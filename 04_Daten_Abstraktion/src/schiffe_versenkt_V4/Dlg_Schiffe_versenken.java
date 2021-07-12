package schiffe_versenkt_V4;
public class Dlg_Schiffe_versenken 
{public static void main(String[] args) 
	{
	int x_schuss,
		y_schuss,
		z_schiffe = 2,
		z_spieler;
	char c_spielerLeistung;
	Spielerverwalter w_spielerverwalter ;
	int	schuss_ergebniss;
	int i = 0,
		akt_spielerID = 0;
	String name;
	
	System.out.println("Wie viel Spieler?");
	z_spieler = ConsolReader.readInt();
	Spielverwalter w_spielverwalter = new Spielverwalter(z_spieler,z_schiffe);
	do
		{while(i<z_spieler)
			{i++;
			System.out.println("name?");
			name = ConsolReader.readString();
			System.out.println("P:Profi oder A:Anfänger");
			c_spielerLeistung = ConsolReader.readChar();
			w_spielverwalter.w_spielerverwalter.creat_spieler(name, c_spielerLeistung);		
			}
		akt_spielerID = w_spielverwalter.getNext_spielerID();
		w_spielverwalter.set_nextSpielerID(akt_spielerID);
		akt_spielerID = w_spielverwalter.getNext_spielerID();
		System.out.println("Next Spieler: " + w_spielverwalter.w_spielerverwalter.getSpieler(akt_spielerID).getName());
		System.out.println("geben Sie bitte Ihre Schussangabe (x,y)");
		System.out.println("X Schuss: ");
		x_schuss = ConsolReader.readInt();
		System.out.println("Y Schuss: ");
		y_schuss = ConsolReader.readInt();
		w_spielverwalter.w_schiffsverwalter.schuss_auf_Schiffe_setzen(x_schuss, y_schuss);
		schuss_ergebniss = w_spielverwalter.w_schiffsverwalter.last_schuss_ergebnis;
		switch(schuss_ergebniss)
			{case 0: System.out.println("Wasser");
			break;
			case 1: System.out.println("Schiffsteil getroffen");
			break;
			case 2: System.out.println("schiffsteil wieder getroffen");
			break;
			case 3: System.out.println("suber! .. komplette Schiff versenkt!");
			break;
			case 4: System.out.println("schiff schon versenkt!");
			break;
			}
		boolean is_spielende = w_spielverwalter.w_schiffsverwalter.isSpielende();
		double note = w_spielverwalter.note_berechne(schuss_ergebniss, akt_spielerID,is_spielende);
		System.out.println("note: " + note);	
		if(is_spielende)
			{System.out.println("Ende das Spiel");
			}
		}
	while(!w_spielverwalter.w_schiffsverwalter.isSpielende());
	}

}
