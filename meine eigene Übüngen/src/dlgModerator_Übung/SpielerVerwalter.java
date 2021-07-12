package dlgModerator_Übung;

public class SpielerVerwalter 
{private Spieler first,
				 last;


public void addSpieler(String ss_name)
	{first = new Spieler(ss_name , first);	
	}


public String getSpieler(int ss_SpielerIndex)
	{Spieler w_spieler = first;
	while (w_spieler != null && ss_SpielerIndex>0)
		{w_spieler = w_spieler.next;
		ss_SpielerIndex --;	
		}
	if(w_spieler == null)
		{return null;	
		}
	return w_spieler.getName();
	}
}
