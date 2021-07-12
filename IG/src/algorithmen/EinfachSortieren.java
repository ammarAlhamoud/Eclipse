package algorithmen;

/* Klasse "EinfachSortieren" erbt von "MaximumSuchen";
 * damit stehen alle Member (Variablen und Methoden)
 * von "MaximumSuchen" hier zu Verfügung (und "Feld",
 * da "MaximumSuchen" seinerseits von "Feld" erbt) */
public class EinfachSortieren extends MaximumSuchen {

	/* Konstruktor für dieses Klasse; da "MaximumSuchen"
	 * keinen Standardkonstruktor hat, darf hier auch kein
	 * Standardkonstruktor verwendet werden */
	public EinfachSortieren(int n) {
		/* Aufruf des Konstruktors von "MaximumSuchen";
		 * damit wird das Array initialisiert */
		super(n);
		/* Hier wäre noch Platz für zusätzliche
		 * Initialisierungen, speziell für diese Klasse */
	}

	/* Konstruktor für dieses Klasse; da "MaximumSuchen"
	 * keinen Standardkonstruktor hat, darf hier auch kein
	 * Standardkonstruktor verwendet werden */
	public EinfachSortieren(int[] a) {
		/* Aufruf des Konstruktors von "MaximumSuchen";
		 * damit wird das Array initialisiert */
		super(a);
		/* Hier wäre noch Platz für zusätzliche
		 * Initialisierungen, speziell für diese Klasse */
	}

	/* Sortiermethode für das Array;
	 * gibt die Anzahl der Schleifendurchläufe zurück */
	public void sortieren() {
		/* Position des größten Elements */
		int		pos;
		/* Hilfsvariable für Dreieckstausch */
		int		hilf;
		/* Logische Länge des Arrays in Hilfsvariable "l" */
		int		l = this.zahlen.length;
		/* Falls logische Länge größer als eins, d.h. mehr
		 * als ein Element im logischen Array, wird die
		 * Schleife nochals ausgeführt */
		while (l > 1) {
			/* Suche nach größter Zahl im Array im Bereich
			 * des ersten Elements (0) bis zum letzten
			 * Element (l-1) bezüglich der logischen Länge */
			pos = this.suchemax(0, l - 1);
			/* Tausch des größten mit dem letzten Element */
			hilf = this.zahlen[pos];
			this.zahlen[pos] = this.zahlen[l - 1];
			this.zahlen[l - 1] = hilf;
			/* Logische Verkürzung des Arrays um eins */
			l = l - 1;
		}
	}
}
