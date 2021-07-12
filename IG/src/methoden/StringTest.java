package methoden;

public class StringTest {

	public void aendern(String B) {
		System.out.println("\tVorher in aendern: B = " + B);
		B = B + "!!!";
		System.out.println("\tNachher in aendern: B = " + B);
	}
	public static void main(String[] args) {
		StringTest	T = new StringTest();
		String		A = new String();
		A = "Hallo";
		System.out.println("Vorher: A = " + A);
		T.aendern(A);
		System.out.println("Nachher: A = " + A);
	}

}
