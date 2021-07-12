package methoden;

public class Referenzaufruf {

	public void aendern(int[] b) {
		System.out.println("\tVorher in aendern: b = " + b + ", b[0] = " + b[0]);
		b[0] = b[0] + 2;
		System.out.println("\tNachher in aendern: b = " + b + ", b[0] = " + b[0]);
	}
	public static void main(String[] args) {
		Referenzaufruf	R = new Referenzaufruf();
		int[]			a = new int[2];
		a[0] = 5;
		System.out.println("Vorher: a = " + a + ", a[0] = " + a[0]);
		R.aendern(a);
		System.out.println("Nachher: a = " + a + ", a[0] = " + a[0]);
	}

}
