package datentypen;

public class MDArrays {

	public static void main(String[] args) {
		int[][]	a = new int[2][3];
		System.out.println("a: " + a);
		System.out.println("a[0]: " + a[0]);
		a[0][0] = 42;
		System.out.println("a[0][0]: " + a[0][0]);
	}
}
