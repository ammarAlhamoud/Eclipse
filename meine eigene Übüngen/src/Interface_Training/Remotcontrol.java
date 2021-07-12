package Interface_Training;

public class Remotcontrol {
	
	private Movable machine;
	
	public Remotcontrol(Movable m) {
		this.machine = m;
	}

	boolean ok = machine.start();
}
