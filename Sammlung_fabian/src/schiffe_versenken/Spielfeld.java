package schiffe_versenken;

public class Spielfeld {
	private static int[][] feld;
	private static int laenge;
	private static int z_schiff=1;
	
	public static void erzeugen(int ss_z_feldmax) {
		feld = new int[ss_z_feldmax+1][ss_z_feldmax+1];
	}
		
	public static void set_teil(int x_pos, int y_pos) {
		feld[x_pos][y_pos] += z_schiff;
		laenge--;	
		if(laenge==0)	z_schiff++;	
	}
	
	public static void ausgeben() {
		System.out.print("  ");
		if(feld.length>10) System.out.print(" ");
        for(int i=0; i<feld.length;i++)
        {   if((z_schiff>10||feld.length>10 ) &&i<10) System.out.print("0");		
        	System.out.print( i + " ");      
        }
        
        System.out.println("");
        
		for(int i=0; i<feld.length; i++)
		{	if(feld.length>10 && i<10) System.out.print("0");		
			System.out.print(i + " ");
			for(int k=0; k<feld[i].length; k++)
			{	if((z_schiff>10||feld.length>10) &&feld[k][i]<10) System.out.print("0");				
				System.out.print(feld[k][i] + " ");			
			}
		System.out.println(" ");
		}
		
	}
	
	public static void set_laenge(int ss_laenge) {
		laenge = ss_laenge;
	}
}
