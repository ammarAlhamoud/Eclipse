package algorithmen;

/* Klasse "BinaereSuche" erbt von "EinfachSortieren";
 * damit stehen alle Member (Variablen und Methoden)
 * von "EinfachSortieren" hier zu Verfügung, inklusive
 * der Sortiermethode, damit das Array sortiert
 * werden kann (Bedingung für binäre Suche) */
public class BinaereSuche extends EinfachSortieren {

	/* Konstruktor für dieses Klasse; da "EinfachSortieren"
	 * keinen Standardkonstruktor hat, darf hier auch kein
	 * Standardkonstruktor verwendet werden */
	public BinaereSuche(int n) {
		/* Aufruf des Konstruktors von "Feld";
		 * damit wird das Array initialisiert */
		super(n);
		/* Hier wäre noch Platz für zusätzliche
		 * Initialisierungen, speziell für diese Klasse;
		 * das Feld wird für die Suche vorher sortiert */
		this.sortieren();
	}

	/* Suchmethode für die binäre Suche im int-Array */
	public int suchen(int g) {
		/* Position der Zahl; vorbelegt mit der ungültigen
		 * Position, da Zahl noch nicht gefunden wurde */
		int	pos = -1;
		/* Anfangsindex des Arrays */
		int	a = 0;
		/* Endindex des Arrays */
		int	e = this.zahlen.length - 1;
		/* Mitte des Arrays */
		int	m;
		/* Solange noch ein Element im Array ist bzw.
		 * solange der Anfang des Ende nicht "überholt" */
		while (a <= e) {
			/* Mittelposition aus Anfang und Ende bestimmen */
			m = (a + e) / 2;
			/* Prüfen, ob Element an Mittelposition das gesuchte ist */
			if (this.zahlen[m] == g) {
				/* Falls ja, Abbruchbedingung setzen */
				a = e + 1;
				/* Mittelposition ist Position des Elements */
				pos = m;
			}
			/* Falls nein, prüfen ob Element an Mittelposition
			 * größer ist als das gesuchte Element */
			else {
				if (this.zahlen[m] > g)
					/* Falls dem so ist, Ende auf Mittelposition - 1 */
					e = m - 1;
					/* Sonst Anfang auf Mittelposition + 1 */
				else	a = m + 1;
			}
		}
		/* Rückgabe der Position bzw. der ungültigen Position */
		return pos;
	}
	/* Rekursive Suchmethode für binäre Suche;
	 * erhält als Parameter den gesuchten Wert sowie
	 * Anfangs- und Endindex des Arraybereichs */
	public int rekursivsuchen(int g, int a, int e) {
		/* Variable für Mittelposition im Arraybereich */
		int	m;
		/* Position der Zahl; vorbelegt mit der ungültigen
		 * Position, da Zahl noch nicht gefunden wurde */
		int	pos = -1;
		/* Falls noch mindestens ein Element im Arraybereich;
		 * d.h. falls der Anfang des Ende nicht "überholt" */
		if (a <= e) {
			/* Mittelposition aus Anfang und Ende bestimmen */
			m = (a + e) / 2;
			/* Prüfen, ob Element an Mittelposition das gesuchte ist */
			if (this.zahlen[m] == g)
				/* Falls ja, diese Position setzen */
				pos = m;
			/* Ansonsten */
			else {
				/* Prüfen ob Zahl größer als gesuchte Zahl ist */
				if (this.zahlen[m] > g)
					/* Falls ja, im linken Teil weitersuchen;
					 * zurückgegebene Position sichern */
					pos = this.rekursivsuchen(g, a, m - 1);
				else
					/* Sonst im rechten Teil weitersuchen;
					 * zurückgegebene Position sichern */
					pos = this.rekursivsuchen(g, m + 1, e);
			}
		}
		/* Ermittelte Position zurückgeben */
		return pos;
	}
	/* Rekursive Suchmethode für binäre Suche mit vereinfachter
	 * Signatur */
	public int rekursivsuchen(int g) {
		/* Aufruf der rekursiven Suche mit Anfangsindex und
		 * Endindex des Arrays */
		return this.rekursivsuchen(g, 0, this.zahlen.length - 1);
	}
}
