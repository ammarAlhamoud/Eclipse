package methoden;

public class ObjektTest {

	public void aendern(Objekt B) {
		System.out.println("\tVorher in aendern: B = " + B + ", B.x = " + B.x);
		B.x = B.x + 2;
		System.out.println("\tNachher in aendern: B = " + B + ", B.x = " + B.x);
	}
	public static void main(String[] args) {
		ObjektTest	T = new ObjektTest();
		Objekt		A = new Objekt();
		A.x = 5;
		System.out.println("Vorher: A = " + A + ", A.x = " + A.x);
		T.aendern(A);
		System.out.println("Nachher: A = " + A + ", A.x = " + A.x);
	}

}
