package runnable_�bungen;

public class RealTimeTest {

	public static void main(String[] args) {
		RealTime rt = new RealTime();
		Thread t = new Thread(rt);
		t.start();
	}

}
