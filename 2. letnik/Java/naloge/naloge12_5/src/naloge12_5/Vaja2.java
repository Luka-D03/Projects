package naloge12_5;

import java.util.Scanner;

//Napiši program, ki prebere 12 števil in izpiše tista, ki so deljiva hkrati z 2 in z X.
public class Vaja2 {

	public static void main(String[] args) {
		try(Scanner vhod = new Scanner(System.in)){
			
			System.out.print("Vnesi poljubno število: ");
			int x = vhod.nextInt();
			
			for(int i = 1; i <= 12; i++) {
				
				System.out.print("Vnesi "+i+". število: ");
				int y = vhod.nextInt();
				
				if(y % x == 0 && y % 2 == 0) {
					System.out.println("Število "+y+" je deljivo z 2 in z "+x);
				}
			}
		}
	}
}
