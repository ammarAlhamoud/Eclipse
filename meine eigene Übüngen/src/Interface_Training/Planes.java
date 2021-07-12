package Interface_Training;

public class Planes implements Movable{
	
	public boolean start() {
	return true;	
	}
	public void stop() {
		
	}
	public boolean turn(int ss_deg) {
	boolean turn = false;
	return turn;
	}
	
	public double fuelremaining() {
	return 2.3;	
	}
	public boolean changspeed(double kmproh) {
	return true;	
	}

}
