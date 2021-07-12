package dlgtaetigkeitsanalyse;

import dlg_StringGenerator_good_V3.ConsolReader;

public class Dlgtaetigkeitsanalyse {

	public static void main(String[] args)
	{int taetigkeitsart_akt, taetigkeitsart_next;
	long end_Time, start_Time;
	System.out.println("Tätigkeitsart?");
	taetigkeitsart_akt = ConsolReader.readInt();
	start_Time = System.currentTimeMillis();
	while (taetigkeitsart_akt != 0 )
		{System.out.println("Tätigkeitsart?");
		taetigkeitsart_next = ConsolReader.readInt();
		end_Time = System.currentTimeMillis();
		start_Time = end_Time ;
		Vorgangsverwalter.kreiere_Arbeitsvorgang();
		taetigkeitsart_akt = taetigkeitsart_next ;
		}
	

	}

}