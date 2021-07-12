package Graphics_training;

import java.awt.BorderLayout;

import javax.swing.JFrame;

public class KurveGUI_Kontroll 
{	public JFrame window;
	public KurveGUI_Kontroll(String ss_Title)
		{window = new JFrame();
		window.setSize(900,700);
		window.setTitle(ss_Title);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setVisible(true);
		window.setLayout(new BorderLayout(1,1));
		}
	
	public JFrame getWindow() 
		{return window;
		}

	
}
