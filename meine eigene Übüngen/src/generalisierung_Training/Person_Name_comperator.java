package generalisierung_Training;

public class Person_Name_comperator extends Comparator<Person> {
	public int compare(Person ss_p1, Person ss_p2) {
		int erg ;
		erg = ss_p1.name.compareTo(ss_p2.name);
		return erg;
	}

}
