package arithmetischesMittel_erzeugen;

public class ArithmetischesMittel_erzeugen 
{

	public static void main(String[] args) 
	{
		//deklarieren
		int menge_zahlen,
			zahlen,
			z�hler = 1;
		double 	summe_zahlen = 0,
				arth_Mittel;
		//menge der Zahlen erfassen
		System.out.println("wie Viel Zahlen m�chte Sie eingeben?");
		menge_zahlen=ConsolReader.readInt();
		//Zahlen erfassen und summe rechnen
		
		if (menge_zahlen<=0)
			{
			System.out.println("Keine Zahlen eingegeben!");
			}
		else 
			{
			do	{System.out.println("geben Sie Zahl(" + z�hler+ ") ein");
				zahlen = ConsolReader.readInt();
				summe_zahlen += zahlen;
				z�hler ++ ;
				} 
			while (z�hler <= menge_zahlen);
			
			// arithmatische Mittel erzeugen
			arth_Mittel = summe_zahlen / menge_zahlen;
			System.out.println("arithmatische Mittel f�r die eingegebene Zahlen ist : "+ arth_Mittel);
			}	
	}
}
