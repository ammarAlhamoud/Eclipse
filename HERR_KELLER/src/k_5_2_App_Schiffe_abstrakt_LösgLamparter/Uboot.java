package k_5_2_App_Schiffe_abstrakt_LösgLamparter;


public class Uboot extends Schiff {
	//meint, wievielen Treffern durch tauchen entgangen wurde
	private final int HOECHSTTAUCHDAUER = 30,
					  AUSWEICHTAUCHGRENZE = 2;
	
	private int pos_x,
				pos_y;
	private int z_Tauchdauer = 0, //protected fzum im Schiffsverwalter
				z_Dauer_bis_Abtauchen = (int) (Math.random()*3+2), // 2-4
				z_Dauer_bis_Auftauchen = 0,
				z_untertauchte_Beschiessungsversuche = 0;
	private boolean isGetaucht = false;
	private static Uboot t_Uboot[] = new Uboot[20]; //Flotte
	private static int anz = 0;
	
	
	public Uboot(int ss_pos_x, int ss_pos_y)
	{	pos_x=ss_pos_x;
		pos_y=ss_pos_y;
		t_Uboot[anz]=this;
		Uboot.anz += 1;
	}
	
	public Uboot(int ss_pos_x, int ss_pos_y, int ss_bis_Abtauchen)
	{	this(ss_pos_x,ss_pos_y);
		z_Dauer_bis_Abtauchen = ss_bis_Abtauchen;		
	}
	
	public int getPos_x()
	{	return pos_x;
	}
	public int getPos_y() 
	{	return pos_y;
	}
	
	public boolean besetztKoordinate(int ss_pos_x, int ss_pos_y)
	{	return (pos_x ==ss_pos_x && pos_y == ss_pos_y);
	}

	public void set_Schuss(int ss_pos_x, int ss_pos_y)
	{	if (isGetaucht)
		  z_untertauchte_Beschiessungsversuche += 1;
		else
		  sinke();   
	}
	
	public void tauchzustand_verwalten()
	{	if (z_Tauchdauer>=HOECHSTTAUCHDAUER //nicht mehr tauchen
				||
			z_untertauchte_Beschiessungsversuche>=AUSWEICHTAUCHGRENZE
				||
			versenkt
			)
		{  if (isGetaucht)
			auftauchen();
		}
		else  //moeglicherweise Tauchen
		{  if (isGetaucht)
			{  if (z_Dauer_bis_Auftauchen == 0)
					auftauchen();
				else
					z_Dauer_bis_Auftauchen -= 1;
					z_Tauchdauer += 1;
			}
			else
			{  if (z_Dauer_bis_Abtauchen == 0)
				tauchen();
				else
				z_Dauer_bis_Abtauchen -= 1;
			}
		}
	};

	public void tauchen()
	{	System.out.println("Ein Uboot taucht ab.");
		isGetaucht = true;
		z_Dauer_bis_Auftauchen=(int) (Math.random()*HOECHSTTAUCHDAUER+1);
	}

	public void auftauchen()
	{	System.out.println("Ein Uboot taucht auf.");
		isGetaucht = false;
		z_Dauer_bis_Abtauchen=(int) (Math.random()*3+2); // 2-4
	}

	public boolean is_getroffen(int ss_pos_x, int ss_pos_y)
	{	return versenkt;
	}
	
	public static void manoevriere_Flotte()
	{	for (int iBoot=0;iBoot<Uboot.anz; iBoot++)
			t_Uboot[iBoot].tauchzustand_verwalten();
	}
	
}
