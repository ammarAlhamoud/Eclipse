package generalisierung;

import schiffe_versenken.*;
import notizbuch.*;

public class Programmmoderator {
	
	public static void main(String[] args) {
		Moderierbar moderierbar=null;
		boolean is_programmende=false;
		System.out.println("Danke, dass Sie sich f�r die \"gro�e-Party-Spa�-Spielesammlung, aber nicht nur Spiele, auch anderes... irgendwann in der Zukunft\" entschieden haben.");
		System.out.println("\tKeine Garantie und Haftung f�r falsche Eingaben und bleibende Sch�den an Ihrem Computer.");
		System.out.println("\tIch freue mich �ber Ihr Feedback und werde es mit bestem Gewissen ignorieren.");
		System.out.println("\t40% Ihrer Rechenleistung werden nun verwendet um Hentais zu rendern. Danke f�r Ihren Beitrag.");
		do {
			System.out.println("\nBitte w�hlen Sie nun aus der gro�en Auswahl Ihre gew�nschte Anwendung:");
		
			System.out.println("\t1: Schiffe versenken");
			System.out.println("\t2: Notizbuch");
			System.out.println("\tjegliche andere Eingabe f�hrt zum Programmende");
			int auswahl = ConsolReader.readInt();
		
			switch(auswahl)
			{	case 1: moderierbar = new Dlg_schiffe_versenken(); 	//Speichern einf�gen
				break;
				case 2: moderierbar = new Dlg_notiz();				//Archivar generalisieren
				break;
				default: is_programmende = true;					//lustiger default einf�gen
			}														//sortieren einf�gen, generalisieren
		
			if(!is_programmende) steuere_Programm(moderierbar);
		}while(!is_programmende);
	}
	
	public static void steuere_Programm(Moderierbar ss_moderierbar) {	
		ss_moderierbar.programmausgangslage_erzeugen();	
		do{	ss_moderierbar.programmrunde_durchfuehren();
		}while(!ss_moderierbar.is_programmende());			
		ss_moderierbar.programmergebnis_anzeigen();	
	}

}
