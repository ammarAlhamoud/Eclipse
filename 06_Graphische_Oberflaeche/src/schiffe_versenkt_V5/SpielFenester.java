package schiffe_versenkt_V5;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class SpielFenester extends Frame
	{public static JPanel schiffsFeld;
	public SpielFenester(String Title, int ss_zeilen, int ss_spalten) 
		{super(Title);
		this.setSize(850,600);
		
		
		
		JLabel lbl_spieleranzahl_anfrage = new JLabel("Wie viel Spieler?");
		
		JPanel spieleranzahl = new JPanel();
		spieleranzahl.setLayout(new GridLayout(3,3,10,10));
		spieleranzahl.setBorder(BorderFactory.createTitledBorder("Spieleranzahl"));
		spieleranzahl.add(lbl_spieleranzahl_anfrage);
		spieleranzahl.add(new Spieleranzahl_Panel());
		spieleranzahl.add(Spieleranzahl_Panel.lbl_spieleranzahl);
		
		JLabel lbl_schiffeanzahl_anfrage = new JLabel("Wie viel Schiffe?");
		
		JPanel schiffeanzahl = new JPanel();
		schiffeanzahl.setLayout(new GridLayout(3,3,10,10));
		schiffeanzahl.setBorder(BorderFactory.createTitledBorder("Schiffeanzahl"));
		schiffeanzahl.add(lbl_schiffeanzahl_anfrage);
		schiffeanzahl.add(new Schiffeanzahl_Panel());
		schiffeanzahl.add(Schiffeanzahl_Panel.lbl_schiffeanzahl);
		
		schiffsFeld = new JPanel();
		schiffsFeld.setBackground(Color.gray);
		schiffsFeld.setLayout(new GridLayout(1, 1, 10, 10));
		schiffsFeld.setBorder(BorderFactory.createTitledBorder("Schiffsfeld"));
		schiffsFeld.setBounds(100, 50, 500, 500);
		schiffsFeld.add(new SchiffeField_Panal(ss_zeilen, ss_spalten));
		
		JPanel einstellung_bestaetige = new JPanel();
		einstellung_bestaetige.setLayout(new GridLayout(2,1,10,10));
		einstellung_bestaetige.setBorder(BorderFactory.createTitledBorder("Bestätigung"));
		einstellung_bestaetige.add(new Bestaetigung_Panel());
		
		JPanel einstellung_panel = new JPanel();
		einstellung_panel.setLayout(new GridLayout(3,1,10,10));
		einstellung_panel.setBorder(BorderFactory.createTitledBorder("Einstellungen"));
		einstellung_panel.add(spieleranzahl);
		einstellung_panel.add(schiffeanzahl);
		einstellung_panel.add(einstellung_bestaetige);

		this.setLayout(new BorderLayout(5, 5));
		this.add(schiffsFeld , BorderLayout.CENTER);
		this.add(einstellung_panel, BorderLayout.WEST);
		addWindowListener(new WindowAdapter() 
			{public void windowClosing(WindowEvent event)
				{System.exit(0);
				}
			});
		this.setVisible(true);
		}
	
	}
