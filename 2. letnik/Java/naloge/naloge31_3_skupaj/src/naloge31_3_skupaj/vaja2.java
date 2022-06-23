package naloge31_3_skupaj;

import java.util.Scanner;
//Napiši program, ki izpiše števila deljiva s 3 in hkrati z X in vsoto sodih števil na intervalu med 2 in Z. 
//V primeru, da prebrano število Z manjše od 34, ga ponovno preberi.
public class vaja2 {

	public static void main(String[] args) {
		try (Scanner in = new Scanner(System.in)) {
			
			int vsota_sodih = 0;
			int a = 2;
			
			System.out.print("Vnesi število: ");
			int z = in.nextInt();
			
			System.out.print("Vnesi število: ");
			int x = in.nextInt();
			
			for(int i = 1; i < a; i++) {
				if(z < 34) {
					System.out.print("Ponovno vnesi število: ");
					z = in.nextInt();
					a++;
				}
				else {
					a--;
				}
			}
			
			System.out.println("Števila ki so deljiva s 3 in hkrati s "+x+" so: ");
			
			for(int i = 2 + 1; i < z; i++) {
				
				if(i % 2 == 0) {
					vsota_sodih += i;
				}
				
				if(i % 3 == 0) {
					if(i % x == 0) {
						System.out.println(i);
					}
				}
			}
			
			System.out.print("Vsota sodih števil je: "+vsota_sodih);
		}

	}

}
