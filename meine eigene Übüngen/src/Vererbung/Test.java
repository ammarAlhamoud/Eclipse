package Vererbung;

public class Test {

	public static void main(String[] args) {
		SuperKlasse A = new SuperKlasse();
		System.out.println("Objekt von Superklasse: \n");
		System.out.println("Zahl:\t "+ A.zahl);
		System.out.println("Text: \t"+ A.get_text());
		System.out.println(A.supertext());
		System.out.println("myZahl:\t"+A.myZahl0);
		System.out.println("myZahl:A.myZahl1 hier ist ung�ltig");
		System.out.println("_____________________________");
		
		System.out.println("Objekt von Subklasse: \n");
		Subklasse B = new Subklasse();
		System.out.println("Zahl:\t "+ B.zahl);
		System.out.println("Text: \t"+ B.get_text());
		System.out.println(B.supertext());
		System.out.println(B.subtext());
		System.out.println("myZahl1:\t"+B.myZahl0);
		System.out.println("myZahl1:\t"+B.myZahl1);
		System.out.println("_____________________________");
		
		System.out.println("Vererbung von Subklasse: ");
		System.out.println("SuperKlasse AB = new Subklasse() \t g�ltig \n");
		SuperKlasse AB = new Subklasse();
		System.out.println("Zahl:\t "+ AB.zahl);
		System.out.println("Text: \t"+ AB.get_text());
		System.out.println(AB.supertext());
		System.out.println("AB.subtext() hier ist ung�ltig");
		System.out.println("myZahl1:\t"+AB.myZahl0);
		System.out.println("myZahl1:\t AB.myZahl1" + " hier ist ung�ltig ");
		System.out.println("_____________________________");
		
		System.out.println("Vererbung von Superklasse: ");
		System.out.println("Subklasse BA = new Superklasse() \t ung�ltig\n");
	}

}
