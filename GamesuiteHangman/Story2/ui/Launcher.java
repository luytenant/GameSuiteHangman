package ui;

import javax.swing.JOptionPane;

import domain.Punt;

public class Launcher {

	public static void main(String[] args) {
	int x = Integer.parseInt(JOptionPane.showInputDialog("x coordinaat van het punt: "));
	int y = Integer.parseInt(JOptionPane.showInputDialog("y coordinaat van het punt: "));
	
	Punt punt = new Punt(x,y);
	
	JOptionPane.showMessageDialog(null, "U heeft een correct punt aangemaakt: " + punt);
	

	}

}
