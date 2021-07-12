package datentypen;

public class Arrays {

	public static void main(String[] args) {
		int[]	a;
		int[]	b;
		a = new int[4];
		b = a;
		b[0] = 15;
		System.out.println("Inhalt von a: " + a);
		System.out.println("Inhalt von b: " + b);
		System.out.println("Inhalt von a[0]: " + a[0]);
	}
}
