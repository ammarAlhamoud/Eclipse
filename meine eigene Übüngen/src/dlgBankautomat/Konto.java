package dlgBankautomat;

public abstract class Konto {
	private static int lfdNr = 0;
	protected int nr;
	protected double stand;
	
	public abstract String get_Druckinhalt();
	
	public static int get_lfdNr() {
		return lfdNr;
	}
	
	public static void inkrement_lfdNr() {
		lfdNr++;
	}
	
	public Konto(int ss_nr, double ss_stand) {
		this.stand = ss_stand;
		this.nr = ss_nr;
	}

	public void verbuchen(double ss_betrag) {
		stand += ss_betrag;
	}
	public int get_nr() {
		return nr;
	}
	
	public double get_stand() {
		return stand;
	}
}
