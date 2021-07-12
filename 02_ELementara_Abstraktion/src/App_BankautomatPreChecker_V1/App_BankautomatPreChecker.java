package App_BankautomatPreChecker_V1;

public class App_BankautomatPreChecker {

	public static void main(String[] args)
	{
		String kontonr;
		String passwort;
		int länge_Passwort;
		final short min_Länge_Passwort;
		boolean isPrüf_Passwort;
		boolean isPrüfZiffer;
		int prüfZiffer;
		int z_Quersumme;
		final long  dialogbeginn,
					dialogende,
					dialogdauer;
		boolean		isZeit;
		
		min_Länge_Passwort = 6;
		/* Dialogbeginn erfassen */
		dialogbeginn = System.currentTimeMillis();
		System.out.println("Dialogbeginn ist: " + dialogbeginn);
		System.out.println("**********************************");
		
		/* personal Daten erfassen */
		System.out.println("Bitte KontoNr eingeben! (Kontonr besteht aus 6 Ziffern)");
		kontonr = ConsolReader.readString();
		System.out.println("Bitte Passwort eingeben");
		passwort = ConsolReader.readString();
		
		/* Passwort und Kontonummer prüfen*/
		länge_Passwort = passwort.length();
		prüfZiffer = kontonr.charAt(5)-'0';
		isPrüf_Passwort = länge_Passwort >= min_Länge_Passwort;
		z_Quersumme = (kontonr.charAt(0)-'0')+(kontonr.charAt(1)-'0')+(kontonr.charAt(2)-'0')+(kontonr.charAt(3)-'0')+(kontonr.charAt(4)-'0');	
		isPrüfZiffer = (z_Quersumme % 10) == prüfZiffer;
		
				
		/* Prüfergebnis anzeigen*/
		System.out.println("....................................");
		System.out.println("Passwort ist : " + isPrüf_Passwort);
		System.out.println("KontoNr ist :" + isPrüfZiffer);
		
		/*  Zeit für weitere Eingabe erzeugen */
		dialogende = System.currentTimeMillis();
		dialogdauer = (dialogende - dialogbeginn)/1000 ;
		isZeit = dialogdauer<30;
		System.out.println("******************************");
		System.out.println("Dialogdauer ist : " + dialogdauer);
		if(isZeit)
		{
		System.out.println("Es gibt noch Zeit für weiter Eingabe");
		}
	else
		{
		System.out.println("Es gibt nicht mehr Zeit für weiter Eingabe");
		}//end if
	}//end main
}
