package k_4_4_4_1_Notizbuch;

public class Fliesstext {
	private StringBuffer text;
	private Fliesstext previous_Version;
	
	public StringBuffer get_Text() {
		return text;
	}
	public Fliesstext getPrevious_Version() {
		return previous_Version;
	}
	
	public Fliesstext (String ss_Inhalt){
		text = new StringBuffer(ss_Inhalt);
	}
	public void setPrevious_Version(Fliesstext previous) {
		this.previous_Version = previous;
	}
}



