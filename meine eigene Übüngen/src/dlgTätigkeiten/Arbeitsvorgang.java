package dlgTätigkeiten;

public class Arbeitsvorgang 
	{int art;
	long startzeitpunkt,
		 endzeitpunkt;
	private int dauer;
	public  Arbeitsvorgang(int art , long startzeitpunkt, long endzeitpunkt)
		{this.art = art;
		this.startzeitpunkt = startzeitpunkt;
		this.endzeitpunkt = endzeitpunkt;
		}
	public int getDauer()
	{dauer = (int)((this.endzeitpunkt - this.startzeitpunkt)/1000l);
	return dauer;
	}
	
	public int getArt() {
		return art;
	}
	public void setArt(int art) {
		this.art = art;
	}
	public long getStartzeitpunkt() {
		return startzeitpunkt;
	}
	public void setStartzeitpunkt(long startzeitpunkt) {
		this.startzeitpunkt = startzeitpunkt;
	}
	public long getEndzeitpunkt() {
		return endzeitpunkt;
	}
	public void setEndzeitpunkt(long endzeitpunkt) {
		this.endzeitpunkt = endzeitpunkt/1000l;
	}
	
	
	}
