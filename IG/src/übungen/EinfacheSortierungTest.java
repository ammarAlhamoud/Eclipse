package übungen;

public class EinfacheSortierungTest {

	public static void main(String[] args) {
		EinfacheSortierung E = new EinfacheSortierung(12);
		System.out.println("Array vor der Sortierung");
		E.ausgeben();
		int anz = E.sortiere();
		System.out.println("Array nach Sortierung (nach " + anz+" Durchläufe)");
		E.ausgeben();
	}

}
