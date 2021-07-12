package dlgBankschalter;

public interface Tilgungsplaner 
{public double get_Sum_Zinsen(double ss_Darlehen, double ss_Leihdauer, double ss_Nominalzins);
public double get_Sum_Mittelabfluss(double ss_Darlehen, double ss_Leihdauer, double ss_Nominalzins);
public double get_Tilgung(double ss_Darlehen, double ss_Leihdauer, double ss_Nominalzins, int ss_z_Jahre);
public double get_faelligeZinsen_im_jahr(double ss_Darlehen, double ss_Leihdauer, double ss_Nominalzins, 
		int ss_z_abgelaufenenJahre);
public double get_faelligeTilgung_im_Jahr(double ss_Darlehen, double ss_Leihdauer, double ss_Nominalzins,
		int ss_z_abgelaufenenJahre);
public double get_faelligerMittelabfluss_im_Jahr(double ss_Darlehen, double ss_Leihdauer, double ss_Nominalzins,
		int ss_z_abgelaufenenJahre);
}
