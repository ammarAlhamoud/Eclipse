package k_5_2_App_Schiffe_abstrakt_LösgLamparter;

public class Schiffsverwalter_Konstant {
	final int MAX_KOORD=9; //MIN_KOORD = 1 fest
	final int ANZAHL_SCHIFFE = 3;
	final int ANZAHL_KREUZER = 1;
   	final int ANZAHL_UBOOTE = 2;

	private int z_schwimmendeSchiffe = 0;
	
	private Schiff[] t_Schiff;
	private boolean getroffen = false,
					schonmal_getroffen = false,
					versenkt = false;
	

	//Konstruktor fuer die Testklasse
	public Schiffsverwalter_Konstant()
	{  t_Schiff= new Schiff[3];
	   t_Schiff[0]=new Kreuzer(1, 2, 3, true);
	   t_Schiff[1]=new Uboot(1, 1, 0);
	   t_Schiff[2]=new Uboot(2, 1,3);
	   z_schwimmendeSchiffe = 3;
	   ausgabeSpielfeld();
	}
	
	
	public int getZ_schwimmendeSchiffe() {
		return z_schwimmendeSchiffe;
	}

	public int getZufallszahl(int ss_untere_Grenze,
			                   int ss_obere_Grenze){
		int bereich=ss_obere_Grenze-ss_untere_Grenze+1;
		return (int)(Math.random() * bereich)+ss_untere_Grenze;
	}

	public boolean hatGetroffen(){
		return getroffen;
	}
	
	public boolean hatVersenkt(){
		return getroffen;
	}
	
	public boolean hat_schonmal_getroffen() {
		return schonmal_getroffen;
	}

	public boolean isBelegt(int ss_pos_x, int ss_pos_y){
		boolean ss_isBelegt=false;
		
		for (int z_Schiff=0; z_Schiff<t_Schiff.length; z_Schiff++)
			if (t_Schiff[z_Schiff] != null
					&& 
				t_Schiff[z_Schiff].besetztKoordinate(ss_pos_x, ss_pos_y)
				)
			  		ss_isBelegt = true;
		return ss_isBelegt;
	}
	
	public boolean isBelegt(Teil[] t_Teil){
		boolean ss_isBelegt=false;
		
		for (int i=0; i<t_Teil.length; i++)
			if (isBelegt(t_Teil[i].pos_x, t_Teil[i].pos_y))
					ss_isBelegt = true;
		return ss_isBelegt;
	}

	public void set_Schuss(int ss_pos_x, int ss_pos_y){
		Schiff getroffenesSchiff = null;
		for (int i_Schiff=0; i_Schiff<t_Schiff.length; i_Schiff++)
			{if (t_Schiff[i_Schiff].besetztKoordinate(ss_pos_x, ss_pos_y))
			     {getroffenesSchiff= t_Schiff[i_Schiff];}
			}
		if ( getroffenesSchiff == null)
		   {getroffen=false;
		     schonmal_getroffen = false;
			System.out.println("Wasser.");
		   }
		else
	       {if (! getroffenesSchiff.is_getroffen(ss_pos_x, ss_pos_y))
				{System.out.println("Treffer!");
				getroffenesSchiff.set_Schuss(ss_pos_x, ss_pos_y);
			 	getroffen = true;
			 	schonmal_getroffen = false;
			 	if (getroffenesSchiff.is_versenkt()) 
			 		    z_schwimmendeSchiffe -= 1;
				}
			else 
				{System.out.println("Schon getroffen.");
				schonmal_getroffen = true;
				}
	      	}
		Uboot.manoevriere_Flotte();
	}
	
  public void ausgabeSpielfeld() {
	System.out.println("");
	System.out.println("");
	System.out.println("Y");
	String zeile="";
	String xzeile="  ";
	for (int yKoord=MAX_KOORD; yKoord>=1; yKoord--) {
		zeile = yKoord+" ";
		xzeile += MAX_KOORD-yKoord+1+"-";
		for (int xKoord=1; xKoord<=MAX_KOORD; xKoord++) {
			String aktuellesFeld = "~~";
			for (int s=0; s<ANZAHL_SCHIFFE; s++){
				if (t_Schiff[s].besetztKoordinate(xKoord, yKoord))
				{	if (! t_Schiff[s].is_versenkt())
					{	if (classOf(t_Schiff[s]).equals("Kreuzer"))
						{aktuellesFeld = "$$";}
						if (classOf(t_Schiff[s]).equals("Uboot"))
						{aktuellesFeld = "uu";}
					}
					if (t_Schiff[s].is_versenkt()) {aktuellesFeld="[]";}
					if (t_Schiff[s].is_getroffen(xKoord, yKoord))
					{aktuellesFeld = "><";}
					if (t_Schiff[s].is_versenkt()) {aktuellesFeld="xx";}
				}
			}
			zeile += aktuellesFeld;
		}
		System.out.println(zeile);
		zeile="";
	 }
	 xzeile += "-> X";
	 System.out.println(xzeile);
	}
	
	private static String classOf(Object ss_object)
	{return ss_object.getClass().getSimpleName();
	}	
}
