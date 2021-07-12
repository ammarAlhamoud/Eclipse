package GUI_Übung;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.GridLayout;
import java.awt.Color;
import java.awt.Font;

public class Timer{

	public static void main(String[] args) {
		
		TimeFenester tf = new TimeFenester();
		tf.setResizable(false);
		tf.lbl_Timer.setBounds(0, 10, 163, 47);
		tf.Fenster();
		Gui_RealTime rt = new Gui_RealTime();
		rt.start();
	}
}
