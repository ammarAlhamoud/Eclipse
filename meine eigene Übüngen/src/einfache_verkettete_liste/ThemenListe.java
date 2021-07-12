package einfache_verkettete_liste;

public class ThemenListe 
	{private ListenElement anfang;
	private int groesse;
	
	public boolean beinhaltet(String thema) 
		{boolean enthaelt = false;
			ListenElement aktuellePos= anfang;
			while (aktuellePos != null && enthaelt == false) {
				if (aktuellePos.getThema() == thema) {
					enthaelt = true;
				}
				aktuellePos = aktuellePos.getNext();
			}
			return enthaelt;
		}
	public boolean hinzufuegen(String thema) {
		boolean erfolgreich = false;
			ListenElement pos = new ListenElement(thema);
			pos.setNext(anfang);
			anfang = pos;
			erfolgreich = true;
			groesse++;
			return erfolgreich;
	}


	public boolean entfernen(String thema) {
		boolean erfolgreich = false;
		if (beinhaltet(thema) && this.getGroesse() != 0) {

			ListenElement aktuellepos = anfang;
			ListenElement vorherigepos = null;

			while (aktuellepos != null && 
					!aktuellepos.getThema().equals(thema)) {
				vorherigepos = aktuellepos;
				aktuellepos = aktuellepos.getNext();
			}
			if (vorherigepos != null) {
				vorherigepos.setNext(aktuellepos.getNext());
			} else {
				anfang = anfang.getNext();
			}
			erfolgreich = true;
			groesse--;
		}

		return erfolgreich;
	}

	public int getGroesse() {
		return groesse;
	}


	/**
	 * Methode zur Rueckgabe aller Themen in einem Array
	 * 
	 * @return Alle Themen in einen Array gespeichert
	 */
	public String[] getThemen() {
		String[] themen = new String[getGroesse()];
		ListenElement aktuellePos = anfang;
		for (int i = 0; i < getGroesse(); i++) {
			themen[i] = aktuellePos.getThema();
			aktuellePos = aktuellePos.getNext();
		}
		return themen;
	}

	
	}
