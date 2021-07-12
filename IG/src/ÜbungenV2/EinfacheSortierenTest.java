package ÜbungenV2;

public class EinfacheSortierenTest {

	public static void main(String[] args) {
		EinfacheSortieren E = new EinfacheSortieren(12);
		System.out.println("Array vor Sortieren:");
		E.ausgeben();
		
		E.sortiere();
		System.out.println("Array nach Sortieren:");
		E.ausgeben();
	}

}
