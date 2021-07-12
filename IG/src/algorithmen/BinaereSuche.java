package algorithmen;

/* Klasse "BinaereSuche" erbt von "EinfachSortieren";
 * damit stehen alle Member (Variablen und Methoden)
 * von "EinfachSortieren" hier zu Verf�gung, inklusive
 * der Sortiermethode, damit das Array sortiert
 * werden kann (Bedingung f�r bin�re Suche) */
public class BinaereSuche extends EinfachSortieren {

	/* Konstruktor f�r dieses Klasse; da "EinfachSortieren"
	 * keinen Standardkonstruktor hat, darf hier auch kein
	 * Standardkonstruktor verwendet werden */
	public BinaereSuche(int n) {
		/* Aufruf des Konstruktors von "Feld";
		 * damit wird das Array initialisiert */
		super(n);
		/* Hier w�re noch Platz f�r zus�tzliche
		 * Initialisierungen, speziell f�r diese Klasse;
		 * das Feld wird f�r die Suche vorher sortiert */
		this.sortieren();
	}

	/* Suchmethode f�r die bin�re Suche im int-Array */
	public int suchen(int g) {
		/* Position der Zahl; vorbelegt mit der ung�ltigen
		 * Position, da Zahl noch nicht gefunden wurde */
		int	pos = -1;
		/* Anfangsindex des Arrays */
		int	a = 0;
		/* Endindex des Arrays */
		int	e = this.zahlen.length - 1;
		/* Mitte des Arrays */
		int	m;
		/* Solange noch ein Element im Array ist bzw.
		 * solange der Anfang des Ende nicht "�berholt" */
		while (a <= e) {
			/* Mittelposition aus Anfang und Ende bestimmen */
			m = (a + e) / 2;
			/* Pr�fen, ob Element an Mittelposition das gesuchte ist */
			if (this.zahlen[m] == g) {
				/* Falls ja, Abbruchbedingung setzen */
				a = e + 1;
				/* Mittelposition ist Position des Elements */
				pos = m;
			}
			/* Falls nein, pr�fen ob Element an Mittelposition
			 * gr��er ist als das gesuchte Element */
			else {
				if (this.zahlen[m] > g)
					/* Falls dem so ist, Ende auf Mittelposition - 1 */
					e = m - 1;
					/* Sonst Anfang auf Mittelposition + 1 */
				else	a = m + 1;
			}
		}
		/* R�ckgabe der Position bzw. der ung�ltigen Position */
		return pos;
	}
	/* Rekursive Suchmethode f�r bin�re Suche;
	 * erh�lt als Parameter den gesuchten Wert sowie
	 * Anfangs- und Endindex des Arraybereichs */
	public int rekursivsuchen(int g, int a, int e) {
		/* Variable f�r Mittelposition im Arraybereich */
		int	m;
		/* Position der Zahl; vorbelegt mit der ung�ltigen
		 * Position, da Zahl noch nicht gefunden wurde */
		int	pos = -1;
		/* Falls noch mindestens ein Element im Arraybereich;
		 * d.h. falls der Anfang des Ende nicht "�berholt" */
		if (a <= e) {
			/* Mittelposition aus Anfang und Ende bestimmen */
			m = (a + e) / 2;
			/* Pr�fen, ob Element an Mittelposition das gesuchte ist */
			if (this.zahlen[m] == g)
				/* Falls ja, diese Position setzen */
				pos = m;
			/* Ansonsten */
			else {
				/* Pr�fen ob Zahl gr��er als gesuchte Zahl ist */
				if (this.zahlen[m] > g)
					/* Falls ja, im linken Teil weitersuchen;
					 * zur�ckgegebene Position sichern */
					pos = this.rekursivsuchen(g, a, m - 1);
				else
					/* Sonst im rechten Teil weitersuchen;
					 * zur�ckgegebene Position sichern */
					pos = this.rekursivsuchen(g, m + 1, e);
			}
		}
		/* Ermittelte Position zur�ckgeben */
		return pos;
	}
	/* Rekursive Suchmethode f�r bin�re Suche mit vereinfachter
	 * Signatur */
	public int rekursivsuchen(int g) {
		/* Aufruf der rekursiven Suche mit Anfangsindex und
		 * Endindex des Arrays */
		return this.rekursivsuchen(g, 0, this.zahlen.length - 1);
	}
}
