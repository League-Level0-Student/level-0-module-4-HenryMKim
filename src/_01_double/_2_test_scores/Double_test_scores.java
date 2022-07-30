package _01_double._2_test_scores;

import javax.swing.JOptionPane;


public class Double_test_scores {
public static void main(String[] args) {
	

	String s = JOptionPane.showInputDialog(null, "What is your most recent test score? (out of 100, no percentages)");
	double sl = Double.parseDouble(s);
	if(sl > 99) {
		JOptionPane.showMessageDialog(null, "Wow, you aced it!");
	}
	
	if(sl > 90 && sl < 99) {
		JOptionPane.showMessageDialog(null, "Ooh, almost perfect!");
	}
	
	if(sl < 50) {
		JOptionPane.showMessageDialog(null, "You need to study harder!");
	}
	
}
}
