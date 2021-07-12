package algorithmen;

/* Klasse "MaximumSuchen" erbt von "Feld";
 * damit stehen alle Member (Variablen und Methoden)
 * von "Feld" hier zu Verfügung */
public class MaximumSuchen extends Feld {

	/* Zähler für Schleifendurchläufe bzw. Aufrufe */
	int	zaehler;
	/* Position des größten Wertes */
	int position;

	/* Konstruktor für dieses Klasse; da "Feld" keinen
	 * Standardkonstruktor hat, darf hier auch kein
	 * Standardkonstruktor verwendet werden */
	public MaximumSuchen(int n) {
		/* Aufruf des Konstruktors von "Feld";
		 * damit wird das Array initialisiert */
		super(n);
		/* Hier wäre noch Platz für zusätzliche
		 * Initialisierungen, speziell für diese Klasse */
		/* Zähler für Durchläufe/Aufrufe wird zurückgesetzt */
		this.zaehler = 0;
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

	/* Rekursive Suche nach der größten Zahl
	 * mit vereinfachter Signatur für Suche im ganzen Array;
	 * Position wird im Member "position" gesichert */
	public void gutesucherekursiv() {
		this.gutesucherekursiv(0, this.zahlen.length - 1);
	}

	/* Startmethode für rekursive Suche;
	 * Anfangsposition "a" wird als vorläufig beste
	 * Position initialisiert, weitere Suche ab
	 * Position "a + 1" bis Ende */
	public void gutesucherekursiv(int a, int e) {
		this.position = a;
		this.gutesucherekursivlauf(a + 1, e);
	}

	/* Laufmethode für rekursive Suche */
	public void gutesucherekursivlauf(int a, int e) {
		/* Falls Wert an aktueller Position größer ist
		 * als der Wert an "position", wird "position"
		 * entsprechend aktualisiert */
		if (this.zahlen[a] > this.zahlen[this.position])
			this.position = a;
		/* Falls des Ende noch nicht erreicht ist */
		if (a < e) {
			/* Aufruf mit nächster Position */
			this.gutesucherekursivlauf(a + 1, e);
			/* Weiterer Aufruf wird mitgezählt */
			this.zaehler = this.zaehler + 1;
		}
	}

	/* Rekursive Suche nach der größten Zahl
	 * mit vereinfachter Signatur für Suche im ganzen Array */
	public int suchemaxrekursiv() {
		return this.suchemaxrekursiv(0, this.zahlen.length - 1);
	}

	/* Rekursive Suche nach der größten Zahl
	 * mit vereinfachter Signatur für Suche in Bereich;
	 * beginnt die Suche bei Arrayindex "a",
	 * beendet die Suche bei Arrayindex "e" */
	public int suchemaxrekursiv(int a, int e) {
		/* Aufruf der eigentlichen Suche; Beginn bei
		 * der nächsten Position "a + 1", da Anfangsposition
		 * "a" als Vergleichsposition (letzter Parameter)
		 * verwendet wird; Ende bei Position "e" */
		return this.suchemaxrekursiv(a + 1, e, a);
	}

	/* Rekursive Suche nach der größten Zahl;
	 * beginnt die Suche bei Arrayindex "a",
	 * beendet die Suche bei Arrayindex "e",
	 * mit Vergleichswert "pos" */
	public int suchemaxrekursiv(int a, int e, int pos) {
		/* Falls aktuelle Anfangsposition "a" einen größeren
		 * Wert beinhaltet, wird "pos" darauf aktualisiert */
		if (this.zahlen[a] > this.zahlen[pos]) pos = a;
		/* Falls das Ende noch nicht erreicht ist */
		if (a < e) {
			/* Nochmaliger Aufruf mit der nachfolgenden
			 * Position "a + 1", dem Ende "e" und
			 * Vergleichsposition "pos"; die Rückgabe wird
			 * wieder in "pos" gespeichert */
			pos = this.suchemaxrekursiv(a + 1, e, pos);
			/* Weiterer Aufruf wird mitgezählt */
			this.zaehler = this.zaehler + 1;
		}
		/* Rückgabe der Position "pos" */
		return pos;
	}

	/* Methode für die Suche nach der größten Zahl;
	 * beginnt die Suche bei Arrayindex "a",
	 * beendet die Suche bei Arrayindex "e",
	 * gibt die Position im Array zurück */
	public int suchemax(int a, int e) {
		/* Erste Position als Vergleichsposition */
		int	pos = a;
		/* Nächste Position für den Start des Vergleichs */
		int	i = a + 1;
		/* Solange die Endeposition nicht erreicht ist */
		while (i <= e) {
			/* Falls aktuelle Position "i" einen größeren
			 * Wert beinhaltet, wird "pos" darauf aktualisiert */
			if (this.zahlen[i] > this.zahlen[pos]) pos = i;
			/* Nächste Arrayposition */
			i = i + 1;
			/* Weiterer Durchlauf wird mitgezählt */
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
