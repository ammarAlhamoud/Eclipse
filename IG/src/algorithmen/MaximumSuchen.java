package algorithmen;

/* Klasse "MaximumSuchen" erbt von "Feld";
 * damit stehen alle Member (Variablen und Methoden)
 * von "Feld" hier zu Verf�gung */
public class MaximumSuchen extends Feld {

	/* Z�hler f�r Schleifendurchl�ufe bzw. Aufrufe */
	int	zaehler;
	/* Position des gr��ten Wertes */
	int position;

	/* Konstruktor f�r dieses Klasse; da "Feld" keinen
	 * Standardkonstruktor hat, darf hier auch kein
	 * Standardkonstruktor verwendet werden */
	public MaximumSuchen(int n) {
		/* Aufruf des Konstruktors von "Feld";
		 * damit wird das Array initialisiert */
		super(n);
		/* Hier w�re noch Platz f�r zus�tzliche
		 * Initialisierungen, speziell f�r diese Klasse */
		/* Z�hler f�r Durchl�ufe/Aufrufe wird zur�ckgesetzt */
		this.zaehler = 0;
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

	/* Rekursive Suche nach der gr��ten Zahl
	 * mit vereinfachter Signatur f�r Suche im ganzen Array;
	 * Position wird im Member "position" gesichert */
	public void gutesucherekursiv() {
		this.gutesucherekursiv(0, this.zahlen.length - 1);
	}

	/* Startmethode f�r rekursive Suche;
	 * Anfangsposition "a" wird als vorl�ufig beste
	 * Position initialisiert, weitere Suche ab
	 * Position "a + 1" bis Ende */
	public void gutesucherekursiv(int a, int e) {
		this.position = a;
		this.gutesucherekursivlauf(a + 1, e);
	}

	/* Laufmethode f�r rekursive Suche */
	public void gutesucherekursivlauf(int a, int e) {
		/* Falls Wert an aktueller Position gr��er ist
		 * als der Wert an "position", wird "position"
		 * entsprechend aktualisiert */
		if (this.zahlen[a] > this.zahlen[this.position])
			this.position = a;
		/* Falls des Ende noch nicht erreicht ist */
		if (a < e) {
			/* Aufruf mit n�chster Position */
			this.gutesucherekursivlauf(a + 1, e);
			/* Weiterer Aufruf wird mitgez�hlt */
			this.zaehler = this.zaehler + 1;
		}
	}

	/* Rekursive Suche nach der gr��ten Zahl
	 * mit vereinfachter Signatur f�r Suche im ganzen Array */
	public int suchemaxrekursiv() {
		return this.suchemaxrekursiv(0, this.zahlen.length - 1);
	}

	/* Rekursive Suche nach der gr��ten Zahl
	 * mit vereinfachter Signatur f�r Suche in Bereich;
	 * beginnt die Suche bei Arrayindex "a",
	 * beendet die Suche bei Arrayindex "e" */
	public int suchemaxrekursiv(int a, int e) {
		/* Aufruf der eigentlichen Suche; Beginn bei
		 * der n�chsten Position "a + 1", da Anfangsposition
		 * "a" als Vergleichsposition (letzter Parameter)
		 * verwendet wird; Ende bei Position "e" */
		return this.suchemaxrekursiv(a + 1, e, a);
	}

	/* Rekursive Suche nach der gr��ten Zahl;
	 * beginnt die Suche bei Arrayindex "a",
	 * beendet die Suche bei Arrayindex "e",
	 * mit Vergleichswert "pos" */
	public int suchemaxrekursiv(int a, int e, int pos) {
		/* Falls aktuelle Anfangsposition "a" einen gr��eren
		 * Wert beinhaltet, wird "pos" darauf aktualisiert */
		if (this.zahlen[a] > this.zahlen[pos]) pos = a;
		/* Falls das Ende noch nicht erreicht ist */
		if (a < e) {
			/* Nochmaliger Aufruf mit der nachfolgenden
			 * Position "a + 1", dem Ende "e" und
			 * Vergleichsposition "pos"; die R�ckgabe wird
			 * wieder in "pos" gespeichert */
			pos = this.suchemaxrekursiv(a + 1, e, pos);
			/* Weiterer Aufruf wird mitgez�hlt */
			this.zaehler = this.zaehler + 1;
		}
		/* R�ckgabe der Position "pos" */
		return pos;
	}

	/* Methode f�r die Suche nach der gr��ten Zahl;
	 * beginnt die Suche bei Arrayindex "a",
	 * beendet die Suche bei Arrayindex "e",
	 * gibt die Position im Array zur�ck */
	public int suchemax(int a, int e) {
		/* Erste Position als Vergleichsposition */
		int	pos = a;
		/* N�chste Position f�r den Start des Vergleichs */
		int	i = a + 1;
		/* Solange die Endeposition nicht erreicht ist */
		while (i <= e) {
			/* Falls aktuelle Position "i" einen gr��eren
			 * Wert beinhaltet, wird "pos" darauf aktualisiert */
			if (this.zahlen[i] > this.zahlen[pos]) pos = i;
			/* N�chste Arrayposition */
			i = i + 1;
			/* Weiterer Durchlauf wird mitgez�hlt */
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
