package listen;

public class BeispielTest {

	public static void main(String[] args) {
		Beispiel1	B1 = new Beispiel1();
		Beispiel2	B2 = new Beispiel2();
		B1.inhalt1 = 42;
		B2.inhalt2 = 23;
		B2.Verweis = B1;
		System.out.println("Beispiel1: " + B1);//adresse von B1
		System.out.println("\tB1.inhalt1 = " + B1.inhalt1);//42
		System.out.println("Beispiel2: " + B2);//adresse von B2
		System.out.println("\tB2.inhalt2 = " + B2.inhalt2);//23
		System.out.println("\tB2.Verweis = " + B2.Verweis);//adresse von B1
		System.out.println("\tB2.Verweis.inhalt1 = " + B2.Verweis.inhalt1);// 42
	}

}
