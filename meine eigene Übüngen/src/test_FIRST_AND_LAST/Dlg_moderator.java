package test_FIRST_AND_LAST;

import dlgTätigkeiten.ConsolReader;

public class Dlg_moderator {

	public static void main(String[] args) 
		{ String name ;
		Spieler next_spieler;
		Spielerverwalter spielerListe = new Spielerverwalter();
		for (int i=0; i<3;i++)
			{System.out.println("name?");
			name = ConsolReader.readString();
			spielerListe.kreiere_Spieler(name);	
			}
		for (int i=0; i<10;i++)
			{next_spieler = spielerListe.get_Spieler();
			name = next_spieler.getName();
			System.out.println("next Name" + name);				
			}
		
			

		}

}
