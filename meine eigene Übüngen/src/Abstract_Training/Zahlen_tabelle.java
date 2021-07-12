package Abstract_Training;

public class Zahlen_tabelle {
	
	private GeneralisiertesObjekt[] t_zahl  = new GeneralisiertesObjekt[10];
	
	public void put(GeneralisiertesObjekt ss_GeneralisiertesObjekt,
			int ss_pos) {
		t_zahl[ss_pos] = ss_GeneralisiertesObjekt;
	}
	
	public GeneralisiertesObjekt get(int ss_pos) {
	return t_zahl[ss_pos];
	}

}
