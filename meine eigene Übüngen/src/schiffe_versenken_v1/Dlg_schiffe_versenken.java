package schiffe_versenken_v1;

import java.util.Scanner;

public class Dlg_schiffe_versenken {	
	public static Scanner s = new Scanner (System.in);
	
	public static void main(String[] args) {
		int schussergebnis;
		
		
		Schiffsverwalter.schiffsverwalter();
	
		while(true)
		{	System.out.println("X f�r Schuss angeben");
			int x_schuss = s.nextInt();
			System.out.println("Y f�r Schuss angeben");
			int y_schuss = s.nextInt();
		
			Schiffsverwalter.schuss_auf_schiffe_setzen(x_schuss,y_schuss);
		
			schussergebnis = Schiffsverwalter.get_last_schussergebnis();
			switch(schussergebnis)
			{	case 0: System.out.println("Nicht schlecht... im Wasser abschie�en...");
				break;
				case 1: System.out.println("Schiff getroffen, sogar eins von den Feinden!");
				break;
				case 2: System.out.println("Ihr beschie�t schon zerst�rte Schiffe um Dominanz zu zeigen? Gef�llt mir!");
				break;
			}
			
		}
		
	}

}
