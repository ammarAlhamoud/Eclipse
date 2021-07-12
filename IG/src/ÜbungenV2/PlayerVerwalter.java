package ÜbungenV2;

public class PlayerVerwalter {
	
	Player first;
	Player H;
	
	public void add(String ss_name, int ss_id) {
		if(first == null) {
			first = new Player();
			first.name = ss_name;
			first.id = ss_id;
			first.next = new Player();
			H = first.next;
		}else {
			H.name = ss_name;
			H.id = ss_id;
			H.next = new Player();
			H = H.next;
		}
	}
	
	public void allePlayer_ausgeben() {
		H = first;
		int i = 1;
		while(H.next != null) {
			System.out.println(i +". Name: " + H.name + "\tID: "+ H.id);
			H = H.next;
			i = i+1;
		}
	}

}
