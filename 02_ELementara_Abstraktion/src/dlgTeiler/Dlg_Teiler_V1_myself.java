package dlgTeiler;

public class Dlg_Teiler_V1_myself
{

	public static void main(String[] args) 
	//Variante (1):
	{
		// Deklarieren		
		int a,
			b;	
		//Angaben erfassen
		System.out.println("Bitte die Zahl a eingeben");
		a = ConsolReader.readInt();
		System.out.println("Bitte die Zahl b eingeben");
		b = ConsolReader.readInt();	
		// der Nenner b prüfen	
		if(b==0)
			{
			System.out.println(b+" ist kein Teiler von "+a);
			}
		else 
			//der Teiler prüfen
			{
			if(a%b==0)
				{
					System.out.println(b+" ist ein Teiler von "+a);
				}
			else
				{
					System.out.println(b+" ist kein Teiler von "+a);
				} //Ende if
		}// Ende if
		//...............................................................................
		// Variante (2) 
		//................................................................................
			// Deklarieren
			int x,
				y;
			boolean y_Teiler;
			// Angaben erfassen
			System.out.println("Bitte die Zahl x eingeben");
			x = ConsolReader.readInt();
			System.out.println("Bitte die Zahl y eingeben");
			y = ConsolReader.readInt();	
			
			// Teiler prüfen
			y_Teiler = (y!=0) && (x%y==0);
			// Ergebnisse anzeigen
			if (y_Teiler==true)
				{
				System.out.println(y+" ist ein Teiler von "+x);
				}
			else
				{
				System.out.println(y+" ist kein Teiler von "+x);
				}//ende if				
	}
}
