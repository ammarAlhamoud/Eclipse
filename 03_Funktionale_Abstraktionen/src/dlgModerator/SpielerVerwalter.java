package dlgModerator;

public class SpielerVerwalter 
{private Spieler first;

//addiere einen neuen Element zu der SpielerListe;
public void addSpieler(String ss_name)
	{first = new Spieler(ss_name , first);	
	}

//auf einen Element von SpielerListe zugreifen
public Spieler getSpieler(int i_spieler)
	{Spieler w_spieler = first;
	while (w_spieler != null && i_spieler>0)
		{w_spieler = w_spieler.next;
		if(w_spieler == null)
			{w_spieler = first;	
			}
		i_spieler --;	
		}
	return w_spieler;
	}
}
