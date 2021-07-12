package schiffe_versenkt_V5;

import java.awt.Color;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ButtonGroup;
import javax.swing.JLabel;
import javax.swing.JRadioButton;

public class Spieleranzahl_Panel extends Panel 
	{public ButtonGroup spieleranzahl_group ; 
	public static JRadioButton solo ; 
	public static JRadioButton zweie; 
	public static JRadioButton drei; 
	public static JLabel lbl_spieleranzahl; 
	public Spieleranzahl_Panel() 
		{spieleranzahl_group = new ButtonGroup(); 
		solo = new JRadioButton("Solo"); 
		solo.setSelected(true);
		zweie = new JRadioButton("Multiplayer"); 
		drei = new JRadioButton("3 Player"); 
		spieleranzahl_group.add(solo);   
		solo.addItemListener(new my_ItemListener());
		spieleranzahl_group.add(zweie);   
		zweie.addItemListener(new my_ItemListener());
		spieleranzahl_group.add(drei); 	
		drei.addItemListener(new my_ItemListener());
		solo.setBounds(10, 10, 20, 15);
		zweie.setBounds(10, 10, 20, 15);
		drei.setBounds(10, 10, 20, 15);
		setLayout(new GridLayout(1, 3, 20, 20));
		add(solo);
		add(zweie);
		add(drei);
		
		lbl_spieleranzahl = new JLabel("Solo");
		lbl_spieleranzahl.setForeground(Color.darkGray);
		}   
	
	
		
	
	}
