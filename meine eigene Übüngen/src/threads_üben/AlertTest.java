package threads_üben;

import java.util.Scanner;

public class AlertTest {

	private static Scanner s;

	public static void main(String[] args) {
		s = new Scanner(System.in);
		int eingabe;
		Alert alert = new Alert();
		 System.out.println("----- Alert Menu ------\n"
                 +"\t| Enter (1) to Start  |\n"
                 +"\t| Enter (2) to Pause  |\n"
                 +"\t| Enter (3) to Resume |\n"
                 +"\t| Enter (4) to Stop   |\n"
                 +"-----------------------");
		 while(!alert.isInterrupted()) {
			 System.out.print("User input >> ");
	         eingabe = s.nextInt(); 
	         switch(eingabe) {
	         case 1: alert.start();break;
	         case 2: alert.suspend();break;
	         case 3: alert.resume();break;
	         case 4: alert.interrupt();
	         			alert.stop();
	         			break;
	         default: System.out.println("Option <"+eingabe+"> Not Found!");
	         			break;
	         }
		 }
	}

}
