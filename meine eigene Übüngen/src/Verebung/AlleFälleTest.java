package Verebung;

public class AlleFälleTest {
public static void main(String[] args)
	{//Fall1
	Unter u = new Unter();
	u.print();
	//Fall2
	Unter u1 = new Unter();
	// u1.printFremd(); Fehler
	
	//Fall3
	Fremd f = new Fremd();
	f.print();
	//fall4
	// Unter u2 = new Ober(); Fehler
	//Fall5
	Ober o1 = new Unter();
	o1.print();
	System.out.println(o1.a);
	//Fall6
	Ober o2 = new Basis();
	o2.print();
	//Fall7
	Fremd f1 = new Basis();
	f1.print();
	
	}
}
