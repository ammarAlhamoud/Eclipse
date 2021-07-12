package Graphics_training;

public class KurveTest {

	public static void main(String[] args) 
		{
		KurveRunnable KR = new KurveRunnable();
		Thread t = new Thread(KR);
		t.start();
	
		}

}
