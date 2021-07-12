package algorithmen;

/* Klasse "Quicksort" erbt von "Feld";
 * damit stehen alle Member (Variablen und Methoden)
 * von "Feld" hier zu Verf�gung */
public class Quicksort extends Feld {

	/* Z�hler f�r Schleifendurchl�ufe */
	int	zaehler = 0;

	/* Konstruktor f�r dieses Klasse; da "Feld" keinen
	 * Standardkonstruktor hat, darf hier auch kein
	 * Standardkonstruktor verwendet werden */
	public Quicksort(int n) {
		/* Aufruf des Konstruktors von "Feld";
		 * damit wird das Array initialisiert */
		super(n);
		/* Hier w�re noch Platz f�r zus�tzliche
		 * Initialisierungen, speziell f�r diese Klasse */
	}

	/* Konstruktor f�r dieses Klasse; da "Feld" keinen
	 * Standardkonstruktor hat, darf hier auch kein
	 * Standardkonstruktor verwendet werden */
	public Quicksort(int[] a) {
		/* Aufruf des Konstruktors von "Feld";
		 * damit wird das Array initialisiert */
		super(a);
		/* Hier w�re noch Platz f�r zus�tzliche
		 * Initialisierungen, speziell f�r diese Klasse */
	}

	/* Methode f�r die Sortierung nach Quicksortmethode
	 * f�r das ganze Array mit einfacher Signatur */
	public void sortieren() {
		this.sortieren(0, this.zahlen.length - 1);
	}

	/* Methode f�r die Sortierung nach Quicksortmethode */
	public void sortieren(int anfang, int ende) {
		/* Hilfsvariable f�r Dreieckstausch */
		int		hilf;
		/* Logisches Arrayende */
		int		e = ende;
		/* Pivotelement am logischen Arrayanfang */
		int		pivot = anfang;
		/* Durchlauf �ber alle Elemente */
		do {
			/* Falls der Nachfolger gr��er als das
			 * Pivot-Element */
			if (this.zahlen[pivot] > this.zahlen[pivot + 1]) {
				/* Dreieckstausch von Pivot-Element
				 * und Nachfolger */
				hilf = this.zahlen[pivot];
				this.zahlen[pivot] = this.zahlen[pivot + 1];
				this.zahlen[pivot + 1] = hilf;
				/* Pivot-Element auf n�chste Position */
				pivot = pivot + 1;
			/* Sonst */
			} else {
				/* Dreieckstausch zwischen Nachfolger
				 * und letztem Element */
				hilf = this.zahlen[pivot + 1];
				this.zahlen[pivot + 1] = this.zahlen[e];
				this.zahlen[e] = hilf;
				/* Array logisch um eins verk�rzen */
				e = e - 1;
			}
			/* Schleifenz�hler erh�hen */
			this.zaehler = this.zaehler + 1;
		/* Weiterer Durchlauf solange das Pivot-Element
		 * das Ende nicht erreicht hat */
		} while (pivot < e);
		/* Falls in der linken H�lfte mehr als ein Element
		 * ist, muss diese weiter sortiert werden */
		if (anfang < (pivot - 1))
			this.sortieren(anfang, pivot - 1);
		/* Falls in der rechten H�lfte mehr als ein Element
		 * ist, muss diese weiter sortiert werden */
		if (ende > (pivot + 1))
			this.sortieren(pivot + 1, ende);
	}
}
