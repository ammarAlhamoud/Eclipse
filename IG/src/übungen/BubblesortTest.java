package �bungen;

public class BubblesortTest {

	public static void main(String[] args) {
		Bubblesort	B = new Bubblesort(12);
		System.out.println("Unsortierte Folge:");
		B.ausgeben();
		B.sortiere_aufstiegend();
		System.out.println("Mit Bubblesort aufstiegend sortierte Folge:");
		B.ausgeben();
		B.sortiere_abstiegend();
		System.out.println("Mit Bubblesort abstiegend sortierte Folge:");
		B.ausgeben();
	}

}
