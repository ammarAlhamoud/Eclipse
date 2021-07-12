package DlgSonderzuschläge;

public class DlgSonderzuschläge 
{
	public static void main(String[] args) 
	{// Deklarieren
		boolean is_gebmonat_nicht_dezember,
				is_gebmonat_dezember;
		int sonder_zuschlag,
			lauf_jahr,
			lauf_monat,
			geb_monat,
			eintritt_jahr,
			eintritt_monat,
			z_def_monat,
			weitere_rechnung;
		
		//Daten erfassen
		sonder_zuschlag = 0 ;
		System.out.println("das Laufende Datum :");
		System.out.println("Jahr?");
		lauf_jahr = ConsolReader.readInt();
		System.out.println("Monat?");
		lauf_monat = ConsolReader.readInt();
		do
			{
			System.out.println("Personaldaten :");
			System.out.println("geburtsmonat");
			geb_monat = ConsolReader.readInt();
			System.out.println("Eintrittjahr?");
			eintritt_jahr = ConsolReader.readInt();
			do
				{System.out.println("Eintrittmonat?");
				eintritt_monat = ConsolReader.readInt();	
				}while (eintritt_monat < 1 || eintritt_monat > 12);
			
			//Sonderzuschläge berechnen
			z_def_monat = lauf_jahr * 12 + lauf_monat - (eintritt_jahr * 12 + eintritt_monat);
			is_gebmonat_nicht_dezember = geb_monat - lauf_monat == 1 ;
			is_gebmonat_dezember = geb_monat== 1 & lauf_monat == 12;	
			if (is_gebmonat_dezember || is_gebmonat_nicht_dezember)
				{sonder_zuschlag += 100;	
				 if (z_def_monat == 299)
					{sonder_zuschlag += 1000;
					}
				else if (z_def_monat == 119)
					{sonder_zuschlag += 300;				
					}	
				}
			System.out.println("Sonderzuschläge : " + sonder_zuschlag);	
			System.out.println("möchten Sie weitere Sonderzuschläge rechnen ?(weiter = 0)");
			weitere_rechnung = ConsolReader.readInt();
		} while (weitere_rechnung == 0);
		System.out.println("Das Programm wird beenden");
		
	}

}
