package ÜbungenV2;

public class ListeTest {

	public static void main(String[] args) {
		System.out.println("L:");
		Liste L = new Liste(5, Liste.VOLL);
		L.rekursivAlleAusgeben();
		
		System.out.println("L2:");
		Liste L2 = new Liste(100);
		L2.alleausgeben();
		
		System.out.println("L3:");
		Liste L3 = new Liste(4, Liste.LEER);
		L3.alleausgeben();
		
		System.out.println("L4:");
		System.out.println(Liste.listeErzeugen(2).verweis.verweis.inhalt);// Null
		
		

	}

}
