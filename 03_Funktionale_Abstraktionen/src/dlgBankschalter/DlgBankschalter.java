package dlgBankschalter;

import app_BankautomatPreChecker_V4.ConsolReader;

public class DlgBankschalter {
private char c_weitere_Beratung , c_gewuenschterTilgungsplaner,
			c_gewuenschteBerechnung=' ' ;
private double darlehen , leihdauer , nominalzins, berechneterWert;
private int z_abgelaufenenJahre = 0;
private Tilgungsplaner gewuenschterTilgungsplaner = null;
	public static void main(String[] args) 
		{new DlgBankschalter().betreibe_Anwendung();		
		}//end main
	private void betreibe_Anwendung()
		{do
			{System.out.println("Wollen Sie eine weitere Beratung?(j=Ja)");
			c_weitere_Beratung = ConsolReader.readChar();
			if (c_weitere_Beratung == 'j')
				{System.out.println("Bitte geben Sie den Darlehensbetrag ein!");
				darlehen = ConsolReader.readInt();
				System.out.println("Bitte geben Sie die Leihdauer ein!");
				leihdauer = ConsolReader.readInt();
				System.out.println("Bitte geben Sie die Nominalzinsfuss ein!");
				nominalzins = ConsolReader.readInt()/100.0;	
				Tilgungsplanung_durchf?hren();
				}		
			}
		while (c_weitere_Beratung == 'j');
		}//betreibe_Anwendung
	private void Berechnung_steuern()
		{do
			{System.out.println("Wollen Sie	 die Summe der Zinsen wissen?		 	 (0)");
			System.out.println("			 die Summe des Mittelabfluss wissen? 	 (1)");
			System.out.println("			 f?llige Zinsen im Jahe X wissen? 		 (2)");	
			System.out.println("			 f?llige Tilgung im Jahe X wissen? 	 	 (3)");
			System.out.println("			 f?llige Mittelabfluss im Jahe X wissen? (4)");
			System.out.println("Sonst											 	 (e)");
			c_gewuenschteBerechnung = ConsolReader.readChar();
			if (c_gewuenschteBerechnung >= 2 && c_gewuenschteBerechnung <= 4)
				{System.out.println("Das wievilte Jahr m?chten Sie betrachten? (lfdNr eingeben!)");
				z_abgelaufenenJahre = ConsolReader.readInt();
				} //end if
			switch (c_gewuenschteBerechnung)
				{case '0' : System.out.println(gewuenschterTilgungsplaner.get_Sum_Zinsen(darlehen, leihdauer, nominalzins));
				break ;
				case '1' : System.out.println(gewuenschterTilgungsplaner.get_Sum_Mittelabfluss(darlehen, leihdauer, nominalzins));
				break;
				case '2' : System.out.println(gewuenschterTilgungsplaner.get_faelligeZinsen_im_jahr(darlehen, leihdauer, nominalzins, z_abgelaufenenJahre));
				break;
				case '3' : System.out.println(gewuenschterTilgungsplaner.get_faelligeTilgung_im_Jahr(darlehen, leihdauer, nominalzins, z_abgelaufenenJahre));
				break;
				case '4' : System.out.println(gewuenschterTilgungsplaner.get_faelligerMittelabfluss_im_Jahr(darlehen, leihdauer, nominalzins, z_abgelaufenenJahre));
				break;
				//end switch
				}
			}
		while (c_gewuenschteBerechnung != 'e')	;
		}//end Berechnung_stueren
	private void Tilgungsplanung_durchf?hren()
		{do
			{System.out.println("Wollen Sie ein F?lligkeitsdarlehen? (f)");
			System.out.println(            "ein Ratendarlehen?       (r)");
			System.out.println("            ein Annuit?ten?          (a)");
			System.out.println("sonst                                (e)");
			c_gewuenschterTilgungsplaner = ConsolReader.readChar();
			switch (c_gewuenschterTilgungsplaner)
				{case 'f':gewuenschterTilgungsplaner = new FaelligkeitsdarlehensCalculator();
				break;
				case 'r' :
				break;
				case 'a' :
				break ;
				}
			if (c_gewuenschterTilgungsplaner !='e')
				{Berechnung_steuern();
				}// end if	
			}
		while(c_gewuenschterTilgungsplaner != 'e');	
		}// Tilgings_durchf?hren

}
