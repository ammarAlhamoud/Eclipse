package dlg_MemorySpiel_V1;
public class Dlg_MemorySpiel 
{private static int z_paarKarten;
private static String[][] t_karte;
private static int erst_dimesion_karte;
private static int zweite_dimesion_karte;
private static String elemnte_posNr="     ";
private static String  karte1;
private static String[][] t_verdeckteKarte;
private static String verdeckte_karte = "?"; 
public static void main(String[] args) 
	{int nochmal_spielen = 1;
	do
		{System.out.println("Mit wie viel Paar von Karten m?chten Sie spielen? ");
		do
			{z_paarKarten =ConsolReader.readInt();
			System.out.println("Sie d?rfen nur bis 26 Paare eintragen! Nocheinmal." );
			}
		while (z_paarKarten >26 || z_paarKarten <= 0);
		Karten_Darstellung();
		Karten_ausf?llen();
		erf?lgreiche_Versuch();
		System.out.println("Wollen Sie nochmal Spielen? (0: NO)");
		nochmal_spielen = ConsolReader.readInt();
		}
	while (nochmal_spielen != 0);
	}//end main
	private static void Karten_Darstellung()
		{//deklarieren
		int z_karten ,
			z_Teiler = 0,
			i_mitte;
		int[]	t_Teiler;
		z_karten   = z_paarKarten * 2;
		 /* t_teiler erzeugen */
		for (int i=1; i<=z_karten;i++)
			{if (z_karten % i == 0 )
				{z_Teiler +=1;
				}//ende if	
			}// ende for Teileranzahl
		t_Teiler = new int[z_Teiler];
		z_Teiler = 0;
		/* t_Teiler Array ausf?llen */
		for (int i=1; i<=z_karten;i++)
			{if (z_karten % i == 0 )
				{t_Teiler[z_Teiler] = i;
				z_Teiler +=1;
				}
			}//ende for t_Teiler Array ausf?llen
		/** t_karte erzeugen */ 
		i_mitte = (z_Teiler-1)/2;
		erst_dimesion_karte = t_Teiler[i_mitte];
		if((z_Teiler ) % 2 == 0)
			{zweite_dimesion_karte = t_Teiler[i_mitte +1];
			}
		else
			{zweite_dimesion_karte = erst_dimesion_karte;
			}
		t_karte = new String[erst_dimesion_karte][zweite_dimesion_karte];	
		for(int i=0 ;i <erst_dimesion_karte; i++)
			{for (int j=0 ; j<zweite_dimesion_karte; j++)
				{t_karte[i][j] = verdeckte_karte;				
				}
			}
		array_drucken();
		}//ende Karten_darstellung
	private static void  array_drucken()
	{elemnte_posNr="       ";
	String druck_array = "[0]  |  ";
	for (int j=0 ; j<zweite_dimesion_karte; j++)
		{elemnte_posNr +="["+j+"]";		
		}
	System.out.println(elemnte_posNr);
	for(int i=0 ;i <erst_dimesion_karte; i++)
		{for (int j=0 ; j<zweite_dimesion_karte; j++)
			{if(t_karte[i][j]!= verdeckte_karte )
				{druck_array +=  t_karte[i][j] +"  " ;	
				}
			else 
				{druck_array +=  verdeckte_karte +"  " ;	
				}			
			}
		System.out.println(druck_array + " |");
		druck_array ="["+(i+1)+"]"+ "  |  ";
		} 
	}
	private static void verdeckte_karte_dr?cken()
		{elemnte_posNr="       ";
		String druck_array = "[0]  |  ";
		for (int j=0 ; j<zweite_dimesion_karte; j++)
			{elemnte_posNr +="["+j+"]";		
			}
		System.out.println(elemnte_posNr);
		for(int i=0 ;i <erst_dimesion_karte; i++)
			{for (int j=0 ; j<zweite_dimesion_karte; j++)
				{if(t_verdeckteKarte[i][j]!= verdeckte_karte )
					{druck_array +=  t_verdeckteKarte[i][j] +"  " ;	
					}
				else 
					{druck_array +=  verdeckte_karte +"  " ;	
					}			
				}
			System.out.println(druck_array + " |");
			druck_array ="["+(i+1)+"]"+ "  |  ";
			}
		}	
	private static void Karten_ausf?llen()
		{String[] t_zeichen={"A","B","C","D","E","F","G","H","I","J","K","L","M",
				"N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
		t_verdeckteKarte = new String[erst_dimesion_karte][zweite_dimesion_karte];
		int x_karte_pos ,
			y_karte_pos ;
		for (int i =0 ;i<z_paarKarten;i++)
			{int j = 1;
			do
				{x_karte_pos = (int) (Math.random()*erst_dimesion_karte);
				y_karte_pos = (int) (Math.random()* zweite_dimesion_karte);
				if (t_karte[x_karte_pos][y_karte_pos] == verdeckte_karte )
					{t_karte[x_karte_pos][y_karte_pos] = t_zeichen[i];	
					j++;
					}	
				} 
			while (j<=2);
			}
		for (int i = 0 ; i < erst_dimesion_karte ; i++ )
			{for (int j=0 ; j<zweite_dimesion_karte; j++)
				{t_verdeckteKarte[i][j] = verdeckte_karte;
				}		
			}
		}//ende Karten ausf?llen
	private static void erf?lgreiche_Versuch()
		{ int 	x_karte1,
				y_karte1,
				x_karte2,
				y_karte2;
		String  karte2;
		int  erf?lg_Versuch,
			z_Versuch = 1;
		erf?lg_Versuch = 0;
		do
			{/** zwei Karten richtig erfassen */
			// Karte 1 erfassen
			System.out.println("Karte 1:");
			do 
				{do
					{System.out.println("Zeile der Karte(1)?");
					x_karte1 = ConsolReader.readInt();
					}
				while (x_karte1< 0 || x_karte1> (erst_dimesion_karte-1));
				do
					{System.out.println("Spalte der Karte1(?)");
					y_karte1 = ConsolReader.readInt();
					}
				while (y_karte1<0 || y_karte1> (zweite_dimesion_karte-1) );
				karte1 = t_karte[x_karte1][y_karte1];	
				}
			while (karte1 == verdeckte_karte);
			//Karte2 erfassen
			System.out.println("Karte 2");
			do
				{do
					{System.out.println("Zeile der Karte(2)?");
					x_karte2 = ConsolReader.readInt();
					}
				while (x_karte2< 0 || x_karte2>( erst_dimesion_karte-1));
				do
					{System.out.println("Spalte der Karte(2)?");
					y_karte2 = ConsolReader.readInt();
					}
				while(y_karte2< 0 || y_karte2> (zweite_dimesion_karte-1));
				karte2 = t_karte[x_karte2][y_karte2];
				}
			while (karte2 ==verdeckte_karte || (x_karte2 == x_karte1 & y_karte2 == y_karte1));
			/** erf?lgreiche Versuch erzeugen */ 
			if (karte1 == karte2)	
				{erf?lg_Versuch +=1;
				t_verdeckteKarte[x_karte1][y_karte1]=karte1;
				t_verdeckteKarte[x_karte2][y_karte2]=karte2;
				t_karte[x_karte1][y_karte1] = verdeckte_karte;
				t_karte[x_karte2][y_karte2] = verdeckte_karte;
				verdeckte_karte_dr?cken();
				System.out.println("erf?lgreiche Versuchen : "+ erf?lg_Versuch + " von " + z_Versuch);
				}
			else 
				{System.out.println("kein Gl?ck!, versuchen Sie noch einmal.");
				}
			z_Versuch +=1;
			}
		while (erf?lg_Versuch < z_paarKarten);
		System.out.println("Das Spiel ist Beendet");
		}
}//ende package