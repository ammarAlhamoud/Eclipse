package GUI_Übung;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;

public class UnserListener implements ActionListener{
	
	JLabel lbl;
	
	UnserListener(JLabel lbl){
		this.lbl = lbl;
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		lbl.setText("Button wurde angeklickt! ");
	}

}
