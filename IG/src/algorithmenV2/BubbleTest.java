package algorithmenV2;

public class BubbleTest {

	public static void main(String[] args) {
		Bubblesort	B = new Bubblesort(12);
		// B.sortiertfuellen();
		System.out.println("Unsortierte Folge:");
		B.ausgeben();
		B.sortieren();
		System.out.print("Mit Bubblesort sortierte Folge");
		System.out.println(" nach " + B.zaehler + " Durchläufen:");
		B.ausgeben();
	}

}
