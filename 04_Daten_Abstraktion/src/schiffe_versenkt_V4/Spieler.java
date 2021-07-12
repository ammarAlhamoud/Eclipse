package schiffe_versenkt_V4;

public abstract class Spieler{
	public String name;
	public int id,
			   z_treffer = 0,
			   bonus = 0;
	
	public Spieler(String ss_name, int ss_id) {
		this.name = ss_name;
		this.id = ss_id;
	}
	
	public abstract double spielerNote_berechne(int ss_schussErgebniss, boolean ss_is_spielende);
	
	public String getName() {
		return name;
	}
	public int getId() {
		return id;
	}
	public int getZ_treffer() {
		return z_treffer;
	}
	public int getBonus() {
		return bonus;
	}

}
