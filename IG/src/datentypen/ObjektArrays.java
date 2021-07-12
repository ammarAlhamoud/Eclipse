package datentypen;

public class ObjektArrays {

	public static void main(String[] args) {
		Daten[]	a = new Daten[4];
		a[2] = new Daten();
		a[2].ID = 23;
		System.out.println("a: " + a);
		System.out.println("a[2]: " + a[2]);
		System.out.println("a[2].ID: " + a[2].ID);
	} 

}
