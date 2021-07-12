package generalisierung_Training;

public class Fkt_Sortable_person implements FktInterface_Sortable<Person>{
	
	public boolean isVorgaenger(Person ss_person1, Person ss_person2) {
		boolean ss_isVorgaenger = true;
		if(ss_person1.name.compareTo(ss_person2.name)>0) {
			ss_isVorgaenger = false;
		}
		return ss_isVorgaenger;
	}
	


}
