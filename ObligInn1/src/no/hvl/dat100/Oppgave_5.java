package no.hvl.dat100;

import static javax.swing.JOptionPane.*;

import static java.lang.Integer.*;

public class Oppgave_5 {

	public static void main(String[] args) {
		
		
		for(int i = 0; i < 9; i++) {
			
				int poeng = parseInt(showInputDialog("Tast inn poengsum"));
				char karakter = ' ';
			
			if(poeng >= 90 && poeng <= 100) {
				karakter = 'A';
				showMessageDialog(null,"Eleven fikk karakteren: " + karakter);
			}
			else if(poeng >= 80 && poeng <= 89) {
				karakter = 'B';
				showMessageDialog(null,"Eleven fikk karakteren: " + karakter);
			}
			else if(poeng >= 60 && poeng <= 79) {
				karakter = 'C';
				showMessageDialog(null,"Eleven fikk karakteren: " + karakter);
			} 
			else if(poeng >= 50 && poeng <= 59) {
				karakter = 'D';
				showMessageDialog(null,"Eleven fikk karakteren: " + karakter);
			}
			else if(poeng >= 40 && poeng <= 49) {
				karakter = 'E';
				showMessageDialog(null,"Eleven fikk karakteren: " + karakter);
			}
			else if(poeng >= 110 || poeng < 0 ) {
				if(i > 0) {
					i--;
				}
				showMessageDialog(null, "Tast inn et gylig tall");
			}
			karakter = 0;
		}

	}
}
	
