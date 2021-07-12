package dlgBankautomat;

public class SeitenDrucker extends EndlosDrucker{
	
	public void drucke(ImSeitenformat_Druckbar ss_ImSeitenformat_Druckbar) {
		String[] druckseiteinhalt = ss_ImSeitenformat_Druckbar.get_Druckseiteninhalt();
		
		if(super.max_zeilenlaenge >= druckseiteinhalt.length ) {
			for(int i=0;i<druckseiteinhalt.length;i++) {
				System.out.println(druckseiteinhalt[i]);
			}
		}
		else {
			throw new IllegalArgumentException();
		}
		
		
	}

	public SeitenDrucker(int ss_max_zeilenlaenge) {
		super(ss_max_zeilenlaenge);
	}
	
	

}
