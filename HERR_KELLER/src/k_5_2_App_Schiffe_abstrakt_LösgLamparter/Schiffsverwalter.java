package k_5_2_App_Schiffe_abstrakt_LösgLamparter;

public class Schiffsverwalter {
	final int MAX_KOORD=9; //MIN_KOORD = 1 fest
	final int ANZAHL_SCHIFFE = Math.max(MAX_KOORD-1,2);
	final int ANZAHL_KREUZER = ANZAHL_SCHIFFE/2;
    final int MIN_LAENGE_KREUZER = MAX_KOORD/3;
    final int MAX_LAENGE_KREUZER = MAX_KOORD/2;
	final int ANZAHL_UBOOTE = ANZAHL_SCHIFFE - ANZAHL_KREUZER;

	private int z_schwimmendeSchiffe = 0;
	
	private Schiff[] t_Schiff= new Schiff[ANZAHL_SCHIFFE];
	private boolean getroffen = false,
					schonmal_getroffen = false,
					versenkt = false;
	

	protected static boolean isTestphase = false;

	//Konstruktor fuer die Testklasse
	public Schiffsverwalter(boolean ss_isTestphase)
	{  t_Schiff= new Schiff[3];
	   t_Schiff[0]=new Kreuzer(1, 2, 3, true);
	   t_Schiff[1]=new Uboot(1, 1, 0);
	   t_Schiff[2]=new Uboot(2, 1, 3);
	   z_schwimmendeSchiffe = 3;
	   isTestphase = true;
	   
	}
	
	public Schiffsverwalter()
		{ int startpos_x,
			  startpos_y,
			  laenge;
		  boolean is_senkrecht;

		/* Kreuzer setzen*/
		for (int i_Kreuzer =0; i_Kreuzer < ANZAHL_KREUZER; i_Kreuzer++)
		{	do
			{  laenge=getZufallszahl(MIN_LAENGE_KREUZER,MAX_LAENGE_KREUZER);
				is_senkrecht = (getZufallszahl(0, 1)==1);
				if (is_senkrecht)
				{
					startpos_x = getZufallszahl(1,MAX_KOORD);
					startpos_y = getZufallszahl(1,MAX_KOORD-laenge+1);
				}
				else
				{
					startpos_x = getZufallszahl(1,MAX_KOORD-laenge+1);
					startpos_y = getZufallszahl(1,MAX_KOORD);
				}
				
				
			} while ( isBelegt(Kreuzer.wuerde_besetzen(
					startpos_x, startpos_y, laenge, is_senkrecht)));
		
			t_Schiff[z_schwimmendeSchiffe]
				= new Kreuzer(startpos_x, startpos_y, laenge, is_senkrecht);
			z_schwimmendeSchiffe += 1;
		}
		
		/* Uboote setzen*/
		for (int i_Uboot =0; i_Uboot < ANZAHL_UBOOTE; i_Uboot++)
		{	do
			{	startpos_x= getZufallszahl(1,MAX_KOORD);
				startpos_y = getZufallszahl(1,MAX_KOORD);
			} while ( isBelegt(startpos_x, startpos_y));

			t_Schiff[z_schwimmendeSchiffe]=new Uboot(startpos_x,startpos_y);
			z_schwimmendeSchiffe += 1;
		}
	}  

	public int getZ_schwimmendeSchiffe() {
		return z_schwimmendeSchiffe;
	}

	public int getZufallszahl(int ss_untere_Grenze, int ss_obere_Grenze){
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
			if (t_Schiff[i_Schiff].besetztKoordinate(ss_pos_x, ss_pos_y))
				getroffenesSchiff= t_Schiff[i_Schiff];
		if ( getroffenesSchiff == null)
		{	getroffen=false;
		schonmal_getroffen = false;
			if (Schiffsverwalter.isTestphase)
				System.out.println("Wasser.");
		}
		else
		{	
				if (! getroffenesSchiff.is_getroffen(ss_pos_x, ss_pos_y))
					{if (Schiffsverwalter.isTestphase)
						System.out.println("Treffer!");
					getroffenesSchiff.set_Schuss(ss_pos_x, ss_pos_y);
				 	getroffen = true;
				 	schonmal_getroffen = false;
				 	versenkt = getroffenesSchiff.is_versenkt();
					if (versenkt) z_schwimmendeSchiffe -= 1;
					}
				else 
				{if (Schiffsverwalter.isTestphase)
						System.out.println("Schon getroffen.");
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



