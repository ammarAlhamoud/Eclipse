package schiffe_versenken;

import java.util.ArrayList;

public class Spielerverwalter {
	private static ArrayList<Spieler> lst_Spieler = new ArrayList<>();
	private static int i_aktSpieler=0;
	
	public int create_Spieler(char ss_leistungsstufe) {
		Spieler w_Spieler;
	
		if(ss_leistungsstufe=='p') w_Spieler = new Profi(lst_Spieler.size()+1);
		else w_Spieler = new Anfaenger(lst_Spieler.size()+1);
		
		lst_Spieler.add(w_Spieler);

		return lst_Spieler.size();
	}
	
	public void set_nextSpieler() {
		if(i_aktSpieler<lst_Spieler.size()-1) i_aktSpieler++;
		else i_aktSpieler=0;
	}
	
	public int get_aktSpieler() {
		return i_aktSpieler + 1;
	}
	
	public void registriere_Treffer(boolean ss_bonus) {
		lst_Spieler.get(i_aktSpieler).registriere_Treffer(ss_bonus);
	}
	
	public void registriere_Abfrageoption() {
		lst_Spieler.get(i_aktSpieler).registriere_Abfrageoption();
	}
	
	public int get_z_moeglicheAbfragen() {
		return lst_Spieler.get(i_aktSpieler).get_z_moeglicheAbfragen();
	}
	
	public double[][] get_Spielernoten() {
		double[][] spielernoten = new double[lst_Spieler.size()][2] ;
		int i=0;
		
		lst_Spieler.sort((sp1,sp2) -> (new Double(sp2.get_Spielernote()).compareTo(new Double(sp1.get_Spielernote()))));
		for(Spieler i_Spieler:lst_Spieler)
		{	spielernoten[i][0] = i_Spieler.get_nr();
			spielernoten[i][1] = i_Spieler.get_Spielernote();
			i++;	
		}
		return spielernoten;
	}
}
