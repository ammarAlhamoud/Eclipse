package algorithmen;

/* Klasse "EinfachSortieren" erbt von "MaximumSuchen";
 * damit stehen alle Member (Variablen und Methoden)
 * von "MaximumSuchen" hier zu Verf�gung (und "Feld",
 * da "MaximumSuchen" seinerseits von "Feld" erbt) */
public class EinfachSortieren extends MaximumSuchen {

	/* Konstruktor f�r dieses Klasse; da "MaximumSuchen"
	 * keinen Standardkonstruktor hat, darf hier auch kein
	 * Standardkonstruktor verwendet werden */
	public EinfachSortieren(int n) {
		/* Aufruf des Konstruktors von "MaximumSuchen";
		 * damit wird das Array initialisiert */
		super(n);
		/* Hier w�re noch Platz f�r zus�tzliche
		 * Initialisierungen, speziell f�r diese Klasse */
	}

	/* Konstruktor f�r dieses Klasse; da "MaximumSuchen"
	 * keinen Standardkonstruktor hat, darf hier auch kein
	 * Standardkonstruktor verwendet werden */
	public EinfachSortieren(int[] a) {
		/* Aufruf des Konstruktors von "MaximumSuchen";
		 * damit wird das Array initialisiert */
		super(a);
		/* Hier w�re noch Platz f�r zus�tzliche
		 * Initialisierungen, speziell f�r diese Klasse */
	}

	/* Sortiermethode f�r das Array;
	 * gibt die Anzahl der Schleifendurchl�ufe zur�ck */
	public void sortieren() {
		/* Position des gr��ten Elements */
		int		pos;
		/* Hilfsvariable f�r Dreieckstausch */
		int		hilf;
		/* Logische L�nge des Arrays in Hilfsvariable "l" */
		int		l = this.zahlen.length;
		/* Falls logische L�nge gr��er als eins, d.h. mehr
		 * als ein Element im logischen Array, wird die
		 * Schleife nochals ausgef�hrt */
		while (l > 1) {
			/* Suche nach gr��ter Zahl im Array im Bereich
			 * des ersten Elements (0) bis zum letzten
			 * Element (l-1) bez�glich der logischen L�nge */
			pos = this.suchemax(0, l - 1);
			/* Tausch des gr��ten mit dem letzten Element */
			hilf = this.zahlen[pos];
			this.zahlen[pos] = this.zahlen[l - 1];
			this.zahlen[l - 1] = hilf;
			/* Logische Verk�rzung des Arrays um eins */
			l = l - 1;
		}
	}
}
