package GUI_‹bung;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.JToggleButton;
import javax.swing.event.CaretEvent;
import javax.swing.event.CaretListener;

import java.awt.Button;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;


public class unserFrame extends JFrame{
	
	JLabel text;
	JButton button;
	JButton zeit;
	JPasswordField eingabe;
	JToggleButton felt;
	JPanel panel;
	JCheckBox kursiv;
	JCheckBox groﬂ;
	JPanel radioPanel;
	JRadioButton Kirsche;
	JRadioButton Kuchen;
	JRadioButton  Computer;
	ButtonGroup gruppe;
	
	public unserFrame() {
		setVisible(true);
		setSize(500, 400);
		setLocationRelativeTo(null);
		setLocation(500, 300);
		setTitle("Erste Fenester");
		setResizable(false);
		setLayout(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		
		text = new JLabel("Hello Welt");
		text.setBounds(70,50,500,50);
		Font schrift = (text.getFont().deriveFont(Font.PLAIN,28));
		text.setFont(schrift);
		text.setToolTipText("Das hier ist der Text");
		add(text);
		UnserListener ul = new UnserListener();
		button = new JButton("OK");
		button.setBounds(150,100,200,50);
		button.addActionListener(new UnserListener());
		button.setEnabled(false);
		button.setToolTipText("Setze den Text!");
		add(button);
		
		zeit = new JButton("Zeit");
		zeit.setBounds(250, 225, 100, 25);
		zeit.addActionListener(ul);
		add(zeit);
		
		eingabe = new JPasswordField();
		eingabe.setBounds(150,170,200,30);
		eingabe.addCaretListener(new SchreibkopfListener());
		eingabe.setToolTipText("hier kannst du Text eintragen!");
		add(eingabe);
		
		panel = new JPanel();
		panel.setLayout(null);
		panel.setBounds(150,170,150,200);
		add(panel);
		
		felt = new JToggleButton("Felt");
		felt.setBounds(0,50,75,20);
		felt.addItemListener(new fontListener());
		felt.setToolTipText("Bold Text");
		
		kursiv = new JCheckBox("kursiv");
		kursiv.setBounds(0,75,75,20);
		kursiv.addItemListener(new fontListener());

		
		groﬂ = new JCheckBox("groﬂ");
		groﬂ.setBounds(0,100,75,20);
		groﬂ.addItemListener(new fontListener());
		
		panel.add(felt);
		panel.add(kursiv);
		panel.add(groﬂ);
		
		radioPanel = new JPanel();
		radioPanel.setLayout(null);
		radioPanel.setBounds(50,210,100,120);
		add(radioPanel);
		
		Kirsche = new JRadioButton ("Kirsche");
		Kirsche.setBounds(0,0,100,25);
		Kirsche.addItemListener(new fontListener());
		radioPanel.add(Kirsche);
		
		Kuchen = new JRadioButton ("Kuchen");
		Kuchen.setBounds(0,30,100,25);
		Kuchen.addItemListener(new fontListener());
		radioPanel.add(Kuchen);
		
		Computer = new JRadioButton ("Computer");
		Computer.setBounds(0,60,100,25);
		Computer.addItemListener(new fontListener());
		radioPanel.add(Computer);
		
		gruppe = new ButtonGroup();
		gruppe.add(Kirsche);
		gruppe.add(Kuchen);
		gruppe.add(Computer);
		
	}
	private class UnserListener implements ActionListener{
		
		@Override
		public void actionPerformed(ActionEvent e) {
			if(e.getSource() == button) {
			text.setText(String.valueOf(eingabe.getPassword()));
			}else if (e.getSource()== zeit) {
			String zeit_text =String.valueOf(e.getWhen());
			text.setText(zeit_text);
			}
			
		}
	}
	
	private class SchreibkopfListener implements CaretListener{

		@Override
		public void caretUpdate(CaretEvent arg0) {
			String s = (String.valueOf(eingabe.getPassword()));
			s= s.trim();
			if(s.isEmpty()) {
				button.setEnabled(false);
			}else
				button.setEnabled(true);
			
		}
		
	}
	Font schrift;
	private class fontListener implements ItemListener{

		@Override
		
		public void itemStateChanged(ItemEvent e) {
			if(e.getSource()==felt) {
			if(felt.isSelected()) {
				schrift = (text.getFont().deriveFont(Font.BOLD));
				text.setFont(schrift);
			}else {
				schrift = (text.getFont().deriveFont(Font.PLAIN));
				text.setFont(schrift);
			}
			if(kursiv.isSelected()) {
				schrift = text.getFont().deriveFont(schrift.getStyle() + Font.ITALIC);
				text.setFont(schrift);
			}
			if(groﬂ.isSelected()) {
				schrift = text.getFont().deriveFont(schrift.getStyle(),36);
				text.setFont(schrift);
			}
			else {
				schrift = text.getFont().deriveFont(schrift.getStyle(),28);
				text.setFont(schrift);
			}
			}else if(e.getSource() instanceof  JRadioButton) {
				text.setText(((JRadioButton)e.getSource()).getText());
			}
		}
		
	}
	


}
