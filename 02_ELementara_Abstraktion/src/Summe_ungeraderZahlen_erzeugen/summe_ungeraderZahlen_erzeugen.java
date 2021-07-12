package Summe_ungeraderZahlen_erzeugen;

public class summe_ungeraderZahlen_erzeugen {

	public static void main(String[] args)
	{
		//Deklarieren
		int n=0,
		ungeradeZahl,
		sum_ungerade;
		
		// n erfassen
		while (n>=1 || n<=100)
		{
			System.out.println("Bitte eine Zahl zwische 1 und 100 eingeben");
			n = ConsolReader.readInt();
			ungeradeZahl = 1;
			sum_ungerade = 0;
			 while (ungeradeZahl <= n)
			 	{
			 	 sum_ungerade += ungeradeZahl;
			 	ungeradeZahl +=2;
			 	}//end while
			 System.out.println("Die Summe von ungerade Zahlen zwischen 1 und " + n + " = " + sum_ungerade);
		}//end while
			
	}//end main

}
