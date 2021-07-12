package ÜbungenV2;

public class RekursionTest {

	public static void main(String[] args) {
		Faktor F = new Faktor();
		Summe S =new Summe();
		Paskal P = new Paskal();
		System.out.println("Fakto von:");
		System.out.println("\t5 ist :" + F.faktor(5));
		System.out.println("\t3 ist :" + F.faktor(3));
		
		System.out.println("Die Summe von:");
		System.out.println("\t7 bis 1 = " + S.was(7));
		System.out.println("\t4 bis 1 = " + S.was(4));
		System.out.println("\t1 bis 1 = " + S.was(1));
		System.out.println("\t0 bis 1 = " + S.was(0));
		
		System.out.println("Paskal von:");
		System.out.println("\tp(0,0) ist: " + P.pas(0,0));
		System.out.println("\tp(1,1) ist: " + P.pas(1,1));
		System.out.println("\tp(1,0) ist: " + P.pas(1,0));
		System.out.println("\tp(5,0) ist: " + P.pas(5,0));
		System.out.println("\tp(5,1) ist: " + P.pas(5,1));
		System.out.println("\tp(5,5) ist: " + P.pas(5,5));
		System.out.println("\tp(5,3) ist: " + P.pas(5,3));
		System.out.println("\tp(5,2) ist: " + P.pas(5,2));

		System.out.println("Fac von:");
		System.out.println("\t5 ist :" + F.fac(5));
		System.out.println("\t3 ist :" + F.fac(3));
		System.out.println("\t1 ist :" + F.fac(1));
		System.out.println("\t0 ist :" + F.fac(0));
		
		System.out.println(S.sum(3));
		System.out.println(S.sum(4));
		System.out.println(S.sum(5));

	}
	
	
	
	
	

}
