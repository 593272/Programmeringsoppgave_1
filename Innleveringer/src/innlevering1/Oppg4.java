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
		
		double brutto = Double.parseDouble(JOptionPane.showInputDialog("Skriv inn bruttol�nn"));
		
		if (brutto <= b0) {
			double tKr0 = (brutto * t0)/100;
			double netto = (brutto - tKr0);
			System.out.print("Du har en bruttoinntekt p� " + brutto + "kr og har en trinnskatt p� " + t0 + "% din nettol�nn er " + netto + "kr." );
			
		}else if (brutto > b0 && brutto < b1) {
			double tKr1 = (brutto * t1)/100;
			double netto = (brutto - tKr1);
			System.out.print("Du har en bruttoinntekt p� " + brutto + "kr og har en trinnskatt p� " + t1 + "% din nettol�nn er " + netto + "kr." );
		
		}else if (brutto > b1 && brutto < b2) {
			double tKr2 = (brutto * t2)/100;
			double netto = (brutto - tKr2);
			System.out.print("Du har en bruttoinntekt p� " + brutto + "kr og har en trinnskatt p� " + t2 + "% din nettol�nn er " + netto + "kr." );
			
		}else if (brutto > b2 && brutto < b3) {
			double tKr3 = (brutto * t3)/100;
			double netto = (brutto - tKr3);
			System.out.print("Du har en bruttoinntekt p� " + brutto + "kr og har en trinnskatt p� " + t3 + "% din nettol�nn er " + netto + "kr." );
			
		}else if (brutto > b3) {
			double tKr4 = (brutto * t4)/100;
			double netto = (brutto - tKr4);
			System.out.print("Du har en bruttoinntekt p� " + brutto + "kr og har en trinnskatt p� " + t4 + "% din nettol�nn er " + netto + "kr." );
		}
		
	}

}
