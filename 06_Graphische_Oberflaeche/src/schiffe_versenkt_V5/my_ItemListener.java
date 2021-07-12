package schiffe_versenkt_V5;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JRadioButton;

public class my_ItemListener implements ItemListener, ActionListener {
	public static int z_Spieler = 1;
	public static int z_Schiffe = 5;
	public static int x_SchiffeFeld = 5;
	public static int y_SchiffeFeld = 5;
	public SchiffeField_Panal neu_SchiffsFeld;
	@Override
	public void itemStateChanged(ItemEvent ss_itemlistener) {
		if(ss_itemlistener.getSource() instanceof JRadioButton ) 
			{if(Spieleranzahl_Panel.solo.isSelected())
				{Spieleranzahl_Panel.lbl_spieleranzahl.setText("Solo");	
				z_Spieler = 1;
				}
			else if(Spieleranzahl_Panel.zweie.isSelected())
				{Spieleranzahl_Panel.lbl_spieleranzahl.setText("Zwei Spieler");	
				z_Spieler = 2;
				}
			else if(Spieleranzahl_Panel.drei.isSelected())
				{Spieleranzahl_Panel.lbl_spieleranzahl.setText("Drei Spieler");	
				z_Spieler = 3;
				}
			
			//einstellung für Schiffeanzahl
			if(Schiffeanzahl_Panel.easy.isSelected())
				{Schiffeanzahl_Panel.lbl_schiffeanzahl.setText("easy");	
				z_Schiffe = 5;
				x_SchiffeFeld = 5;
				y_SchiffeFeld = 5;
				}
			else if(Schiffeanzahl_Panel.hard.isSelected())
				{Schiffeanzahl_Panel.lbl_schiffeanzahl.setText("hard");	
				z_Schiffe = 8;
				x_SchiffeFeld = 8;
				y_SchiffeFeld = 8;
				}
			else if(Schiffeanzahl_Panel.veryHard.isSelected())
				{Schiffeanzahl_Panel.lbl_schiffeanzahl.setText("very hard");	
				z_Schiffe = 12;
				x_SchiffeFeld = 12;
				y_SchiffeFeld = 12;
				}
				
			}
		
	}
	@Override
	public void actionPerformed(ActionEvent ss_button) 
		{neu_SchiffsFeld = new SchiffeField_Panal(x_SchiffeFeld, y_SchiffeFeld);
		SpielFenester.schiffsFeld.removeAll();
		SpielFenester.schiffsFeld.add(neu_SchiffsFeld);
		//Spielverwalter w_spielverwalter = new Spielverwalter(z_Spieler,z_Schiffe,
		//		x_SchiffeFeld, x_SchiffeFeld );
			
		}

}
