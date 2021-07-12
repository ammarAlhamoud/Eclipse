package threads_üben;

public class ExamTimer extends Thread{
	public void run() {
		try {
			Thread.sleep(5000);
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
