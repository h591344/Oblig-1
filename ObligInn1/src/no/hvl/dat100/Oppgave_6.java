package no.hvl.dat100;

import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;

public class Oppgave_6 {

	public static void main(String[] args) {
		int heltall = parseInt(showInputDialog("Tast inn heltall"));
		int fakultet = heltall;
		
		if(heltall > 0) {
			for ( int i = 1; i <= heltall; i++) {
				fakultet *= i;
				System.out.println(fakultet);
			}
		}
		else {
			showMessageDialog(null, "Tallet m� v�re h�yere enn 0");
		}
		showMessageDialog(null, "Fakulteten av tallet " + heltall + " er: " + fakultet);
	}
}
