package operationswerk_test_selber;
public class fakulit�t 
{public static int get_fakulit�t(int ss_Zahl)
	{int ss_fakulit�t;
	if(ss_Zahl == 0)
		{ss_fakulit�t = 1;
		}
	else
		{ss_fakulit�t = ss_Zahl * get_fakulit�t(ss_Zahl -1);			
		}
	return ss_fakulit�t;
	}
	

}

