package schiffe_versenken_v2;

public class Spielfeld {
	private static int[][] feld;
	
	public static void erzeugen(int ss_z_feldmax) {
		feld = new int[ss_z_feldmax+1][ss_z_feldmax+1];
	}
	
	public static void set_teil(int x_pos, int y_pos) {
		feld[x_pos][y_pos]++;
	}
	
	public static void ausgeben() {
		for(int i=0; i<feld.length; i++)
		{	for(int k=0; k<feld[i].length; k++)
			{	System.out.print(feld[k][i] + " ");			
			}
		System.out.println(" ");
		}
	}
}
