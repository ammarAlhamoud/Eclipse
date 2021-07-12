package k_4_4_4_1_Notizbuch;

public class Knoten {
	private Knoten next;
	private Notiz notiz;
	
	public Knoten(Notiz ss_notiz){
		notiz=ss_notiz;
		next = null;
	}

	public Knoten getNext() {
		return next;
	}

	public void setNext(Knoten next) {
		this.next = next;
	}

	public Notiz getNotiz() {
		return notiz;
	}
}

