package schiffe_versenkt_V5;

import java.awt.Panel;

import javax.swing.JButton;

public class Bestaetigung_Panel extends Panel  
	{public JButton bestaetigen;
	public JButton zuruekSetzen;
	public Bestaetigung_Panel() 
		{bestaetigen = new  JButton("Play");
		add(bestaetigen);
		bestaetigen.addActionListener(new  my_ItemListener()) ;
			
		zuruekSetzen = new  JButton("Default");
		add(zuruekSetzen);
		zuruekSetzen.addActionListener(new  my_ItemListener())	;
		}
	
	}
