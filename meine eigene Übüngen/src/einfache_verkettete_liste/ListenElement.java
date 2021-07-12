package einfache_verkettete_liste;

public class ListenElement 
	{private String thema;
	private ListenElement next;
	
	public ListenElement(String thema) {
		this.thema = thema;
	}

	public String getThema() {
		return thema;
	}

	public ListenElement getNext() {
		return next;
	}

	public void setNext(ListenElement next) {
		this.next = next;
	}
	}
