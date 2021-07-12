package GUI_Übung;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Gui_RealTime extends Thread {
	public String time ;
	public SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
	public void run() {
		while(!Thread.currentThread().isInterrupted()) {
			time = "\n"+ sdf.format(new Date());
			TimeFenester.lbl_Timer.setText(time);
			try {
				Thread.sleep(1000);
			}
			catch(Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}
	

}
