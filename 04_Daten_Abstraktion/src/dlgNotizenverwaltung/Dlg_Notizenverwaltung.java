package dlgNotizenverwaltung;

import java.util.ArrayList;

public class Dlg_Notizenverwaltung 
{public static void main(String[] args) 
	{String text;
	int aufgabeNr,
		notizNr,
		einfuegeStelle;

	Notizbuch w_notizbuch = new Notizbuch();
	do 
		{System.out.println("was möchten Sie gerne machen?");
		System.out.println("0: Prgrammende");
		System.out.println("1: eine Notiz erstellen");
		System.out.println("2: Inhalt einer Notiz anzeigen");
		System.out.println("3: eine Notiz löschen");
		System.out.println("4: eine Notiz erweitern");
		System.out.println("5: Redo");
		System.out.println("6: Notizen mit wichtigeseten Text liefern");
		System.out.println("7: Alter einer Notiz liefern");
		System.out.println("8: Notizen innerhalb eines bestimmten "
				+ "Datumsintervalls liefern");
		System.out.println("9: Notizen nach oder vor einem bestimmten "
				+ "Datumsintervalls liefern");
		System.out.println("10:Notizen mit unerledigten Aufgaben "
				+ "und Zeitaufwand liefern");
		System.out.println("11:Notizen speichern");
		System.out.println("12:Notizen lesen");

		aufgabeNr = ConsolReader.readInt();
		switch (aufgabeNr)
			{case 0 : System.out.println("Ende des Programms , Danke!");
			break;
			case 1 :{System.out.println("schreiben Sie bitte Ihre Notiz");
					text = ConsolReader.readString();
					w_notizbuch.erstelle_Notiz(text);			
					};
			break;
			case 2 :{System.out.println("Geben Sie bitte die NotizNr ein");
					notizNr = ConsolReader.readInt();
					if (w_notizbuch.is_NotizNr_existiert(notizNr))
						{System.out.println
								(w_notizbuch.get_Notiz_Inhalt(notizNr));
						}
					else
						{System.out.println("Diese Notiz mit diesem ID wurde "
							+ "entweder nocht nicht erstellt oder  gelöscht");	
						}
					};
			break;
			case 3 :{System.out.println("Geben Sie bitte die NotizNr ein");
					notizNr = ConsolReader.readInt();
					if (w_notizbuch.is_NotizNr_existiert(notizNr))
						{w_notizbuch.loesche_Notiz (notizNr);
						System.out.println
									("Die Notiz wurde erfölgreich gelöscht!");
						}
					else
						{System.out.println("Diese Notiz mit diesem ID wurde "
							+ "entweder nocht nicht erstellt oder  gelöscht");	
						}
					};
			break;	
			case 4 :{System.out.println("Geben Sie bitte die NotizNr ein"
					+ ", welche Sie erweitern möchten");
					notizNr = ConsolReader.readInt();
					System.out.println("Geben Sie bitte  die StelleNr,"
					+ " an die Sie Ihre erwünschte Notiz erwitern möchte");
					einfuegeStelle = ConsolReader.readInt();
					System.out.println
					("schreiben Sie bitte Ihre Erweiterungstext");
					text = ConsolReader.readString();
					w_notizbuch.erweitere_Notiz(notizNr, einfuegeStelle, text);
					};
			break;
			case 5 :{System.out.println("Geben Sie bitte die NotizNr ein");
					notizNr = ConsolReader.readInt();
					w_notizbuch.redo(notizNr);
					System.out.println("Redo wurde an einem Notiz gemacht!");
					};
			break;
			case 6 :{String[][] w_Notizen_mitWichtige_Text ;
				System.out.println("Schreiben Sie bitte den text, "
						+ "nach den Sie suchen möchten!");
				text = ConsolReader.readString();
				w_Notizen_mitWichtige_Text = 
						w_notizbuch.get_Notizen_mitWichtige_Text(text);
				if (w_Notizen_mitWichtige_Text==null)
					{System.out.println("Kein Ergebnis gefunden!");				
					}
				else
					{for (int i=0; i<w_notizbuch.z_Notizen_mitWichtigeText;i++)
						{System.out.println("NotizID= " 
										+ w_Notizen_mitWichtige_Text[i][0]
						+ " : " + w_Notizen_mitWichtige_Text[i][1]);		
						}	
					}
				};
			break;
			case 7 :{int[] notizalter = new int[3];
					System.out.println("Geben Sie bitte die NotizNr ein");
					notizNr = ConsolReader.readInt();
					notizalter = w_notizbuch.get_Notiz_Alter(notizNr);
					System.out.println
						("diese Notiz hat das Alter: " + notizalter[0]
							+ " Tage , " + notizalter[0] + " Stunde , "
							+ notizalter[2]+ " Minute");
					};
			break;	
			case 8 :{System.out.println("Geben Sie bitte das erwünschte"
					+ " Startdatum ein (Format yyyy-MM-dd)");
					String startdatum = ConsolReader.readString();
					System.out.println
					("Geben Sie bitte das erwünschte Enddatum ein"
							+ " (Format yyyy-MM-dd)");
					String enddatum = ConsolReader.readString();
					ArrayList<Notiz> notizen_innerhalb_ZI = 
							w_notizbuch.get_Notizen_innerhalb_Datumsintervalls
														(startdatum, enddatum);
					
					if (notizen_innerhalb_ZI.isEmpty()) 
						{System.out.println("Kein Ergebniss gefunden!");
						}
					else
						{for (Notiz i_notiz: notizen_innerhalb_ZI)
							{System.out.println("NotizID "
											+ i_notiz.getNotizNr()
							+ ": " + i_notiz.get_Inhalt());			
							}	
						}
					
					};
			break;
			case 9 :{int such_anfrage;
					System.out.println("was hätten Sie gerne Suchen nach:(1)"
					+ " oder vor:(2) einem bestimmten Datum?");
					such_anfrage = ConsolReader.readInt();
					System.out.println("Geben Sie bitte das "
							+ "erwünschte Datum ein"+ " (Format yyyy-MM-dd)");
					String datum = ConsolReader.readString();
					ArrayList<Notiz> notizen_nach_oder_vor_Datum =
													new ArrayList<Notiz>();
					switch (such_anfrage)
						{case 1: {notizen_nach_oder_vor_Datum = 
								w_notizbuch.get_Notizen_nach_Datum(datum);
								};
						break;
						case 2: {notizen_nach_oder_vor_Datum = 
								w_notizbuch.get_Notizen_vor_Datum(datum);
								};
						break;	
						}	
					if (notizen_nach_oder_vor_Datum.isEmpty()) 
						{System.out.println("Kein Ergebniss gefunden!");
						}
					else
						{for (Notiz i_notiz: notizen_nach_oder_vor_Datum)
							{System.out.println("NotizID "
								+ i_notiz.getNotizNr()
								+ ": " + i_notiz.get_Inhalt());			
							}	
						}
					};
			break;
			case 10 :{String[][] t_Notizen_mitunerledigten_Aufgaben ;
					System.out.println("Sie haben die folgende Notizen mit"
							+ " unerledigten Aufgaben");
					t_Notizen_mitunerledigten_Aufgaben =
							w_notizbuch.get_Notizen_mit_unerledigteAufgaben();
					if (t_Notizen_mitunerledigten_Aufgaben==null)
						{System.out.println("Kein Ergebnis gefunden!");				
						}
					else
					{for (int i=0; 
						i<w_notizbuch.z_Notizen_mit_unerledigtenAufgaben; i++)
						{System.out.println("NotizID=" 
						+ t_Notizen_mitunerledigten_Aufgaben[i][0]
						+ ": " + t_Notizen_mitunerledigten_Aufgaben[i][1]
							+ " Zeitschätzung: "
							+ t_Notizen_mitunerledigten_Aufgaben[i][2]
							+ ":: Quote: " 
							+ t_Notizen_mitunerledigten_Aufgaben[i][3]+"%");		
						}	
					}		
				};
			break;
			case 11 :{w_notizbuch.speicher_notizen();
					 System.out.println("Ihre Notizen wurde in einer"
					 		+ " Datei gespeichert");
					 }	
			break;
			case 12 :{w_notizbuch.lese_notizen();
			 System.out.println("Ihre Notizen wurde zum Programm geladen"
			 		+ ", Sie können nun weiterabeiten");
			 }	
			break;
			}
		}
	while (aufgabeNr != 0 );
	}

}
