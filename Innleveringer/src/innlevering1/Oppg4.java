package innlevering1;

import javax.swing.*;

public class Oppg4 {
	
// program som leser inn bruttoinntekt, bergegner og skriver ut trinnskatten
	
	public static void main(String[] args) {
		
		// trinn for sats
		double t0 = 0;
		double t1 = 0.93;
		double t2 = 2.41;
		double t3 = 11.52;
		double t4 = 14.52;
		
		// trinn fra brutto
		double b0 = 164100;
		double b1 = 230950;
		double b2 = 580650;
		double b3 = 934050;
		
		double brutto = Double.parseDouble(JOptionPane.showInputDialog("Skriv inn bruttolønn"));
		
		if (brutto <= b0) {
			double tKr0 = (brutto * t0)/100;
			double netto = (brutto - tKr0);
			System.out.print("Du har en bruttoinntekt på " + brutto + "kr og har en trinnskatt på " + t0 + "% din nettolønn er " + netto + "kr." );
			
		}else if (brutto > b0 && brutto < b1) {
			double tKr1 = (brutto * t1)/100;
			double netto = (brutto - tKr1);
			System.out.print("Du har en bruttoinntekt på " + brutto + "kr og har en trinnskatt på " + t1 + "% din nettolønn er " + netto + "kr." );
		
		}else if (brutto > b1 && brutto < b2) {
			double tKr2 = (brutto * t2)/100;
			double netto = (brutto - tKr2);
			System.out.print("Du har en bruttoinntekt på " + brutto + "kr og har en trinnskatt på " + t2 + "% din nettolønn er " + netto + "kr." );
			
		}else if (brutto > b2 && brutto < b3) {
			double tKr3 = (brutto * t3)/100;
			double netto = (brutto - tKr3);
			System.out.print("Du har en bruttoinntekt på " + brutto + "kr og har en trinnskatt på " + t3 + "% din nettolønn er " + netto + "kr." );
			
		}else if (brutto > b3) {
			double tKr4 = (brutto * t4)/100;
			double netto = (brutto - tKr4);
			System.out.print("Du har en bruttoinntekt på " + brutto + "kr og har en trinnskatt på " + t4 + "% din nettolønn er " + netto + "kr." );
		}
		
	}

}
