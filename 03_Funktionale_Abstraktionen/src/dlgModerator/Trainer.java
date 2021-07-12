package dlgModerator;

public interface Trainer 
	{public String get_Frage(int ss_Fragenr);
	public boolean is_richtigeAntwort_auf_Frage(int ss_Fragenr,
			String ss_antwort);
	}
