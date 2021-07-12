package app_BankautomatPreChecker_V4;
public class Bankautomat_Timer 
{private static long endezeitpkt = System.currentTimeMillis()+ 30000;
public static boolean isZeit_vorhanden()
	{return endezeitpkt >= System.currentTimeMillis();		
	}
}
