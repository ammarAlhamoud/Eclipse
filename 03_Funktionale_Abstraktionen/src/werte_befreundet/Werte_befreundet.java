package werte_befreundet;

import dlg_StringGenerator_bad_V1.ConsolReader;

public class Werte_befreundet 
{
	public static void main(String[] args) 
		{int zahl1,
			zahl2;
		System.out.println("Zahl 1:");
		zahl1 = ConsolReader.readInt();
		System.out.println("Zahl 2:");
		zahl2 = ConsolReader.readInt();
		System.out.println(is_befreundet(zahl1, zahl2));
		
		}
	public static boolean is_befreundet(int ss_arg1, int ss_arg2)
		{boolean is_befreundet = false;
		if (get_summeTeiler( ss_arg1) == ss_arg2 & get_summeTeiler( ss_arg2) == ss_arg1)	
			{is_befreundet = true;
			}
		return is_befreundet;
		}
	public static int get_summeTeiler(int ss_arg)
		{int summeTeiler = 0;
		for (int i=1 ; i< ss_arg ; i++)
			{if (ss_arg % i == 0)
				{summeTeiler += i;			
				}			
			}
		return summeTeiler;	
		}

}
