package Graphics_training;

public class KurveRunnable implements Runnable
{	

	@Override
	public void run() 
	{

	KurveGUI_Kontroll kurv2Fenester = new KurveGUI_Kontroll("Sinus");
	while(!Thread.currentThread().isInterrupted())
		{
		Kurve_Drawing KD = new Kurve_Drawing();
		kurv2Fenester.getWindow().add(KD);
		kurv2Fenester.getWindow().revalidate();
		try 
			{Thread.sleep(1);				
			}
		catch(Exception e)
			{System.out.println(e.getMessage());	
			}
			
		}
	
		
	}

}
