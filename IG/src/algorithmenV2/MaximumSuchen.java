package algorithmenV2;

/* Klasse "MaximumSuchen" erbt von "Feld";
 * damit stehen alle Member (Variablen und Methoden)
 * von "Feld" hier zu Verfügung */
public class MaximumSuchen extends Feld {

	/* Zähler für Schleifendurchläufe */
	int	zaehler = 0;

	/* Konstruktor für dieses Klasse; da "Feld" keinen
	 * Standardkonstruktor hat, darf hier auch kein
	 * Standardkonstruktor verwendet werden */
	public MaximumSuchen(int n) {
		/* Aufruf des Konstruktors von "Feld";
		 * damit wird das Array initialisiert */
		super(n);
		/* Hier wäre noch Platz für zusätzliche
		 * Initialisierungen, speziell für diese Klasse */
	}
	/* Konstruktor für dieses Klasse; da "Feld" keinen
	 * Standardkonstruktor hat, darf hier auch kein
	 * Standardkonstruktor verwendet werden */
	public MaximumSuchen(int[] a) {
		/* Aufruf des Konstruktors von "Feld";
		 * damit wird das Array initialisiert */
		super(a);
		/* Hier wäre noch Platz für zusätzliche
		 * Initialisierungen, speziell für diese Klasse */
	}

	/* Methode für die Suche nach der größten Zahl;
	 * beginnt die Suche bei Arrayindex "a",
	 * beendet die Suche bei Arrayindex "e",
	 * gibt die Position im Array zurück */
	public int suchemax(int a, int e) {
		int	pos = a;
		int	i = a + 1;
		while (i <= e) {
			if (this.zahlen[i] > this.zahlen[pos]) pos = i;
			i = i + 1;
			this.zaehler = this.zaehler + 1;
		}
		return pos;
	}

	/* Einfache Suche für die Methode nach der größten Zahl;
	 * vereinfachte Signatur für die Suche im ganzen Array */
	public int suchemax() {
		return this.suchemax(0, this.zahlen.length - 1);
	}
}
