package notizbuch;

import notizbuch.ConsolReader;

public class Dlg_notiz {
	
	public static void main(String[] args) {	
		
		Notizbuch.create_notiz("Hallih<u>1</u>allo");
		Notizbuch.create_notiz("me<u>2</u>eeeh");
		Notizbuch.create_notiz("<u>3</u>sag ich doch");
		Notizbuch.create_notiz("sag ich<u>4</u>");
		Notizbuch.create_notiz("sag ich<u>5</u>nicht <u>6</u>");
		
		while(true)
		{	System.out.println("\n0: Vorhandene Notizen bearbeiten"
					   		 + "\n1: Neue Notiz erstellen"
					   		 + "\n2: Alle Notizen anzeigen"
					   		 + "\n3: Schlagworte aller Notizen anzeigen"
					   		 + "\n4: Nach beliebigem Ausdruck Notizen durchsuchen"
							 + "\n5: Nach Schlagwort Notizen durchsuchen"
					   		 + "\n6: Speichere in Datei"
							 + "\n7: Lese aus Datei");
		
			int auswahl=ConsolReader.readInt();
		
			switch(auswahl)
			{	case 0: bearbeite_notiz();
				break;
				case 1: erzeuge_notiz();
				break;
				case 2:	System.out.print(Notizbuch.get_alle_inhalte());
				break;
				case 3:	System.out.print(Notizbuch.get_alle_schlagworte());
				break;
				case 4: durchsuche_notizen_suchtext();
				break;	
				case 5: durchsuche_notizen_schlagwort();
				break;	
				case 6: Notizbuch.speicher_notizen();
				break;
				case 7: Notizbuch.lese_notizen();
				break;
			}	
		}
		
	}
	
	public static void bearbeite_notiz() {
		int auswahl;
		int notiznr;
		if(Notizbuch.get_alle_notiznr().equals(""))
		{ System.out.println("keine Notizen vorhanden");
		}
		else
		{
			do
			{	System.out.println("Welche Notiz soll bearbeitet werden?"
							+"\nVorhandene Notizen:"+Notizbuch.get_alle_notiznr());		
				notiznr = ConsolReader.readInt();
				System.out.println("Notiz "+notiznr+": "+Notizbuch.get_inhalt(notiznr));
	
				do
				{	System.out.println("\n0: gewählte Notiz erweitern "
									  +"\n1: gewählte Notiz löschen"
									  +"\n2: redo"
									  +"\n3  Alter anzeigen"
									  +"\n4: andere Notiz bearbeiten"
									  +"\n5: zurück zum Hauptmenü ");
			
					auswahl=ConsolReader.readInt();
					switch(auswahl)
					{	case 0: erweitere_notiz(notiznr);
								System.out.println("Notiz "+notiznr+": "+Notizbuch.get_inhalt(notiznr));
						break;
						case 1: Notizbuch.loesche_notiz(notiznr);
								System.out.println("Notiz "+notiznr+" gelöscht");
						break;
						case 2: Notizbuch.redo(notiznr);
								System.out.println("Notiz "+notiznr+" zurückgesetzt");
								System.out.println("Notiz "+notiznr+": "+Notizbuch.get_inhalt(notiznr));
						break;
						case 3: System.out.println("Alter in Sekunden: " +Notizbuch.get_alter(notiznr));
						break;
						case 4: //andere Notiz bearbeiten;
						break;	
						case 5: //Hauptmenü
						break;	
					}			
				}while(auswahl!=1 && auswahl!=4 && auswahl!=5);
			}while(auswahl!=1 &&  auswahl!=5);
		}		
	}
	
	private static void erzeuge_notiz() {
		System.out.println("Text angeben: ");
		String neuer_text = ConsolReader.readString();
		int notiznr = Notizbuch.create_notiz(neuer_text);
		System.out.println("Notiz Nr " + notiznr+ " wurde erstellt");
				
	}
	
	private static void erweitere_notiz(int ss_notiznr) {
		System.out.println("Stelle zum einfügen angeben");
		int einfuegestelle = ConsolReader.readInt();
		System.out.println("Was soll eingefügt werden?");
		String text = ConsolReader.readString();
		Notizbuch.erweitere_notiz(ss_notiznr, einfuegestelle, text);
	}
	
	private static void durchsuche_notizen_suchtext() {
		System.out.println("Nach welchem Ausdruck soll gesucht werden?");
		String suchtext = ConsolReader.readString();
		System.out.print("Gefundene Notizen: \n"+Notizbuch.get_notizen_mit_suchtext(suchtext));
	}
	
	private static void durchsuche_notizen_schlagwort() {
		System.out.println("Nach welchem Schlagwort soll gesucht werden?");
		String schlagwort = ConsolReader.readString();
		System.out.print("Gefundene Notizen: \n"+Notizbuch.get_notizen_mit_schlagwort(schlagwort));
	}
}
