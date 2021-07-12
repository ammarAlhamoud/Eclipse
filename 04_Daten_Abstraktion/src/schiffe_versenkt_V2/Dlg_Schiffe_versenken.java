package schiffe_versenkt_V2;


public class Dlg_Schiffe_versenken 
{public static void main(String[] args) 
	{
	int x_schuss,
		y_schuss,
		z_schiffe = 8,
		schuss_ergebniss;
	Schiffsverwalter w_schiffverwalter = new Schiffsverwalter(z_schiffe);
	w_schiffverwalter.lst_schiff_toString();
	do
		{System.out.println("geben Sie bitte Ihre Schussangabe (x,y)");
		System.out.println("X Schuss: ");
		x_schuss = ConsolReader.readInt();
		System.out.println("Y Schuss: ");
		y_schuss = ConsolReader.readInt();

		w_schiffverwalter.Schuss_auf_Schiffe_setzen(x_schuss, y_schuss);
		schuss_ergebniss = Schiffsverwalter.last_schuss_ergebnis;
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
		if (w_schiffverwalter.isSpielende())
			{System.out.println("Ende des Spiels");			
			}
		}
	while(!w_schiffverwalter.isSpielende());
	}



}
