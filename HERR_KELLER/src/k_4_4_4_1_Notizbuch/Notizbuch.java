package k_4_4_4_1_Notizbuch;

import java.text.DecimalFormat;
import java.util.ArrayList;

public class Notizbuch {
	private int lfd_NotizId = 0;
	private ArrayList<Notiz> al_Notiz; 
	private Archivar archivar;
	
	public Notizbuch(){
		al_Notiz = new ArrayList<Notiz>();
		archivar = new Archivar();
		lade_Notizen();
	}
	
	public int get_Size() {return al_Notiz.size(); }
	
	public String get_Inhalt_vonNotiz(int ss_ID)
	   {return al_Notiz.get(ss_ID).get_Text();
	   }
	
	public String[] get_alleNotizen()
	   {String[] ss_t_alleNotizen = new String[al_Notiz.size()];
	
	    int z = 0;
	    for (Notiz i_Notiz: al_Notiz)
                      {ss_t_alleNotizen[z] = "" + i_Notiz.get_Id() + "\t"  + i_Notiz.get_Text();
	        z++;
                      }
	    return ss_t_alleNotizen;
                  }
	 
		public void text_einfügen(int ss_ID, String ss_Text, int ss_Position){
		Notiz notiz = al_Notiz.get(ss_ID);
		notiz.text_einfügen(ss_Position, ss_Text);	
	}
	public void text_reduzieren(int ss_ID, String ss_Text){
		Notiz notiz = al_Notiz.get(ss_ID);
		notiz.text_reduzieren(ss_Text);;	
		}
	public void text_loeschen(int ss_ID){
		Notiz notiz = al_Notiz.get(ss_ID);
		notiz.text_loeschen();	
	}
	
	public void loesche_Notiz(int ss_ID)
	   {Notiz notiz = get_Notiz(ss_ID);
	    al_Notiz.remove(notiz);
	   }
	
	public String[] get_wichtigeTextstellen_vonNotiz(int ss_ID)
	  {	String[] ss_wichtigeTextstellen;
		Notiz notiz = get_Notiz(ss_ID);
		ss_wichtigeTextstellen = notiz.get_wichtigenText();
		return ss_wichtigeTextstellen;
	  }
	
	public int[] get_NotizIDs_mit_wichtigemText(String ss_Text)
	  {// Anzahl passender wichtiger-Textstellen ermitteln  
		ss_Text="<u>"+ss_Text+"</u>";
	 
		Notiz notiz;
		String[] t_wichtige_textstellen;
		int[]    ss_t_IDs;
		int      z_gefundene_Textstellen = 0;
		
		for (Notiz i_Notiz: al_Notiz)
	                   {t_wichtige_textstellen = i_Notiz.get_wichtigenText();
	                     for(int i=0; i<= t_wichtige_textstellen.length-1; i++)
	                          {if(t_wichtige_textstellen[i].equals(ss_Text))
	                              {z_gefundene_Textstellen++;
			     }
	                          }
	                    }
		
	          // passende wichtige-Textstellen in array zusammenstellen 
		ss_t_IDs = new int[z_gefundene_Textstellen];
		int z_passend = 0;
		for (Notiz i_Notiz: al_Notiz)
	                   {t_wichtige_textstellen = i_Notiz.get_wichtigenText();
	                     for(int z_wichtig=0;z_wichtig<=t_wichtige_textstellen.length-1; z_wichtig++ )			
		               {if(t_wichtige_textstellen[z_wichtig].equals(ss_Text))
		                     {ss_t_IDs[z_passend] = i_Notiz.get_Id();
			          z_passend++; 
			        }
	     	               }
	                      }
		return ss_t_IDs;
		}
		
	public void redo_Action_bei_Notiz(int ss_ID)
	  {Notiz notiz = get_Notiz(ss_ID);
	   notiz.redo_Action();	
	}
	
	public void create_Notiz(String ss_Text){
		Notiz neueNotiz=new Notiz(ss_Text, lfd_NotizId);
		lfd_NotizId++;
		al_Notiz.add(neueNotiz);
	}

	public void speichere_Notizen()
	  {String[] t_str_Notiz = new String[al_Notiz.size()+1];
	        //lfd_NotizId benötigt auch einen Tabellenplatz
	  t_str_Notiz[0] = ""+ lfd_NotizId;  //Sicherung der Nummernfolge
	  
	  int z_Satz = 1;
	  for (Notiz i_Notiz: al_Notiz)
	      {int id = i_Notiz.get_Id();
	       //anstatt delimiter ein festes Zahlenformat:
	       //DecimalFormat df = new DecimalFormat("00000");
	      //df.format(id)
	      	       
		   t_str_Notiz[z_Satz] = "" + id + "\t"  + i_Notiz.get_Text();
		   z_Satz++;
	      }
	 			
		archivar.speichere_Saetze(t_str_Notiz);
	}//end speichern
	
	
	
	
	private void lade_Notizen()
	  {	String[] t_Attribut;
		ArrayList<String> al_str_Notiz;
		Notiz geladeneNotiz = null;
		String geladenerText = null;
		
		al_str_Notiz = archivar.lade_Saetze();
		
		if(al_str_Notiz != null)  //beim ersten Lauf ist Datei leer
		  {lfd_NotizId = Integer.parseInt(al_str_Notiz.get(0)); 
			for (int i = 1; i < al_str_Notiz.size(); i++)
		    {
			 t_Attribut = al_str_Notiz.get(i).split("\t");
			 if (t_Attribut.length == 1)
			    {geladenerText = "";}
			 else
			     {geladenerText = t_Attribut[1];} 
			 geladeneNotiz = new Notiz(geladenerText,Integer.parseInt(t_Attribut[0]));
			 al_Notiz.add(geladeneNotiz);
			 }
		  }
		}//end laden
		
	   private Notiz get_Notiz(int ss_ID) 
		   {Notiz ss_Notiz  = null;
			for (Notiz i_Notiz: al_Notiz)
			    {if (i_Notiz.get_Id() == ss_ID)
			        {ss_Notiz= i_Notiz;}
			    }
			return ss_Notiz;
		   }
}























































