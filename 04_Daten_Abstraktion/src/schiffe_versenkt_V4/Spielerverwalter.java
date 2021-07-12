package schiffe_versenkt_V4;

import java.util.*;

public class Spielerverwalter{
	public ArrayList<Spieler> lst_spieler = new ArrayList<Spieler>();
	int z_spieler,
		spieler_id = 0,
		letzte_spielerID,
		next_spielerID;
	Spieler w_spieler;

	public  Spielerverwalter(int ss_z_spieler) {
		this.z_spieler = ss_z_spieler;
	}
	
	public void creat_spieler(String name, char ss_leistung )
		{spieler_id +=1; 
		switch(ss_leistung)
			{case 'A': w_spieler = new Anfaenger(name,spieler_id);
						lst_spieler.add(w_spieler);
				break;
				case 'P': w_spieler = new Profi(name,spieler_id);
						lst_spieler.add(w_spieler);
				break;
			}	
		}
	
	public void set_nextSpielerID(int ss_akt_spielerID) {
		letzte_spielerID = lst_spieler.size();
		if (ss_akt_spielerID == letzte_spielerID)
			{ss_akt_spielerID = 1;
			}
		else 
			{ss_akt_spielerID +=1;
			}
		next_spielerID = ss_akt_spielerID;
		}
	
	public Spieler getSpieler(int ss_id)
		{Spieler ges_spieler = null;
		for(Spieler i_spieler:lst_spieler)
			{if(i_spieler.getId() == ss_id )
				{ges_spieler = i_spieler;			
				}		
			}			
		return ges_spieler;
		}
	
	public double spielerNote_berechne(int ss_schussErgebniss, int spieler_id, boolean ss_is_spielende)
		{return getSpieler(spieler_id).spielerNote_berechne(ss_schussErgebniss, ss_is_spielende);	
		}


	public int getNext_spielerID() {
		return next_spielerID;
	}

	

}
