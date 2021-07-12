package dlg_StringGenerator_very_modular_V4;
public class Dlg_StringGenerator_very_modular_V4 
{
	public static void main(String[] args) 
	{int max_Wortlaenge;
	System.out.println("max_Wortlaenge?");
	max_Wortlaenge = ConsolReader.readInt();
	System.out.println("ZUfalswort: " + StringGenerator.get_Zufallswort(max_Wortlaenge));
	}
}
