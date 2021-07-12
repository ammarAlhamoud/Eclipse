package datentypen;

public class Gleitkommazahlen {

	public static void main(String[] args) {
		float	a = 1000 * 1000 * 16 + 5;
		System.out.printf("a = %20f", a);
		/* Problem: Zahl mit 25 Stellen; float bietet aber
		 * nur eine Vorkommastelle und Mantisse mit 23 Stellen
		 * -> letztes Bit wird abgeschnitten */
		a = 1000 * 1000 * 17 + 5;
		System.out.printf("\na = %20f", a);
	}
}
