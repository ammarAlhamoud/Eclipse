package dlgModerator_Übung;

public class DlgModerator {
	public static void main(String[] args) 
		{String spielerName;
		int z_spieler;
		SpielerVerwalter mySpieler = new SpielerVerwalter();
		for (int i = 0; i<3;i++)
			{System.out.println("Name?");
			spielerName = ConsolReader.readString();
			mySpieler.addSpieler(spielerName);
			}
		for (int i = 4 ; i>0 ;i--)
			{System.out.println("Frage an: " + mySpieler.getSpieler(i-1));
			}
		}
}
