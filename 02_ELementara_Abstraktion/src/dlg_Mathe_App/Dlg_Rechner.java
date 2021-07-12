package dlg_Mathe_App;
public class Dlg_Rechner {

	public static void main(String[] args) 
	{
		// deklarieren 
		int aufgabe_menu;
		
		// Menu erzeugen
		System.out.println("Hallo , wie kann ich Ihnen helfen ?");
		do {
			System.out.println("***************************************************************");
			System.out.println("1:  arithemetische Mittel ");
			System.out.println("2:  Kapitalentwicklung bis zum doppelten Wert ");
			System.out.println("3:  Summe der ungeraden Zahlen  ");
			System.out.println("4:  das Pragramm beenden");
			System.out.println("***************************************************************");
			aufgabe_menu = ConsolReader.readInt();
			switch (aufgabe_menu)
			{case 1 :arithemetischesMittel_erzeugen ();break;
			case 2 : kapitalentwicklung();break;
			case 3 : summe_ungeradeZahlen();
			case 4 : System.out.println("Das Programm hat beendet , Vielen Dank");break;
			default : System.out.println("Bitte drucken Sie eine Nummer 1 , 2 , 3 oder 4 !");break;	
			}
		} while (aufgabe_menu != 4);	
	}
	
	public static void arithemetischesMittel_erzeugen ()
	{
		//deklarieren
		double sum_zahl=0;
		double	z_zahl=0;
		int	zahl ;
		int dlg_status=1;
		double arith_mittel;
		
		//summe erzeugen
		while (dlg_status == 1)
		  {System.out.println("Geben Sie eine Zahl");
		  zahl = ConsolReader.readInt();
		  sum_zahl += zahl;
		  z_zahl ++;
		  System.out.println("Möchten Sie noch eine Zahl eingeben? ( 1=weiter, sonst=ende)");
		  dlg_status= ConsolReader.readInt();
		  }
		
		//arithemetisches Mittel erzeugen
		arith_mittel = sum_zahl / z_zahl;
		System.out.println("Die arithemetische Mittel für die eingegebenen Zahlen ist: " + arith_mittel);	
	}
	public static void kapitalentwicklung()
	{
		//deklarieren
		int jahr = 0,
			zinssatz;
		double anfang_kapital,
				doppel_kapital,
				neu_kapital,
				zinsen;
				
		//AnfangsKapital erfassen
		System.out.println("wie hoch ist Ihre Anfangskapital ?");
		anfang_kapital = ConsolReader.readInt();
		
		//Anfangskapital verdoppeln
		doppel_kapital = anfang_kapital * 2;
		neu_kapital = anfang_kapital;
		
		//Zinssatz erfassen
		System.out.println("wie hoch ist Ihre Zinsssatz ?");
		zinssatz = ConsolReader.readInt();
		
		//neue Kapital berechnen bis die neue Kapital mehr als verdoppelte Kapital
		while (neu_kapital < doppel_kapital)
			{zinsen = (zinssatz * neu_kapital)/100;
			neu_kapital += zinsen;
			jahr ++ ;
			}
		
		//das Ergebnis anzeigen
		System.out.println("nach " + jahr + " Jahren wird sich Ihre Kapital verdoppeln! ");
	}
	public static void summe_ungeradeZahlen()
	{
		// deklarieren
		int nächst_ungeradezahl = 1 ,
			zahl ,
			sum_ungerade = 0;
		
		// Summe ungerade Zahlen erzeugen
		System.out.println("Bitte geben Sie bis eine Zahl , bis der  Sie die Summe der ungeraden Zahlen berechenn möchten?");
		zahl = ConsolReader.readInt();
		do 
			{sum_ungerade += nächst_ungeradezahl;
			nächst_ungeradezahl += 2;		
			} while (nächst_ungeradezahl <= zahl );
		
		System.out.println(" Die Summe der ungeraden Zahlen bis " + zahl + " ist " + sum_ungerade);
	}
}
