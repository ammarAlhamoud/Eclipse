package doppelteWert;

public class DoppelteWert_finden 
{
	public static void main(String[] args) 
	{long[] t_key = {1,2,3,10,5,4,6,9,8,7};
	
	System.out.println(DoppelteWert_finden(t_key));

	}
	public static boolean DoppelteWert_finden(long[] ss_t_key)
	{boolean isDoppelteWert = false;
		for (int i=0; i<ss_t_key.length; i++)
			{for (int j=i+1; j<ss_t_key.length ; j++)
				{if (ss_t_key[i] == ss_t_key[j])
					{isDoppelteWert = true;			
					}	
				}			
			}	
		return isDoppelteWert;
	}

}
