package Interface_Training;

public class DlgSteuerung {

	public static void main(String[] args) {
		Planes p = new Planes();
		Ships sh = new Ships();
		
		Remotcontrol remot = new Remotcontrol(p);
		Remotcontrol remot2 = new Remotcontrol(sh);
		
		boolean okay = remot.ok;
		
	}

}
