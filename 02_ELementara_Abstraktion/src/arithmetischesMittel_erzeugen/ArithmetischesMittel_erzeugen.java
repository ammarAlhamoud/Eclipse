package arithmetischesMittel_erzeugen;

public class ArithmetischesMittel_erzeugen 
{

	public static void main(String[] args) 
	{
		//deklarieren
		int menge_zahlen,
			zahlen,
			zähler = 1;
		double 	summe_zahlen = 0,
				arth_Mittel;
		//menge der Zahlen erfassen
		System.out.println("wie Viel Zahlen möchte Sie eingeben?");
		menge_zahlen=ConsolReader.readInt();
		//Zahlen erfassen und summe rechnen
		
		if (menge_zahlen<=0)
			{
			System.out.println("Keine Zahlen eingegeben!");
			}
		else 
			{
			do	{System.out.println("geben Sie Zahl(" + zähler+ ") ein");
				zahlen = ConsolReader.readInt();
				summe_zahlen += zahlen;
				zähler ++ ;
				} 
			while (zähler <= menge_zahlen);
			
			// arithmatische Mittel erzeugen
			arth_Mittel = summe_zahlen / menge_zahlen;
			System.out.println("arithmatische Mittel für die eingegebene Zahlen ist : "+ arth_Mittel);
			}	
	}
}
