package algorithmenV2;

/* Klasse "MaximumSuchen" erbt von "Feld";
 * damit stehen alle Member (Variablen und Methoden)
 * von "Feld" hier zu Verf�gung */
public class MaximumSuchen extends Feld {

	/* Z�hler f�r Schleifendurchl�ufe */
	int	zaehler = 0;

	/* Konstruktor f�r dieses Klasse; da "Feld" keinen
	 * Standardkonstruktor hat, darf hier auch kein
	 * Standardkonstruktor verwendet werden */
	public MaximumSuchen(int n) {
		/* Aufruf des Konstruktors von "Feld";
		 * damit wird das Array initialisiert */
		super(n);
		/* Hier w�re noch Platz f�r zus�tzliche
		 * Initialisierungen, speziell f�r diese Klasse */
	}
	/* Konstruktor f�r dieses Klasse; da "Feld" keinen
	 * Standardkonstruktor hat, darf hier auch kein
	 * Standardkonstruktor verwendet werden */
	public MaximumSuchen(int[] a) {
		/* Aufruf des Konstruktors von "Feld";
		 * damit wird das Array initialisiert */
		super(a);
		/* Hier w�re noch Platz f�r zus�tzliche
		 * Initialisierungen, speziell f�r diese Klasse */
	}

	/* Methode f�r die Suche nach der gr��ten Zahl;
	 * beginnt die Suche bei Arrayindex "a",
	 * beendet die Suche bei Arrayindex "e",
	 * gibt die Position im Array zur�ck */
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

	/* Einfache Suche f�r die Methode nach der gr��ten Zahl;
	 * vereinfachte Signatur f�r die Suche im ganzen Array */
	public int suchemax() {
		return this.suchemax(0, this.zahlen.length - 1);
	}
}
