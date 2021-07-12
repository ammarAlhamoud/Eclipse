package k_3_4_Ratespiel;


public interface Trainer 
  {public String get_Name();
   public String get_Frage(int ss_fragenr);
   public boolean is_richtige_Antwort_auf_Frage(int ss_fragenr, String ss_antwort);
  }
