package algorithmen;

/* Klasse "Bubblesort" erbt von "Feld";
 * damit stehen alle Member (Variablen und Methoden)
 * von "Feld" hier zu Verf�gung */
public class Bubblesort extends Feld {

	/* Z�hler f�r Schleifendurchl�ufe */
	int		zaehler = 0;

	/* Konstruktor f�r dieses Klasse; da "Feld" keinen
	 * Standardkonstruktor hat, darf hier auch kein
	 * Standardkonstruktor verwendet werden */
	public Bubblesort(int n) {
		/* Aufruf des Konstruktors von "Feld";
		 * damit wird das Array initialisiert */
		super(n);
		/* Hier w�re noch Platz f�r zus�tzliche
		 * Initialisierungen, speziell f�r diese Klasse */
	}

	/* Konstruktor f�r dieses Klasse; da "Feld" keinen
	 * Standardkonstruktor hat, darf hier auch kein
	 * Standardkonstruktor verwendet werden */
	public Bubblesort(int[] a) {
		/* Aufruf des Konstruktors von "Feld";
		 * damit wird das Array initialisiert */
		super(a);
		/* Hier w�re noch Platz f�r zus�tzliche
		 * Initialisierungen, speziell f�r diese Klasse */
	}

	/* Methode f�r die Sortierung nach Bubblesortmethode */
	public void sortieren() {
		/* Marker, ob getauscht wurde */
		boolean	marker;
		/* Laufvariable f�r Arraydurchlauf */
		int		i;
		/* Hilfsvariable f�r Dreieckstausch */
		int		hilf;
		/* Hilfsvariable f�r die logische Arrayl�nge */
		int		l = this.zahlen.length;
		/* �u�ere Schleife */
		do {
			/* Logische L�nge um eins verk�rzen; das wird
			 * hier schon gemacht, da sp�ter dann auf
			 * "i < l" statt auf "i < l - 1" gepr�ft wird */
			l = l - 1;
			/* Es wurde am Anfang noch nichts getauscht;
			 * deswegen wird der Marker auf "unwahr"
			 * (zur�ck-)gesetzt */
			marker = false;
			/* Laufvariable beginnt beim ersten Index */
			i = 0;
			/* Innere Schleife */
			do {
				/* Z�hler hochz�hlen */
				this.zaehler = this.zaehler + 1;
				/* Pr�fen ob der Arrayinhalt am aktuellen Index
				 * gr��er als sein Nachfolger ist */
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
				/* Laufindex auf das n�chste Element setzen */
				i = i + 1;
			/* Solange, bis das vorletzte Element erreicht wird;
			 * da immer mit dem n�chsten verglichen wird, und
			 * das letzte Element keinen Nachfolger hat */
			} while (i < l);
		/* Solange mindestens einmal getauscht wurde, ist nicht
		 * fertig sortiert */
		} while (marker == true);
	}
}
