package GUI_Übung;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.util.Date;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class TimeFenester extends JFrame{
	/**
	 * Create the frame.
	 */
	public JPanel contentPane;
	public static JLabel lbl_Timer;
	public String time ;
	public void Fenster() {
				TimeFenester frame = new TimeFenester();
				frame.setVisible(true);
				
		}
	
	public TimeFenester() {
		setTitle("Time");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 438, 178);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lbl_Timer = new JLabel("Time now: ");
		lbl_Timer.setFont(new Font("Tahoma", Font.BOLD, 18));
		lbl_Timer.setBackground(Color.WHITE);
		lbl_Timer.setBounds(21, 42, 391, 57);
		contentPane.add(lbl_Timer);
	}

}
