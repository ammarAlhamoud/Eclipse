
package k_3_4_Ratespiel;


public class Regie 
  {public static Trainer getTrainer()
  	 {int anzahlTrainer = 3;
	  Trainer ss_bereitgestellterTrainer= null;
  	  int trainernr;
  	  
  	  trainernr = (int)(Math.random()* 100) % anzahlTrainer;
  	  
  	  switch(trainernr)
  	     {case 0: ss_bereitgestellterTrainer = new EnglischTrainer();
  	              break;
  	      case 1: ss_bereitgestellterTrainer = new FranzoesischTrainer();
  	      		  break;
  	      case 2: ss_bereitgestellterTrainer = new MatheTrainer();
  		          break;	
  	     }
  	  return ss_bereitgestellterTrainer;
  	 }
	
  }
