package k_4_4_4_1_Notizbuch;

import java.io.File;

public class Dlg_Notizbuch
   {	public static void main(String[] args) 
	  {new File("Notizbuch.txt").delete();
	   execute_testSuite1();
	   execute_testSuite2();
	  }
	
	public static void execute_testSuite1()
	  {//Erstamliges Anlegen,Bearbeiten und Speichern von Notizen 
		
		//Testfall 1: Notizen in ein leeres Notizbuch einfügen
		 Notizbuch notizbuch=new Notizbuch();
		notizbuch.create_Notiz("09-05-2016eine<u>Funktion</u>ist");
		notizbuch.create_Notiz("10-05-2016t:10Vorratsprüfung Keller <u>Chianti</u> ");
		notizbuch.create_Notiz("10-05-2016t:25Einkaufen<u>Chianti</u>");
		
		//Testfall 2: Anzeigen von speziellen Notizen
		System.out.println("");
		System.out.println("Testfall 2: Anzeigen von speziellen Notizen");
		System.out.println(notizbuch.get_Inhalt_vonNotiz(0));
		System.out.println(notizbuch.get_Inhalt_vonNotiz(1));
		System.out.println(notizbuch.get_Inhalt_vonNotiz(2));
				
		
		//Testfall 3: an einer bestehenden Notiz 
		//           eine Änderungsaktion durchführen
		System.out.println("");
		System.out.println("Testfall 3: Änderungsaktion durchführen");
		notizbuch.text_einfügen(0, " eine <u>Methode</u>", 32);
		System.out.println(notizbuch.get_Inhalt_vonNotiz(0));
		
		
		//Testfall 4: an einer bestehenden Notiz  
		//           eine Verkürzungssaktion durchführen
		System.out.println("");
		System.out.println("Testfall 4: Verkürzungssaktion durchführen");
		notizbuch.text_reduzieren(1, "Keller");
		System.out.println(notizbuch.get_Inhalt_vonNotiz(1));	
		
		//Testfall 5: an einer bestehenden Notiz  
		//           eine RedoAktion durchführen
		System.out.println("");
		System.out.println("Testfall 5: RedoAktion durchführen");
		notizbuch.redo_Action_bei_Notiz(1);
		System.out.println(notizbuch.get_Inhalt_vonNotiz(1));
		
				
		//Testfall 6: an einer bestehenden Notiz  
		//           eine Löschsaktion durchführen
		System.out.println("");
		System.out.println("Testfall 6: eine Löschsaktion durchführen");
		notizbuch.create_Notiz("10-05-2016t:25Schlafen");
		System.out.println(notizbuch.get_Inhalt_vonNotiz(3));		
		notizbuch.text_loeschen(3);
		System.out.println("nach Löschung:"+notizbuch.get_Inhalt_vonNotiz(3));	
		//Eliminierungder Notiz noch nicht vorgesehen

		//Testfall 7: alle wichtige Textstellen einer Notiz liefern
				System.out.println("");
				System.out.println("Testfall 7: alle wichtige Textstellen einer Notiz liefern");
						String[] wichtig = notizbuch.get_wichtigeTextstellen_vonNotiz(0);
						
						for(int j =0; j< wichtig.length; j++){
							System.out.println(wichtig[j]);
						}
						
					
				//Testfall 8: alle Notizen mit vorgegebenem wichtigem Text liefern
				System.out.println("");
				System.out.println("Testfall 8: alle Notizen mit vorgegebenem wichtigem Text liefern");
						int[] t_Id = notizbuch.get_NotizIDs_mit_wichtigemText("Chianti");
						for(int i=0; i< t_Id.length; i++){
							System.out.println(notizbuch.get_Inhalt_vonNotiz(t_Id[i]));
						}
				
				
				//Testfall 9: Notizen speichern
				System.out.println("");
				System.out.println("Testfall 8: Notizen speichern");
				notizbuch.speichere_Notizen();
				//Refresh in Eclipse und Dateiinhalt anschauen
				}

			
			public static void execute_testSuite2()
			  {//Laden eines gespeicherten Notizbuchs und anlegen von zusätzlichen Notizen 
				
				//Testfall 10: Notizen speichern
				System.out.println("-----------------------------------------------------------------");
				System.out.println("//Laden e. gespeicherten Notizbuchs, anlegen von zusätzl.Notizen //");
				System.out.println("Testfall 10: Notizen laden");
				 Notizbuch notizbuch=new Notizbuch();    //neuer Archivator wird eingerichtet
						                                 //Sätze werden geladen  
						System.out.println(notizbuch.get_Inhalt_vonNotiz(0));
						System.out.println(notizbuch.get_Inhalt_vonNotiz(1));
						System.out.println(notizbuch.get_Inhalt_vonNotiz(2));
						
				//Testfall 11: letzte Notiz eliminieren
				 System.out.println("");			
				 System.out.println("11: letzte Notiz eliminieren");
				 System.out.println("Anzahl Notizen vor Löschen: " +  notizbuch.get_Size() );
				 notizbuch.loesche_Notiz(3); 
				 System.out.println("Anzahl Notizen nach Löschen: " +  notizbuch.get_Size() );
						
				//Testfall 12: zusätzliche Notiz anlegen
				 System.out.println("");			
				 System.out.println("Testfall 12: zusätzliche Notiz anlegen");
				 notizbuch.create_Notiz("11-05-2016t:25Bestellen<u>Chianti</u>");
				 
				 String[] t_Notiz = notizbuch.get_alleNotizen();
				 for (int z = 0; z < t_Notiz.length; z++)
				      System.out.println(t_Notiz[z] );
				 // Nummer 3 darf nicht mehr vergeben werdem
			
			  }		
		}


