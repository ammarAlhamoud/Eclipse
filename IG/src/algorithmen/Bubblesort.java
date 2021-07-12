package algorithmen;

/* Klasse "Bubblesort" erbt von "Feld";
 * damit stehen alle Member (Variablen und Methoden)
 * von "Feld" hier zu Verfügung */
public class Bubblesort extends Feld {

	/* Zähler für Schleifendurchläufe */
	int		zaehler = 0;

	/* Konstruktor für dieses Klasse; da "Feld" keinen
	 * Standardkonstruktor hat, darf hier auch kein
	 * Standardkonstruktor verwendet werden */
	public Bubblesort(int n) {
		/* Aufruf des Konstruktors von "Feld";
		 * damit wird das Array initialisiert */
		super(n);
		/* Hier wäre noch Platz für zusätzliche
		 * Initialisierungen, speziell für diese Klasse */
	}

	/* Konstruktor für dieses Klasse; da "Feld" keinen
	 * Standardkonstruktor hat, darf hier auch kein
	 * Standardkonstruktor verwendet werden */
	public Bubblesort(int[] a) {
		/* Aufruf des Konstruktors von "Feld";
		 * damit wird das Array initialisiert */
		super(a);
		/* Hier wäre noch Platz für zusätzliche
		 * Initialisierungen, speziell für diese Klasse */
	}

	/* Methode für die Sortierung nach Bubblesortmethode */
	public void sortieren() {
		/* Marker, ob getauscht wurde */
		boolean	marker;
		/* Laufvariable für Arraydurchlauf */
		int		i;
		/* Hilfsvariable für Dreieckstausch */
		int		hilf;
		/* Hilfsvariable für die logische Arraylänge */
		int		l = this.zahlen.length;
		/* Äußere Schleife */
		do {
			/* Logische Länge um eins verkürzen; das wird
			 * hier schon gemacht, da später dann auf
			 * "i < l" statt auf "i < l - 1" geprüft wird */
			l = l - 1;
			/* Es wurde am Anfang noch nichts getauscht;
			 * deswegen wird der Marker auf "unwahr"
			 * (zurück-)gesetzt */
			marker = false;
			/* Laufvariable beginnt beim ersten Index */
			i = 0;
			/* Innere Schleife */
			do {
				/* Zähler hochzählen */
				this.zaehler = this.zaehler + 1;
				/* Prüfen ob der Arrayinhalt am aktuellen Index
				 * größer als sein Nachfolger ist */
				if (this.zahlen[i] > this.zahlen[i + 1]) {
					/* Reihenfolge stimmt nicht, es muss
					 * getauscht werden; deswegen wird der
					 * Marker auf "wahr" gesetzt */
					marker = true;
					/* Dreieckstausch */
					hilf = this.zahlen[i];
					this.zahlen[i] = this.zahlen[i + 1];
					this.zahlen[i + 1] = hilf;
				}
				/* Laufindex auf das nächste Element setzen */
				i = i + 1;
			/* Solange, bis das vorletzte Element erreicht wird;
			 * da immer mit dem nächsten verglichen wird, und
			 * das letzte Element keinen Nachfolger hat */
			} while (i < l);
		/* Solange mindestens einmal getauscht wurde, ist nicht
		 * fertig sortiert */
		} while (marker == true);
	}
}
