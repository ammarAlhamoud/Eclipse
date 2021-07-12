package datentypen;

public class Ganzzahlen {

	public static void main(String[] args) {
		byte	a, b, c;
		int		z;
		short	normal;
		byte	weniger;
		int		mehr;
		normal = 133;
		mehr = normal;
		weniger = (byte) normal;
		System.out.print("normal: " + normal + ", mehr: " + mehr);
		System.out.println(", weniger: " + weniger);
		a = 100;
		b = 100;
		c = (byte) (a + b);
		z = a + b;
		System.out.println(a + " + " + b + " = " + c + " bzw. " + z);
		z = a * a * a * a * a;
		System.out.println(a + " hoch 5 = " + z);
	}
}
