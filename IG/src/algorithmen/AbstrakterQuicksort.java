package algorithmen;

public abstract class AbstrakterQuicksort {

	public boolean vergleichen() { return true; }
	public void tauschen_mit_letztem() { }
	public void tauschen_mit_nachfolger() { }
	public void sortieren(int anfang, int ende) {
		/* Logisches Arrayende */
		int		e = ende;
		/* Pivotelement am logischen Arrayanfang */
		int		pivot = anfang;
		/* Durchlauf �ber alle Elemente */
		do {
			/* Falls der Nachfolger gr��er als das
			 * Pivot-Element */
			if (vergleichen()) {
				/* Dreieckstausch von Pivot-Element
				 * und Nachfolger */
				tauschen_mit_nachfolger();
				/* Pivot-Element auf n�chste Position */
				pivot = pivot + 1;
			/* Sonst */
			} else {
				/* Dreieckstausch zwischen Nachfolger
				 * und letztem Element */
				tauschen_mit_letztem();
				/* Array logisch um eins verk�rzen */
				e = e - 1;
			}
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
