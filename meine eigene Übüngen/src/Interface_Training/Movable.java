package Interface_Training;

public interface Movable {
	
	public boolean start();
	public void stop();
	public boolean turn(int deg);
	public double fuelremaining();
	public boolean changspeed(double kmproh);

}
