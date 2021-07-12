package algorithmen;

/* Klasse "Quicksort" erbt von "Feld";
 * damit stehen alle Member (Variablen und Methoden)
 * von "Feld" hier zu Verfügung */
public class Quicksort extends Feld {

	/* Zähler für Schleifendurchläufe */
	int	zaehler = 0;

	/* Konstruktor für dieses Klasse; da "Feld" keinen
	 * Standardkonstruktor hat, darf hier auch kein
	 * Standardkonstruktor verwendet werden */
	public Quicksort(int n) {
		/* Aufruf des Konstruktors von "Feld";
		 * damit wird das Array initialisiert */
		super(n);
		/* Hier wäre noch Platz für zusätzliche
		 * Initialisierungen, speziell für diese Klasse */
	}

	/* Konstruktor für dieses Klasse; da "Feld" keinen
	 * Standardkonstruktor hat, darf hier auch kein
	 * Standardkonstruktor verwendet werden */
	public Quicksort(int[] a) {
		/* Aufruf des Konstruktors von "Feld";
		 * damit wird das Array initialisiert */
		super(a);
		/* Hier wäre noch Platz für zusätzliche
		 * Initialisierungen, speziell für diese Klasse */
	}

	/* Methode für die Sortierung nach Quicksortmethode
	 * für das ganze Array mit einfacher Signatur */
	public void sortieren() {
		this.sortieren(0, this.zahlen.length - 1);
	}

	/* Methode für die Sortierung nach Quicksortmethode */
	public void sortieren(int anfang, int ende) {
		/* Hilfsvariable für Dreieckstausch */
		int		hilf;
		/* Logisches Arrayende */
		int		e = ende;
		/* Pivotelement am logischen Arrayanfang */
		int		pivot = anfang;
		/* Durchlauf über alle Elemente */
		do {
			/* Falls der Nachfolger größer als das
			 * Pivot-Element */
			if (this.zahlen[pivot] > this.zahlen[pivot + 1]) {
				/* Dreieckstausch von Pivot-Element
				 * und Nachfolger */
				hilf = this.zahlen[pivot];
				this.zahlen[pivot] = this.zahlen[pivot + 1];
				this.zahlen[pivot + 1] = hilf;
				/* Pivot-Element auf nächste Position */
				pivot = pivot + 1;
			/* Sonst */
			} else {
				/* Dreieckstausch zwischen Nachfolger
				 * und letztem Element */
				hilf = this.zahlen[pivot + 1];
				this.zahlen[pivot + 1] = this.zahlen[e];
				this.zahlen[e] = hilf;
				/* Array logisch um eins verkürzen */
				e = e - 1;
			}
			/* Schleifenzähler erhöhen */
			this.zaehler = this.zaehler + 1;
		/* Weiterer Durchlauf solange das Pivot-Element
		 * das Ende nicht erreicht hat */
		} while (pivot < e);
		/* Falls in der linken Hälfte mehr als ein Element
		 * ist, muss diese weiter sortiert werden */
		if (anfang < (pivot - 1))
			this.sortieren(anfang, pivot - 1);
		/* Falls in der rechten Hälfte mehr als ein Element
		 * ist, muss diese weiter sortiert werden */
		if (ende > (pivot + 1))
			this.sortieren(pivot + 1, ende);
	}
}
