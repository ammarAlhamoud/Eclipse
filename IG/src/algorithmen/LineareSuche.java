package algorithmen;

/* Klasse "LineareSuche" erbt von "Feld";
 * damit stehen alle Member (Variablen und Methoden)
 * von "Feld" hier zu Verfügung */
public class LineareSuche extends Feld {

	/* Konstruktor für dieses Klasse; da "Feld" keinen
	 * Standardkonstruktor hat, darf hier auch kein
	 * Standardkonstruktor verwendet werden */
	public LineareSuche(int n) {
		/* Aufruf des Konstruktors von "Feld";
		 * damit wird das Array initialisiert */
		super(n);
		/* Hier wäre noch Platz für zusätzliche
		 * Initialisierungen, speziell für diese Klasse */
	}

	/* Lineare Suche im int-Array;
	 * erhält gesuchte Zahl als Parameter;
	 * gibt die Position als int-Zahl zurück */
	public int suchen(int g) {
		/* Position der gesuchten Zahl; wird zunächst
		 * mit ungültigem Wert initialisiert, falls es
		 * die gesuchte Zahl im Array nicht gibt */
		int		pos = -1;
		/* Laufindex, beginnt bei Array-Position 0 */
		int		i = 0;
		/* Solange der Laufindex innerhalb des Arrays ist
		 * und die Zahl nicht gefunden wurde */
		while ((i < this.zahlen.length) && (pos < 0)) {
			/* Falls die gesuchte Zahl an der aktuellen
			 * Laufindex-Position des Arrays ist ... */
			if (this.zahlen[i] == g) {
				/* ... Positionsangabe auf diesen Index setzen */
				pos = i;
			}
			/* Weiter zum nächsten Index */
			i = i + 1;
		}
		/* Rückgabe der Position */
		return pos;
	}

	/* Optimierte Variante der linearen Suche im int-Array;
	 * erhält gesuchte Zahl als Parameter;
	 * gibt die Position als int-Zahl zurück */
	public int optsuchen(int g) {
		/* Laufindex auf letzte Array-Position setzen */
		int		i = this.zahlen.length - 1;
		/* Solange der Laufindex noch im gültigen Arraybereich
		 * ist und die Zahl nicht gefunden wurde */
		while ((i >= 0) && (this.zahlen[i] != g)) {
			/* Weiter zur nächsten Position */
			i = i - 1;
		}
		/* Falls Zahl gefunden wurde, ist Laufindex "i" auf
		 * dieser Position, sonst ist "i" automatisch "-1" */
		return i;
	}

	/* Rekursive Variante der linearen Suche;
	 * erhält als Parameter die gesuchte Zahl sowie
	 * die aktuelle Position für rekursiven Aufruf;
	 * gibt die Position als int-Zahl zurück;
	 * die Suche verläuft von der letzten Position
	 * zum Anfang des Arrays */
	public int rekursivsuchen(int g, int pos) {
		/* Falls der Anfang noch nicht erreicht wurde */
		if (pos >= 0) {
			/* Falls die Zahl noch nicht gefunden wurde */
			if (this.zahlen[pos] != g)
				/* erneuter Aufruf mit nächster Position */
				pos = this.rekursivsuchen(g, pos - 1);
		}
		/* Rückgabe der Position; ist automatisch "-1",
		 * wenn die Zahl im Array nicht existiert */
		return pos;
	}

	/* Rekursive Variante der linearen Suche
	 * mit vereinfachter Signatur;
	 * erhält als Parameter die gesuchte Zahl;
	 * gibt die Position als int-Zahl zurück */
	public int rekursivsuchen(int g) {
		/* Aufruf der obigen rekursiven Suche mit der
		 * letzten Arrayposition als Anfangswert */
		return this.rekursivsuchen(g, this.zahlen.length - 1);
	}
}



