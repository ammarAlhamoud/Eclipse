package operationswerk_test_selber;
public class fakulitšt 
{public static int get_fakulitšt(int ss_Zahl)
	{int ss_fakulitšt;
	if(ss_Zahl == 0)
		{ss_fakulitšt = 1;
		}
	else
		{ss_fakulitšt = ss_Zahl * get_fakulitšt(ss_Zahl -1);			
		}
	return ss_fakulitšt;
	}
	

}

