package maximum_durchsuchen;

public class MaxZahl_durchsuchen 
{

	public static void main(String[] args) 
	{// deklarieren
	int	t_zahl [];
	int i_max=0;
	
	//t_zahl Array aus füllen
	t_zahl = new int[10];
	for ( int i=0 ; i < t_zahl.length ; i++)
		{t_zahl[i] = i*i + i/2;
		}
	// t_zahl nach maximum Zahl durchsuchen
	for (int i=0; i<t_zahl.length; i++)
		{if (t_zahl[i]>t_zahl[i_max])
			{i_max = i ;
			}
		}
	
	// maximum Zahl Position anzeigen
	System.out.println("die maximum Zahl befindet sich in Index : " + i_max);
	System.out.println("der Wert der Zahl ist :" + t_zahl[i_max]);
	}

}
