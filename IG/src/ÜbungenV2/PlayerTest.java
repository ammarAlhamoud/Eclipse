package ÜbungenV2;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class PlayerTest {

	public static void main(String[] args) {
		PlayerVerwalter PW = new PlayerVerwalter();
		String name;
		int id;
		int anfrage;
		BufferedReader eingabe = new BufferedReader(new InputStreamReader(System.in));
		try {do {System.out.print("Name: ");
				name = eingabe.readLine();
				System.out.print("ID: ");
				eingabe = new BufferedReader(new InputStreamReader(System.in));
				id = Integer.parseInt(eingabe.readLine());
				PW.add(name, id);
				System.out.print("noch einen Player? (0: NO, sonst:yes): ");
				eingabe = new BufferedReader(new InputStreamReader(System.in));
				anfrage = Integer.parseInt(eingabe.readLine());
				}while(anfrage!=0);
		}catch(Exception e) {
				}
		
		System.out.println("Ausgabe aller Players:");
		PW.allePlayer_ausgeben();
		}
}
