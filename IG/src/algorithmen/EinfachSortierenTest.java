package algorithmen;

public class EinfachSortierenTest {

	public static void main(String[] args) {
		EinfachSortieren	E = new EinfachSortieren(12);
		// E.sortiertfuellen();
		System.out.println("Unsortiertes Array:");
		E.ausgeben();
		E.sortieren();
		System.out.print("Sortiertes Array (nach " + E.zaehler);
		System.out.println(" Durchläufen):");
		E.ausgeben();
	}

}
