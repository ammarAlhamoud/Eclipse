package threads_üben;

import java.awt.Toolkit;

public class Alert extends Thread{
	
	private boolean isStarted = false;
	
	public void start() {
		if(isStarted == false) {
			super.start();
			isStarted = true;
		}else
		{
			resume();
		}
	}
	
	public void run() {
		while(!this.isInterrupted()) {
			try {
				Toolkit.getDefaultToolkit().beep();
				Thread.sleep(1000);
			}
			catch(Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}

}
