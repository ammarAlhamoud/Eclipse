package algorithmen;

public class QuickTest {

	public static void main(String[] args) {
		Quicksort	Q = new Quicksort(12);
		System.out.println("Unsortierte Folge:");
		Q.ausgeben();
		Q.sortieren();
		System.out.print("Mit Quicksort sortierte Folge");
		System.out.println(" nach " + Q.zaehler + " Durchläufen:");
		Q.ausgeben();
	}

}
