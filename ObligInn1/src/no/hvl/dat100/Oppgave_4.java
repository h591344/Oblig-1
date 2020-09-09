package no.hvl.dat100;

import static javax.swing.JOptionPane.*;

public class Oppgave_4 {

	public static void main(String[] args) {

		String bruttointekt = showInputDialog("Bruttointekt: ");
		
		double trinnskatt = 0;
		double brutto = Double.parseDouble(bruttointekt);
		
		if(brutto <= 164100 && brutto >= 0){
			System.out.println("Du trenger ikke betale trinnskatt");
		}
		else if(brutto > 164100 && brutto <= 230950) {
			trinnskatt = brutto * 0.0093;
			System.out.println("Du må betale " + trinnskatt + " i trinnskatt");
		}
		
		else if(brutto > 230950 && brutto <= 580650) {
			trinnskatt = brutto * 0.0241;
			System.out.println("Du må betale " + trinnskatt + " i trinnskatt");
		}
		else if(brutto > 580650 && brutto <= 934050) {
			trinnskatt = brutto * 0.1152;
			System.out.println("Du må betale " + trinnskatt + " i trinnskatt");
		}
		else if(brutto > 934050) {
			trinnskatt = brutto * 0.1452;
			System.out.println("Du må betale " + trinnskatt + " i trinnskatt");
		}
		else {
			System.out.println("Ugylding sum");
		}
	}

}