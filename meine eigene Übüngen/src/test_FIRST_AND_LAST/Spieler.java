package test_FIRST_AND_LAST;

public class Spieler 
{private String name;
private Spieler next;

public Spieler(String name) {
	this.name = name;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public Spieler getNext() {
	return next;
}

public void setNext(Spieler next) {
	this.next = next;
}


}
