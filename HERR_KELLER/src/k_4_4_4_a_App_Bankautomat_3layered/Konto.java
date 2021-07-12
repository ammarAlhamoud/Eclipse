package k_4_4_4_a_App_Bankautomat_3layered;

public class Konto
{private int    nr;
 private double stand;

 public Konto(int ss_nr, double ss_stand)
        {stand = ss_stand;
         nr = ss_nr;
        }
 public void verbuchen(double ss_Betrag)
         {stand += ss_Betrag;
         }
 public int get_Nr()
               {return nr;};
 public double get_Stand()
                {return stand;}
 public void set_Stand(double ss_st)
 	{stand = ss_st;}
}
