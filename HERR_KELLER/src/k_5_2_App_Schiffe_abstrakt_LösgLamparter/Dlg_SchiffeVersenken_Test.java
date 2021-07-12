package k_5_2_App_Schiffe_abstrakt_LösgLamparter;

public class Dlg_SchiffeVersenken_Test {
  public static void main(String[] args) {
	Schiffsverwalter_Konstant schiffsverwalter = new Schiffsverwalter_Konstant();
	//Schiffsverwalter schiffsverwalter=new Schiffsverwalter(true);
	//Schiffsverwalter.test = true;
	System.out.println("Schuss(0, 0)");
	schiffsverwalter.set_Schuss(0, 0);
	//Uboot unter Wasser beschiessen
	System.out.println("Schuss(1, 1)");
	schiffsverwalter.set_Schuss(1, 1);
	System.out.println("Schuss(1, 1)");
	schiffsverwalter.set_Schuss(1, 1);
	//Uboot versenken
	System.out.println("Schuss(1, 1)");
	schiffsverwalter.set_Schuss(1, 1);
	//Versenktes Uboot nochmal beschiessen
	System.out.println("Schuss(1, 1)");
	schiffsverwalter.set_Schuss(1, 1);
	//Kreuzer beschiessen
	System.out.println("Schuss(1, 2)");
	schiffsverwalter.set_Schuss(1, 2);
	//Kreuzer an getroffener Stelle beschiessen
	System.out.println("Schuss(1, 2)");
	schiffsverwalter.set_Schuss(1, 2);
	System.out.println("Schuss(1, 3)");
	schiffsverwalter.set_Schuss(1, 3);
	//Kreuzer versenken
	System.out.println("Schuss(1, 4)");
	schiffsverwalter.set_Schuss(1, 4);
	//Versenkten Kreuzer treffen
	System.out.println("Schuss(1, 4)");
	schiffsverwalter.set_Schuss(1, 4);
	//Auf und abtauchen testen
	for (int i=1; i<=60;i++)
		{System.out.println(i+
				": abschichtlicher Fehlschuss(9, 9)");
		 schiffsverwalter.set_Schuss(9, 9);
		}
	//Finaler Schuss
			System.out.println("FinalerSchuss(2, 1)");
			schiffsverwalter.set_Schuss(2, 1);
			
	System.out.println("versenkbare Schiffe:" + 
	   schiffsverwalter.getZ_schwimmendeSchiffe() );
  }
}
