package threads_üben;

import java.util.Date;

public class RealTime extends Thread{
	
	public void run() {
		while(!Thread.currentThread().isInterrupted()) {
			System.out.printf("Curent Time: %tr \n", new Date());
			try {
				Thread.sleep(1000);
			}
			catch(Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}

}
