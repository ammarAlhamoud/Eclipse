package k_5_2_Schiffe_abstrakt;
public class Teil 
  {private int x;
   private int y;
   private boolean isGetroffen;
   
   public Teil(int ss_x, int ss_y)
     {x = ss_x;
      y = ss_y;
      isGetroffen = false;	   
     }
   
   public void setTreffer()
     {isGetroffen = true;}
   public int getX()
     {return x;}
   public int getY()
     {return y;}
   public boolean isGetroffen()
     {return isGetroffen;}
  }
