package dlgBankschalter;

public class FaelligkeitsdarlehensCalculator implements Tilgungsplaner
{public double get_Sum_Zinsen(double ss_Darlehen, double ss_Leihdauer, double ss_Nominalzins)
	{return ss_Darlehen*ss_Nominalzins*ss_Leihdauer;
	}
public double get_Sum_Mittelabfluss(double ss_Darlehen, double ss_Leihdauer, double ss_Nominalzins)
	{return (ss_Darlehen + get_Sum_Zinsen( ss_Darlehen,  ss_Leihdauer,  ss_Nominalzins));	
	}
public double get_Tilgung(double ss_Darlehen, double ss_Leihdauer, double ss_Nominalzins,
		int ss_z_abgelaufenenJahre)
	{double ss_Tilgung = 0;
		if(ss_z_abgelaufenenJahre == ss_Leihdauer)
			{ss_Tilgung = ss_Darlehen;
			}
		return ss_Tilgung;
	}
public double get_faelligeZinsen_im_jahr(double ss_Darlehen, double ss_Leihdauer, double ss_Nominalzins, 
		int ss_z_abgelaufenenJahre)
	{return ss_Darlehen*ss_Nominalzins;
	}
public double get_faelligeTilgung_im_Jahr(double ss_Darlehen, double ss_Leihdauer, double ss_Nominalzins,
		int ss_z_abgelaufenenJahre)
	{return ss_Darlehen;
	}
public double get_faelligerMittelabfluss_im_Jahr(double ss_Darlehen, double ss_Leihdauer, double ss_Nominalzins,
		int ss_z_abgelaufenenJahre)
	{double ss_faelligerMittelabfluss_im_Jahr = get_faelligeZinsen_im_jahr( ss_Darlehen, ss_Leihdauer, ss_Nominalzins,
		 ss_z_abgelaufenenJahre);
	if (ss_z_abgelaufenenJahre == ss_Leihdauer)
		{ss_faelligerMittelabfluss_im_Jahr += ss_Darlehen;	
		}
	return ss_faelligerMittelabfluss_im_Jahr;	
	}
}
