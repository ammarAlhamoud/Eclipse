package dlgBankautomat;

public class EndlosDrucker {
	
	protected int max_zeilenlaenge;
	
	public void drucke(Druckbar ss_druckbar) {
		String druckzeile = null;
		String zuDruckendeZeichen = ss_druckbar.get_Druckinhalt();
		while(zuDruckendeZeichen!=null) {
			if(zuDruckendeZeichen.length()>max_zeilenlaenge) {
				druckzeile = zuDruckendeZeichen.substring(0, max_zeilenlaenge);
				System.out.println(druckzeile);
				zuDruckendeZeichen = zuDruckendeZeichen.substring(max_zeilenlaenge);
			}
			else {
				druckzeile = zuDruckendeZeichen;
				System.out.println(druckzeile);
				zuDruckendeZeichen = null;
			}
		}
	}

	public EndlosDrucker(int ss_max_zeilenlaenge) {
		max_zeilenlaenge = ss_max_zeilenlaenge;
	}
	
	public void set_max_zeilenlaenge(int ss_max_zeilenlaenge) {
		max_zeilenlaenge = ss_max_zeilenlaenge;
	}
	
	

}
