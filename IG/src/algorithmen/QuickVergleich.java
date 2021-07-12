package algorithmen;

public class QuickVergleich {

	public static void main(String[] args) {
		int					anzahl = 12000;
		Quicksort			Q = new Quicksort(anzahl);
		//Q.sortiertfuellen();
		Bubblesort			B = new Bubblesort(Q.kopieren());
		EinfachSortieren	E = new EinfachSortieren(Q.kopieren());
		if (anzahl < 13) {
			System.out.println("Unsortierte Folge:");
			Q.ausgeben();
		}
		E.sortieren();
		System.out.print("Mit einfachem Sortieren sortierte Folge");
		System.out.println(" nach " + E.zaehler + " Durchläufen:");
		if (anzahl < 13)	E.ausgeben();
		B.sortieren();
		System.out.print("Mit Bubblesort sortierte Folge");
		System.out.println(" nach " + B.zaehler + " Durchläufen:");
		if (anzahl < 13)	B.ausgeben();
		Q.sortieren();
		System.out.print("Mit Quicksort sortierte Folge");
		System.out.println(" nach " + Q.zaehler + " Durchläufen:");
		if (anzahl < 13)	Q.ausgeben();
	}

}
