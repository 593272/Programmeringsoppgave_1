package innlevering1;

import javax.swing.*;

public class Oppg5 {

	public static void main(String[] args) {

		
		for (int i = 0; i < 10; i++) {
		int pts = Integer.parseInt(JOptionPane.showInputDialog("Antall poeng mellom 0-100"));
		
		if ( pts <= 100 && pts >= 90) {
			System.out.println("Karakter: A");
			
		}else if (pts <=89 && pts >=80) {
			System.out.println("Karakter: B");
			
		}else if (pts <= 79 && pts >= 60) {
			System.out.println("Karakter C");
			
		}else if (pts <= 59 && pts >= 50) {
			System.out.println("Karakter D");
			
		}else if (pts <= 49 && pts >= 40) {
			System.out.println("Karakter E");
			
		}else if (pts <= 39 && pts >= 0) {
			System.out.println("Karakter F");
			
		}else {
			System.out.println("Det du satte inn ble ikke akseptert");
			i++;
			
			}
			
		}
		
	}

}
