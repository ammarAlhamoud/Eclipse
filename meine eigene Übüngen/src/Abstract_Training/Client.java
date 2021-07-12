package Abstract_Training;

public class Client {
	public static void main(String[] args) {
		Zahlen_tabelle meinContainer = new Zahlen_tabelle();
		IntObjekt intWert = new IntObjekt(310);
		FloatObjekt floatWert = new FloatObjekt(2.55f);
		
		meinContainer.put(intWert, 0);
		meinContainer.put(floatWert, 1);
		
		GeneralisiertesObjekt aktWert ;
		for(int i = 0 ;i<2;i++) {
			aktWert = meinContainer.get(i);
			System.out.println("Zahl("+i+"):\t"+ aktWert.get_wert());
		}
		
	}

}
