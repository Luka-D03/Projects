package naloge12_5;

import java.util.Scanner;

//Napi�i program, ki prebere 12 �tevil in izpi�e tista, ki so deljiva hkrati z 2 in z X.
public class Vaja2 {

	public static void main(String[] args) {
		try(Scanner vhod = new Scanner(System.in)){
			
			System.out.print("Vnesi poljubno �tevilo: ");
			int x = vhod.nextInt();
			
			for(int i = 1; i <= 12; i++) {
				
				System.out.print("Vnesi "+i+". �tevilo: ");
				int y = vhod.nextInt();
				
				if(y % x == 0 && y % 2 == 0) {
					System.out.println("�tevilo "+y+" je deljivo z 2 in z "+x);
				}
			}
		}
	}
}
