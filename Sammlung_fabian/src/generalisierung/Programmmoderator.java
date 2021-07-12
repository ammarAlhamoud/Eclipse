package generalisierung;

import schiffe_versenken.*;
import notizbuch.*;

public class Programmmoderator {
	
	public static void main(String[] args) {
		Moderierbar moderierbar=null;
		boolean is_programmende=false;
		System.out.println("Danke, dass Sie sich für die \"große-Party-Spaß-Spielesammlung, aber nicht nur Spiele, auch anderes... irgendwann in der Zukunft\" entschieden haben.");
		System.out.println("\tKeine Garantie und Haftung für falsche Eingaben und bleibende Schäden an Ihrem Computer.");
		System.out.println("\tIch freue mich über Ihr Feedback und werde es mit bestem Gewissen ignorieren.");
		System.out.println("\t40% Ihrer Rechenleistung werden nun verwendet um Hentais zu rendern. Danke für Ihren Beitrag.");
		do {
			System.out.println("\nBitte wählen Sie nun aus der großen Auswahl Ihre gewünschte Anwendung:");
		
			System.out.println("\t1: Schiffe versenken");
			System.out.println("\t2: Notizbuch");
			System.out.println("\tjegliche andere Eingabe führt zum Programmende");
			int auswahl = ConsolReader.readInt();
		
			switch(auswahl)
			{	case 1: moderierbar = new Dlg_schiffe_versenken(); 	//Speichern einfügen
				break;
				case 2: moderierbar = new Dlg_notiz();				//Archivar generalisieren
				break;
				default: is_programmende = true;					//lustiger default einfügen
			}														//sortieren einfügen, generalisieren
		
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
