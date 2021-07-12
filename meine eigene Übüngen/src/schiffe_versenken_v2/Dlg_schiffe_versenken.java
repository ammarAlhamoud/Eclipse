package schiffe_versenken_v2;

import java.util.Scanner;

public class Dlg_schiffe_versenken {	
	public static Scanner s = new Scanner (System.in);
	
	public static void main(String[] args) {
		int schussergebnis;
		
		/*
		System.out.println("Feldgrˆﬂe? von 0 bis ...");
		int z_feldmax = s.nextInt(); 
		System.out.println("Anzahl Schiffe?");
		int z_schiffe = s.nextInt(); 
		System.out.println("maximale Schiffsl‰nge?");
		int laengemax = s.nextInt();
		*/
		
		int z_schiffe=2, laengemax=4, z_feldmax=10;
		
		Spielfeld.erzeugen(z_feldmax);
		Schiffsverwalter.schiffsverwalter(z_feldmax, z_schiffe, laengemax);
	
		while(true)
		{	int x_schuss, y_schuss;
			System.out.println("Schuss angeben X,Y");
			String schuss = s.nextLine();
			String[] w_schuss = schuss.split(",");
			x_schuss = Integer.valueOf(w_schuss[0].trim());
			y_schuss = Integer.valueOf(w_schuss[1].trim());
		
			Schiffsverwalter.schuss_auf_schiffe_setzen(x_schuss,y_schuss);
		
			schussergebnis = Schiffsverwalter.get_last_schussergebnis();
			switch(schussergebnis)
			{	case 0: System.out.println("Nicht schlecht... im Wasser abschieﬂen...");
				break;
				case 1: System.out.println("Schiff getroffen, sogar eins von den Feinden!");
				break;
				case 2: System.out.println("Ihr beschieﬂt schon getroffene Schiffteile um Dominanz zu zeigen? Gef‰llt mir!");
				break;
				case 3: System.out.println("Komplettes Schiff versenkt! Jupdifuckingdo");
				break;
				case 4: System.out.println("Dieses komplette Schiff wurde schon versenkt! Reib es deinem Gegner unter die Nase!!");
				break;
			}
			
			if(Schiffsverwalter.is_alle_versenkt()) System.out.println("  Alle versenkt! Geiler Typ");
			
		}
		
	}

}
