package naloge31_3_skupaj;

import java.util.Scanner;
//Napiši program, ki prebere 18 števil, izpiše najveèje in najmanjše število in vsoto od 5 do 10 prebranega števila.
public class vaja3 {

	public static void main(String[] args) {
		try (Scanner in = new Scanner(System.in)) {
			
			int vsota = 0;
			int max = -999999999;
			int min = 999999999;
			
			for(int i = 1; i <= 18; i++) {
				System.out.print("Vnesi "+i+". število: ");
				int x = in.nextInt();
				
				if(x > max) {
					max = x;
				}
				
				if(x < min) {
					min = x;
				}
				
				if(i >= 5 && i <= 10) {
					vsota += x;
				}
			}
			
			System.out.println("Najveèje število je: "+max);
			System.out.println("Najmanjše število je: "+min);
			System.out.println("Vsota je: "+vsota);
		}

	}

}
