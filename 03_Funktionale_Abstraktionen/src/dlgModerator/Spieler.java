package dlgModerator;

public class Spieler 
{private String name;
private int  z_richtigeAntworten = 0;
private int dauer ;
Spieler next;

public Spieler(String ss_name , Spieler ss_next) 
	{this.name = ss_name;
	this.next = ss_next;	
	}

public String getName()
	{return name;	
	}

public int getZ_richtigeAntworten()
	{return z_richtigeAntworten;	
	}

public void setZ_richtigeAntworten(int z_richtigeAntworten) 
	{this.z_richtigeAntworten = z_richtigeAntworten+1;
	}

public int getDauer()
	{return dauer;
	}

public void setDauer(long ss_startZeitPkt , long ss_endZeitPkt)
	{this.dauer += (int)((ss_endZeitPkt - ss_startZeitPkt )/1000);
	}

}
