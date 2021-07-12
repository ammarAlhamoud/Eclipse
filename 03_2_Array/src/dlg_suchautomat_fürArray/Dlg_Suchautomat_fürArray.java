package dlg_suchautomat_fürArray;

public class Dlg_Suchautomat_fürArray 
{private static int[] t;
private static int gesuchte_zahl;
	public static void main(String[] args) 
		{t = new int[9];
		for (int i=0 ; i<9; i++)
			{t[i] = i + 1;	
			}
		System.out.println("nach welcher Zahl suchen Sie?");	
		gesuchte_zahl = ConsolReader.readInt();
		show_position_vonGesuchteZahl();
		}//end main
	private static void show_position_vonGesuchteZahl()
		{int i_anf = 0,
			 i_mitte;	
		int i_ende = t.length-1;
		boolean isGesuchteZahl = false ;
		if (gesuchte_zahl > t[i_ende])
			{isGesuchteZahl = false	;		
			}
		else 
			{do 
				{i_mitte = (i_anf + i_ende)/2;
				if (t[i_mitte] == gesuchte_zahl ||  i_anf == i_ende)
					{isGesuchteZahl = true ;	
					} 
				else if (t[i_mitte] < gesuchte_zahl )
					{i_anf = i_mitte + 1;
					}
				else
					{if (t.length % 2 != 0)
						{i_ende = i_mitte -1 ;			
						}	
					else
						{i_ende = i_mitte;
						}
					}
				}
			while (isGesuchteZahl == false );
			}
		// Das Ergibnis ausgeben
		if (isGesuchteZahl)
			{System.out.println("gesuchte Zahle wurde gefunden");		
			}
		else
			{System.out.println("gesuchte Zahle wurde nicht gefunden");				
			}		
	}// end privat show_position_vonGesuchteZahl
}
