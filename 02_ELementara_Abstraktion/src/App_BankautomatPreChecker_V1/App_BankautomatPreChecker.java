package App_BankautomatPreChecker_V1;

public class App_BankautomatPreChecker {

	public static void main(String[] args)
	{
		String kontonr;
		String passwort;
		int l�nge_Passwort;
		final short min_L�nge_Passwort;
		boolean isPr�f_Passwort;
		boolean isPr�fZiffer;
		int pr�fZiffer;
		int z_Quersumme;
		final long  dialogbeginn,
					dialogende,
					dialogdauer;
		boolean		isZeit;
		
		min_L�nge_Passwort = 6;
		/* Dialogbeginn erfassen */
		dialogbeginn = System.currentTimeMillis();
		System.out.println("Dialogbeginn ist: " + dialogbeginn);
		System.out.println("**********************************");
		
		/* personal Daten erfassen */
		System.out.println("Bitte KontoNr eingeben! (Kontonr besteht aus 6 Ziffern)");
		kontonr = ConsolReader.readString();
		System.out.println("Bitte Passwort eingeben");
		passwort = ConsolReader.readString();
		
		/* Passwort und Kontonummer pr�fen*/
		l�nge_Passwort = passwort.length();
		pr�fZiffer = kontonr.charAt(5)-'0';
		isPr�f_Passwort = l�nge_Passwort >= min_L�nge_Passwort;
		z_Quersumme = (kontonr.charAt(0)-'0')+(kontonr.charAt(1)-'0')+(kontonr.charAt(2)-'0')+(kontonr.charAt(3)-'0')+(kontonr.charAt(4)-'0');	
		isPr�fZiffer = (z_Quersumme % 10) == pr�fZiffer;
		
				
		/* Pr�fergebnis anzeigen*/
		System.out.println("....................................");
		System.out.println("Passwort ist : " + isPr�f_Passwort);
		System.out.println("KontoNr ist :" + isPr�fZiffer);
		
		/*  Zeit f�r weitere Eingabe erzeugen */
		dialogende = System.currentTimeMillis();
		dialogdauer = (dialogende - dialogbeginn)/1000 ;
		isZeit = dialogdauer<30;
		System.out.println("******************************");
		System.out.println("Dialogdauer ist : " + dialogdauer);
		if(isZeit)
		{
		System.out.println("Es gibt noch Zeit f�r weiter Eingabe");
		}
	else
		{
		System.out.println("Es gibt nicht mehr Zeit f�r weiter Eingabe");
		}//end if
	}//end main
}
