package Abstract_Training;

public class FloatObjekt extends GeneralisiertesObjekt{

	private float floatWert;
	
	public FloatObjekt(float ss_floatWert) {
		this.floatWert = ss_floatWert;
	}
	
	public String get_wert() {
		return Float.toString(floatWert);
	}
	
}
