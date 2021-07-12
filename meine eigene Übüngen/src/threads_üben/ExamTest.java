package threads_üben;

import java.util.Scanner;

public class ExamTest {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		ExamTimer et = new ExamTimer();
		int zahl1, zahl2, antwort, z_richtig = 0, z_falsch = 0, z_fragen = 0;
		et.start();
		System.out.println("------------------Quiz---------------");
		while(et.isAlive()) {
			zahl1 = (int)(Math.random()*10);
			zahl2 = (int)(Math.random()*10);
			System.out.print(zahl1 + " + " + zahl2 +" = ");
			antwort = s.nextInt();
			if(antwort == zahl1 + zahl2) {
				z_richtig++;
			}else {
				z_falsch++;
			}
			z_fragen++;
		}
		System.out.println("-------Ergebnis--------");
		System.out.println("Fragenanzahl: \t" + z_fragen);
		System.out.println("Richtige Fragenanzahl: \t"+ z_richtig);
		System.out.println("Falsche Fragenanzahl: \t" + z_falsch);
		
	}

}
