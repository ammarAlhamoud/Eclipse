package einfache_verkettete_liste;

public class Test {

	public static void main(String[] args) 
	{// Neue Liste erzeugen
		ThemenListe themen = new ThemenListe();

		// Fuegt drei Themen der Liste hinzu
		themen.hinzufuegen("News");
		themen.hinzufuegen("Sport");
		themen.hinzufuegen("Gosship");

		// Loescht ein Thema wieder
		themen.entfernen("Sport");

		// Gibt alle Themen der Liste in einem Array aus
		for (int i = 0; i < themen.getThemen().length; i++) {
			System.out.println(themen.getThemen()[i]);
		}

	}
		
}


