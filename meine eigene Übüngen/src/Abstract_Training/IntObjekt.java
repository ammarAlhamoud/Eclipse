package Abstract_Training;

public class IntObjekt extends GeneralisiertesObjekt {
	
private int intWert;

public IntObjekt(int ss_intWert) {
	this.intWert = ss_intWert;
	}

public String get_wert() {
	return Integer.toString(intWert);
	}
}
