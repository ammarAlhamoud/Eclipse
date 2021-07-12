package generalisierung_Training;

public class Test {


	public static void main(String[] args)
	{Person[] t_person = new Person[10];
	for(int i = 0;i<10;i++) {
		char a = (char)(Math.random()*60+40);
		String w_name = String.valueOf(a);
		Person w_person = new Person(w_name);
		t_person[i] = w_person;
	}
	System.out.println("**** bevor Sortierung ******");
	for(int i = 0;i<10;i++) {
		System.out.print(t_person[i].name +"  " );
	}
	
	Sortierautomat<Person> sortiere_person = new Sortierautomat<Person>();
	Comparator<Person> ss_Person_Name_comperator = new Person_Name_comperator();
	sortiere_person.sort(t_person, ss_Person_Name_comperator);
	System.out.println("\n**** Nach Sortierung ******");
	for(int i = 0;i<10;i++) {
		System.out.print(t_person[i].name +"  " );
	}
	
	
	/*Person_Name_comperator meinComperator = new Person_Name_comperator();
	
	int erg = meinComperator.compare(p2, p1);
	System.out.println("Ergebnis des Vergleich: " + erg);*/
	
	/*Comparator<Person> personCompar = (ss_p1,ss_p2) ->(ss_p1.name.compareTo(ss_p2.name));
	System.out.println("Ergebnis von Lymda:" + personCompar.compare(p1, p2));
	
	Comparator<Integer> meinInteger = (inchWert, cmWert) -> (int)(inchWert*2.54)-cmWert;
	System.out.println("Ergebnis Werten: " + meinInteger.compare(1, 4));*/
	}
}
