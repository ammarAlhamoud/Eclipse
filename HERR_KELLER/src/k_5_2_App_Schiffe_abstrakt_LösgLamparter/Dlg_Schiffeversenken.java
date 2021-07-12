package k_5_2_App_Schiffe_abstrakt_LösgLamparter;

public class Dlg_Schiffeversenken {

	public static void main(String[] args) {
	
		Schiffsverwalter schiffsverwalter = new Schiffsverwalter();
		int pos_x;
		int pos_y;
		String[] c_s_schuss;
		
		System.out.println("Schuss in der Form x,y eingeben.");
				
		do
		{System.out.println("Schiessen auf?");
		c_s_schuss=ConsolReader.readString().split(",");
		pos_x=Integer.parseInt(c_s_schuss[0]);
		pos_y=Integer.parseInt(c_s_schuss[1]);
		if (pos_x==0 && pos_y==0) schiffsverwalter.ausgabeSpielfeld();
		else schiffsverwalter.set_Schuss(pos_x, pos_y);
		
		if (schiffsverwalter.hatGetroffen())
		{	if (schiffsverwalter.hat_schonmal_getroffen())
				System.out.println("Schon getroffen");
			else
			{System.out.println("Treffer!");
			if (schiffsverwalter.hatVersenkt())
				System.out.println("Noch "+
					schiffsverwalter.getZ_schwimmendeSchiffe()+" Schiffe.");
			}
		}
		else
			System.out.println("Daneben.");
		} while (schiffsverwalter.getZ_schwimmendeSchiffe() != 0);
		
		System.out.println("Gewonnen!");
		System.out.println("Alle Schiffe versenkt!");
	}
	
}
