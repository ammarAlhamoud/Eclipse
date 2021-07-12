package operationswerk_test_selber;
public class fakulität 
{public static int get_fakulität(int ss_Zahl)
	{int ss_fakulität;
	if(ss_Zahl == 0)
		{ss_fakulität = 1;
		}
	else
		{ss_fakulität = ss_Zahl * get_fakulität(ss_Zahl -1);			
		}
	return ss_fakulität;
	}
	

}

