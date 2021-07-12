package notizbuch;

import generalisierung.*;

public class Dlg_notiz implements Moderierbar{
	Notizbuch meinNotizbuch = new Notizbuch();
	boolean is_programmende = false;
	public void programmausgangslage_erzeugen() {
		meinNotizbuch.create_notiz("Hallih<u>1</u>allo");
		meinNotizbuch.create_notiz("me<u>2</u>eeeh");
		meinNotizbuch.create_notiz("<u>3</u>sag ich doch");
		meinNotizbuch.create_notiz("sag ich<u>4</u>");
		meinNotizbuch.create_notiz("sag ich<u>5</u>nicht <u>6</u>");
	}
	
	public void programmrunde_durchfuehren() {
		System.out.println("\n0: Vorhandene Notizen bearbeiten"
		   		 + "\n1: Neue Notiz erstellen"
		   		 + "\n2: Alle Notizen anzeigen"
		   		 + "\n3: Schlagworte aller Notizen anzeigen"
		   		 + "\n4: Nach beliebigem Ausdruck Notizen durchsuchen"
				 + "\n5: Nach Schlagwort Notizen durchsuchen"
		   		 + "\n6: Speichere in Datei"
				 + "\n7: Lese aus Datei"
		   		 + "\n8: Programmende");

		int auswahl=ConsolReader.readInt();		
		switch(auswahl)
		{	case 0: bearbeite_notiz();
			break;
			case 1: erzeuge_notiz();
			break;
			case 2:	System.out.print(meinNotizbuch.get_alle_inhalte());
			break;
			case 3:	System.out.print(meinNotizbuch.get_alle_schlagworte());
			break;
			case 4: durchsuche_notizen_suchtext();
			break;	
			case 5: durchsuche_notizen_schlagwort();
			break;	
			case 6: meinNotizbuch.speicher_notizen();
					System.out.print("Alle Notizen in Datei gespeichert");
			break;
			case 7: meinNotizbuch.lese_notizen();
					System.out.print("Alle Notizen aus Datei ausgelesen!");
			break;
			case 8: is_programmende  =true;
			break;
		}		
	}
	
	public boolean is_programmende() {
		return is_programmende;
	}
	
	public void programmergebnis_anzeigen() {
		System.out.println("Notizbuch Beendet");
	}
	
	public void bearbeite_notiz() {
		int auswahl;
		int notiznr;
		if(meinNotizbuch.get_alle_notiznr().equals(""))
		{ System.out.println("keine Notizen vorhanden");
		}
		else
		{
			do
			{	System.out.println("Welche Notiz soll bearbeitet werden?"
							+"\nVorhandene Notizen:"+meinNotizbuch.get_alle_notiznr());		
				notiznr = ConsolReader.readInt();
				System.out.println("Notiz "+notiznr+": "+meinNotizbuch.get_inhalt(notiznr));
	
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
								System.out.println("Notiz "+notiznr+": "+meinNotizbuch.get_inhalt(notiznr));
						break;
						case 1: meinNotizbuch.loesche_notiz(notiznr);
								System.out.println("Notiz "+notiznr+" gelöscht");
						break;
						case 2: meinNotizbuch.redo(notiznr);
								System.out.println("Notiz "+notiznr+" zurückgesetzt");
								System.out.println("Notiz "+notiznr+": "+meinNotizbuch.get_inhalt(notiznr));
						break;
						case 3: System.out.println("Alter in Sekunden: " +meinNotizbuch.get_alter(notiznr));
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
	
	private void erzeuge_notiz() {
		System.out.println("Text angeben: ");
		String neuer_text = ConsolReader.readString();
		int notiznr = meinNotizbuch.create_notiz(neuer_text);
		System.out.println("Notiz Nr " + notiznr+ " wurde erstellt");
				
	}
	
	private void erweitere_notiz(int ss_notiznr) {
		System.out.println("Stelle zum einfügen angeben");
		int einfuegestelle = ConsolReader.readInt();
		System.out.println("Was soll eingefügt werden?");
		String text = ConsolReader.readString();
		meinNotizbuch.erweitere_notiz(ss_notiznr, einfuegestelle, text);
	}
	
	private void durchsuche_notizen_suchtext() {
		System.out.println("Nach welchem Ausdruck soll gesucht werden?");
		String suchtext = ConsolReader.readString();
		System.out.print("Gefundene Notizen: \n"+meinNotizbuch.get_notizen_mit_suchtext(suchtext));
	}
	
	private void durchsuche_notizen_schlagwort() {
		System.out.println("Nach welchem Schlagwort soll gesucht werden?");
		String schlagwort = ConsolReader.readString();
		System.out.print("Gefundene Notizen: \n"+meinNotizbuch.get_notizen_mit_schlagwort(schlagwort));
	}
}
