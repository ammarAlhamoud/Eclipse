package schiffe_versenken;

import generalisierung.*;

public class Dlg_schiffe_versenken implements Moderierbar {	
	private Spielverwalter meinSpielverwalter;
	
	public void programmausgangslage_erzeugen() {
		char neuerSpieler;
		char leistungsstufe;
		int z_feldmax, z_schiffe, z_uboote, laengemax;
		//gesamtzahl schiffe, davon uboote
		
		System.out.println("\n\t-------- Willkommen bei Schiffe versenken --------\n");
		
		System.out.println("Bitte Spielregeln festlegen (Zahlen durch Komma trennen):");
		System.out.println("Feldgröße, Anzahl Schiffe gesamt, davon UBoote, Schiffe max Länge");
		String init = ConsolReader.readString();
		String[] w_init = init.split(",");
		z_feldmax = Integer.valueOf(w_init[0].trim());
		z_schiffe = Integer.valueOf(w_init[1].trim());
		z_uboote = Integer.valueOf(w_init[2].trim());
		laengemax = Integer.valueOf(w_init[3].trim());
		 
		Spielfeld.erzeugen(z_feldmax);
			
		meinSpielverwalter = new Spielverwalter();
		meinSpielverwalter.schiffe_erzeugen(z_feldmax, z_schiffe, z_uboote, laengemax);	
			
		do {
			System.out.print("Wollen Sie als Profi ( p ) oder Anfänger ( a ) spielen:  ");
			leistungsstufe = ConsolReader.readChar();
			System.out.println("Spieler Nr "+meinSpielverwalter.create_Spieler(leistungsstufe)+" erstellt \n");
			System.out.print(" Noch einen Spieler hinzufügen? ( j / n ):  ");
			neuerSpieler = ConsolReader.readChar();		
		}while(neuerSpieler=='j');
	
		
	}
	
	public void programmrunde_durchfuehren() {
		
		System.out.println("\n Spieler Nr "+meinSpielverwalter.get_aktSpieler()+" ist an der Reihe");
		
		int schussergebnis=-1;
		String schuss;
		boolean is_abfrage=false, is_treffer=false;
		
		do{	
			int x_schuss, y_schuss, x_abfrage, y_abfrage;
			is_abfrage = false; is_treffer = false;
			
			if(meinSpielverwalter.get_z_moeglicheAbfragen()>0)
			{	System.out.print("Schuss angeben X,Y oder 'a' für Abfrage in einem 3*3 Feld ");
				System.out.println("(Noch "+meinSpielverwalter.get_z_moeglicheAbfragen()+" Abfragen)");
				schuss = ConsolReader.readString();
				
				if(schuss.charAt(0)=='a')
				{	is_abfrage=true;
					meinSpielverwalter.registriere_Abfrageoption();
					System.out.println("Abfrage angeben X,Y");
					String abfrage = ConsolReader.readString();
					String[] w_abfrage = abfrage.split(",");
					x_abfrage = Integer.valueOf(w_abfrage[0].trim());
					y_abfrage = Integer.valueOf(w_abfrage[1].trim());
					if(meinSpielverwalter.is_einBott_in(x_abfrage, y_abfrage, 'Q', 3))
						 System.out.println("Ich rieche Schiffe in der Nähe!");
					else System.out.println("Ich seh nur Pfeifen!");						
				}			
			}
			
			else
			{	System.out.println("Schuss angeben X,Y");
				schuss = ConsolReader.readString();
			}
					
			if(!is_abfrage)
			{	String[] w_schuss = schuss.split(",");
				x_schuss = Integer.valueOf(w_schuss[0].trim());
				y_schuss = Integer.valueOf(w_schuss[1].trim());
	
				meinSpielverwalter.schuss_auf_schiffe_setzen(x_schuss,y_schuss);
	
				schussergebnis = meinSpielverwalter.get_last_schussergebnis();
				switch(schussergebnis)
				{	case 0: System.out.println("Nicht schlecht... im Wasser abschießen...");
					break;
					case 1: System.out.println("Schiff getroffen, sogar eins von den Feinden! Ein Pünktchen für dich");
							is_treffer=true;
					break;
					case 2: System.out.println("Ihr beschießt schon getroffene Schiffteile um Dominanz zu zeigen? Gefällt mir!");
					break;
					case 3: System.out.println("Komplettes Schiff versenkt! Jupdifuckingdo! Ein fetter Punkt für dich");
							is_treffer=true;
					break;
					case 4: System.out.println("Dieses komplette Schiff wurde schon versenkt! Reib es deinem Gegner unter die Nase!!");
					break;
				}
				if(is_treffer) meinSpielverwalter.registriere_Treffer(meinSpielverwalter.is_alle_versenkt()); 
			}
			
		}while( (is_abfrage || is_treffer) && !meinSpielverwalter.is_alle_versenkt() );
		
		if(meinSpielverwalter.is_alle_versenkt())
		{	System.out.println("\n---Das letzte Schiff wurde versenkt! "
					+ "Noch einmal dick Punkte für Spieler Nr "+meinSpielverwalter.get_aktSpieler()+"!---");
		}
		meinSpielverwalter.set_nextSpieler();
	}
	
	public boolean is_programmende() { 
		return meinSpielverwalter.is_alle_versenkt();
	}
	
	public void programmergebnis_anzeigen() {
		double[][] spielernoten = meinSpielverwalter.get_Spielernoten();
		
		System.out.println("Auswertung:");
		for(int i=0; i<spielernoten.length; i++)
		{	System.out.println("Spieler "+(int)spielernoten[i][0]+": "+spielernoten[i][1]+" Punkte");
			
		}
	}
		
}
