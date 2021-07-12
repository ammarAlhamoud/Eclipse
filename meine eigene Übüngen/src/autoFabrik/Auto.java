package autoFabrik;

public class Auto 
{ private int nummer;
private String marke;
private double preis;
private String inhaber;

public int getNummer()
	{return nummer;	
	}
public void setNummer(int ss_nummer)
	{this.nummer = ss_nummer;
	}
public String getMarke() {
	return marke;
}
public void setMarke(String marke) {
	this.marke = marke;
}
public double getPreis() {
	return preis;
}
public void setPreis(double preis) {
	this.preis = preis;
}
public String getInhaber() {
	return inhaber;
}
public void setInhaber(String inhaber) {
	this.inhaber = inhaber;
}
public Auto (int ss_nummer, double ss_preis, String ss_inhaber, String ss_marke)
	{this.nummer = ss_nummer;
	this.preis = ss_preis;
	this.inhaber = ss_inhaber;
	this.marke = ss_marke;
	}
}
