package schiffe_versenkt_V5;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.Panel;

import javax.swing.ButtonGroup;
import javax.swing.JLabel;
import javax.swing.JRadioButton;

public class Schiffeanzahl_Panel extends Panel  
	{public ButtonGroup schiffeanzahl_group ; 
	public static JRadioButton easy ; 
	public static JRadioButton hard; 
	public static JRadioButton veryHard; 
	public static JLabel lbl_schiffeanzahl; 
	public Schiffeanzahl_Panel() 
		{schiffeanzahl_group = new ButtonGroup(); 
		easy = new JRadioButton("easy"); 
		easy.setSelected(true);
		hard = new JRadioButton("hard"); 
		veryHard = new JRadioButton("very hard"); 
		schiffeanzahl_group.add(easy);   
		easy.addItemListener(new my_ItemListener());
		schiffeanzahl_group.add(hard);   
		hard.addItemListener(new my_ItemListener());
		schiffeanzahl_group.add(veryHard); 	
		veryHard.addItemListener(new my_ItemListener());
		setLayout(new GridLayout(1, 3, 20, 20));
		add(easy);
		add(hard);
		add(veryHard);
		
		lbl_schiffeanzahl = new JLabel("easy");
		lbl_schiffeanzahl.setForeground(Color.darkGray);
		}   
	
	}
