package dlgBankautomat;

public class GiroKonto extends Konto implements ImSeitenformat_Druckbar {
	double kredit,kreditlimit,zins;
	
	public String get_Druckinhalt() {
		return "Nr:"+nr+"Stand"+ stand + "kredit" + kredit
				+ "Kreditlimt"+kreditlimit + "Zins" + zins;
	}
	
	public String[] get_Druckseiteninhalt() {
		String[] a = new String[5];
		a[0] = "Nr:"+nr;
		a[1] = "Stand: "+stand ;
		a[2] = "kredit: "+kredit;
		a[3] = "Kreditlimt: "+kreditlimit ;
		a[4] = "Zins: "+zins;
		
		return a;
	}
	
	public GiroKonto(int ss_nr, double ss_stand, double ss_kredit,
			double ss_kreditlimit, double ss_zins) {
		super(ss_nr,ss_stand);
		this.kredit = ss_kredit;
		this.kreditlimit = ss_kreditlimit;
		this.zins = ss_zins;
	}
	
	public void setZins(double ss_betrag) {
		zins = ss_betrag;
	}

}
