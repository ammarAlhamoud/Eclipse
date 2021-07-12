package array_sortieren;

public class Array_sortieren 
{private static int[]  t_zahl= {1,3,5,2,7,3} ;

	public static void main(String[] args)
		{show_sortiereteArray();
		}//ende main
	private static void show_sortiereteArray()
	{int kleinere_zahl ,
		größere_zahl,
		i = 0;
	String druck_array = "{";
	do
		{if(t_zahl[i+1] < t_zahl[i])
			{kleinere_zahl = t_zahl[i+1];
			größere_zahl = t_zahl[i];
			t_zahl[i] = kleinere_zahl;
			t_zahl[i+1] = größere_zahl;	
			i = 0;
			}
		else
			{i += 1 ;	
			}//ende if
		} // ende While Schleife
	while (i < t_zahl.length-1);
	for (i=0 ; i<t_zahl.length; i++)
		{druck_array +=  t_zahl[i] +", " ;
		}
	System.out.println(druck_array + "}");
	}//ende show_sortiereteArray

}
