package operationswerk;

import dlg_StringGenerator_better_V2.ConsolReader;

public class DlgOperationswerk_Tester 
{
	public static void main(String[] args) 
		{int arg1, arg2, maximum;
		System.out.println("Bitte ersten Wert zum Vergleich eingeben");
		arg1 = ConsolReader.readInt();
		System.out.println("Bitte zweiten Wert zum Vergleich eingeben");
		arg2 = ConsolReader.readInt();
		maximum = get_max(arg1, arg2);
		System.out.println("Das Maxsimum ist: " + maximum);
		}//end main
	public static int get_max(int ss_arg1, int ss_arg2)
		{int ss_max = ss_arg1;
		if (ss_arg2 > ss_arg1)
			{ss_max = ss_arg2;		
			}
		return ss_max;
		}// end get max
}
