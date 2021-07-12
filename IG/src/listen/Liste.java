package listen;

public class Liste {

	public static final byte	VOLL = 0x1;
	public static final byte	LEER = 0x0;

	public int		inhalt;
	public Liste	Verweis;

	/* Konstruktor für leeres Listenelement */
	public Liste() {
		this.inhalt = 0;
		this.Verweis = null;
	}

	/* Konstruktor für Listenelement mit Inhalt */
	public Liste(int n) {
		this.inhalt = n;
		this.Verweis = null;
	}

	/* Konstruktor für Liste mit "n" leeren Elementen;
	 * falls "b" = "VOLL", wird Liste mit Zufallszahlen
	 * befüllt, für "b" = "LEER" ist der Inhalt leer */
	public Liste(int n, byte b) {
		int		i;
		Liste	Neu;
		/* Aktuelles Element mit Inhalt */
		this.inhalt = (int)(Math.random() * 100 * b);
		/* An aktuelles Element werden n - 1 zusätzliche
		 * Elemente angefügt */
		for (i = 1; i < n; i++) {
			Neu = new Liste((int)(Math.random() * 100 * b));
			this.anfuegen(Neu);
		}
	}

	/* Neue Liste erzeugen; diese Methode ist "static",
	 * weil sie ein neues Objekt erzeugt und nicht mit
	 * einem neuen Objekt aufgerufen werden kann;
	 * Referenz auf neues Listenobjekt wird zurückgegeben */
	public static Liste erzeugen(int n) {
		/* Erstes Objekt wird erzeugt */
		Liste	Anfang = new Liste();
		int		i;
		/* n - 1 zusätzliche Objekte werden erzeugt und
		 * angefügt */
		for (i = 1; i < n; i++) {
			Anfang.anfuegen(new Liste());
		}
		/* Listenanfang wird zurückgegeben */
		return Anfang;
	}

	/* Ausgeben des aktuellen Listenelements */
	public void ausgeben() {
		System.out.println(this.inhalt);
	}

	/* Ausgeben aller Listenelemente;
	 * die Methode wird mit dem Objekt für den
	 * Listenanfang aufgerufen */
	public void alleausgeben() {
		/* Listenanfang aus dem aktuellen Objekt in
		 * Hilfsvariable "H" kopieren */
		Liste	H = this;
		/* Solange "H" noch ein gültiges Listenelement
		 * referenziert */
		while (H != null) {
			/* Das Listenelement ausgeben */
			H.ausgeben();
			/* "H" auf das nachfolgende Element aktualisieren */
			H = H.Verweis;
		}
	}

	/* Rekursives Ausgeben aller Listenelemente;
	 * die Methode wird mit dem Objekt für den
	 * Listenanfang aufgerufen */
	public void allerekursivausgeben() {
		/* Aktuelles Objekt/Element wird ausgegeben */
		this.ausgeben();
		/* Falls nachfolgendes Objekt nicht "null" ist */
		if (this.Verweis != null) {
			/* Aufruf der Methode mit nachfolgendem Objekt */
			this.Verweis.allerekursivausgeben();
		}
	}

	/* Gibt Verweis auf das letzte Listenelement zurück;
	 * Aufruf mit dem Listenanfang */
	public Liste letztesElement() {
		/* Beim Listenanfang beginnen */
		Liste	Letztes = this;
		/* Solange der Verweis des Elements nicht "null"
		 * beinhaltet, ist es nicht das letzte Element */
		while (Letztes.Verweis != null) {
			/* Element wird auf Nachfolger aktualisiert */
			Letztes = Letztes.Verweis;
		}
		/* Verweis auf letztes Element wird zurückgegeben */
		return Letztes;
	}

	/* Anfügen eines Elements ans Ende der Liste */
	public void anfuegen(Liste Neu) {
		/* Ans Ende der Liste springen */
		Liste	Letztes = this.letztesElement();
		/* Verweis des letzten Elements auf das neue
		 * aktualisieren */
		Letztes.Verweis = Neu;
	}

	/* Rekursive Version für den Verweis auf das letzte Element;
	 * wird mit dem Listenanfang aufgerufen */
	public Liste letztesRekursivLang() {
		/* Hilfsvariable wird mit dem Verweis initalisiert,
		 * mit dem die Methode aufgerufen wurde */
		Liste	L = this;
		/* Falls der Verweis des Elements nicht "null" ist,
		 * ist es auch nicht das letzte - Rekursionsanker */
		if (L.Verweis != null) {
			/* Aktualisierung auf den Nachfolger */
			L = L.Verweis;
			/* Rekursiver Aufruf der Methode mit dem Nachfolger
			 * - Rekursionsschritt; das Ergebnis der Methode
			 * wird wieder in der Hilfsvariable gesichert */
			L = L.letztesRekursivLang();
		}
		/* Hilfsvariable beinhaltet Verweis auf letztes
		 * Element und wird zurückgegeben */
		return L;
	}

	/* Rekursive optimierte Version für den Verweis auf das
	 * letzte Element; wird mit dem Listenanfang aufgerufen */
	public Liste letztesRekursiv() {
		/* Falls Nachfolger existiert */
		if (this.Verweis != null) {
			/* Aufruf mit dem Nachfolger, Ergebnis des
			 * Aufrufs wird gleich zurückgegeben */
			return (this.Verweis).letztesRekursiv();
		}
		/* Falls Nachfolger nicht existiert, ist das
		 * aktuelle Element das letzte und wird zurückgegeben */
		return this;
	}

}
