package rekursion;

public class Potenz {

	/* Berechnet 2 hoch n; n E N + 0 */
	int zweier(int n) {
		int ergebnis = 1;
		int	i;
		for (i = 1; i <= n; i++)
			ergebnis = ergebnis * 2;
		return ergebnis;
	}

	/* Rekursive Version */
	int rzweier(int n) {
		int ergebnis = 1;
		/* Rekursionsanker */
		if (n > 0) {
			/* Rekursionsschritt: Ergebnis aus Vorgängerergebnis mal zwei */
			ergebnis = rzweier(n - 1) * 2;
		}
		/* Rückgabe des Ergebnisses */
		return ergebnis;
	}

	/* Berechnet rekursiv a hoch b, a ganze Zahl, b ganze Zahl >= 0 */
	int hoch(int a, int b) {
		int	ergebnis = 1;
		if (b > 0) ergebnis = hoch(a, b - 1) * a;
		return ergebnis;
	}

	public static void main(String[] args) {
		Potenz	P = new Potenz();
		System.out.println("-5 hoch 4: " + P.hoch(-5, 4));
		System.out.print("2 hoch 0: " + P.zweier(0));
		System.out.print("\t2 hoch 1: " + P.zweier(1));
		System.out.print("\t2 hoch 2: " + P.zweier(2));
		System.out.print("\t2 hoch 3: " + P.zweier(3));
		System.out.println("\t2 hoch 8: " + P.zweier(8));
		System.out.print("2 hoch 0: " + P.rzweier(0));
		System.out.print("\t2 hoch 1: " + P.rzweier(1));
		System.out.print("\t2 hoch 2: " + P.rzweier(2));
		System.out.print("\t2 hoch 3: " + P.rzweier(3));
		System.out.println("\t2 hoch 8: " + P.rzweier(8));
		
	}

}
