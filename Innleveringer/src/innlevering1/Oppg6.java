package innlevering1;

import javax.swing.*;

public class Oppg6 {

	public static void main(String[] args) {

		int n = Integer.parseInt(JOptionPane.showInputDialog("Sett inn et naturlig tall"));
		
		int svar = 1;
		
		if (n >=0) {
			
			for (int i =1; i <=n; i++) {
				svar = svar * i;
				
			}
			
			System.out.print(svar);
			
		} else {
			
			System.out.println("Det du satte inn ble ikke akseptert");
		}
			
		
	}

}
