package dlgBankautomat;

public class DlgBankautomat {

	public static void main(String[] args) {
		FestKonto meinFestKonto = new FestKonto(1,1000,30,5.0);
		Konto[] t_konto = new Konto[2];
		t_konto[0] = new GiroKonto(2,2000,20.000,40.000,7.0);
		t_konto[1] = new GiroKonto(2,2000,20.000,40.000,7.0);
		
		System.out.println("********* endlos 15 **********");
		int max_Zeinlenlaenge = 15;
		EndlosDrucker meinEndlosDrucker = new EndlosDrucker(max_Zeinlenlaenge);
		meinEndlosDrucker.drucke(meinFestKonto);
		meinEndlosDrucker.drucke((Druckbar)t_konto[1]);
		
		System.out.println("********* endlos 10 **********");
		max_Zeinlenlaenge = 10;
		meinEndlosDrucker.set_max_zeilenlaenge(max_Zeinlenlaenge);
		meinEndlosDrucker.drucke(meinFestKonto);
		
		System.out.println("********* GiroKonten bearbeiten **********");
		System.out.println("***** Giro-Seiten *****");
		SeitenDrucker meinSeitenDrucker = new SeitenDrucker(max_Zeinlenlaenge);
		
		for(int i=0; i<2;i++) {
			meinSeitenDrucker.drucke((ImSeitenformat_Druckbar)t_konto[i]);
			
		}
		
		System.out.println("***** Giro-Endlos *****");
		meinSeitenDrucker.drucke((Druckbar)t_konto[1]);
		
		

		
	}

}
