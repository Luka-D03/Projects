package naloge31_3_skupaj;

import java.util.Scanner;
//Napi�i program, ki izpi�e vsako peto �tevilo na intervalu med X in Y oziroma Y in X (glede na to katero izmed �tevil je ve�je!). 
//Razlika med njima mora biti najmanj 32. �e je manj�a ju ponovno preberi.
public class vaja4 {

	public static void main(String[] args) {
		try (Scanner in = new Scanner(System.in)) {
			
			int a = 4;
			int z = 0;
			int d = 2;
			
			System.out.print("Vnesi prvo �tevilo: ");
			int x = in.nextInt();
			
			System.out.print("Vnesi drugo �tevilo: ");
			int y = in.nextInt();
			
			if(x > y) {
				z = x - y;
			}
			else {
				z = y - x;
			}
			
			for(int i = 1; i < d; i++) {
				
				if(z < 32) {
					System.out.print("Ponovno vnesi prvo �tevilo: ");
					x = in.nextInt();
				
					System.out.print("Ponovno vnesi drugo �tevilo: ");
					y = in.nextInt();
					
					d++;
				}
				else {
					d--;
				}
				if(x > y) {
					z = x - y;
				}
				else {
					z = y - x;
				}
			}
			
			System.out.println("Vsako 5. �tevilo na intervalu je: ");
			
			if(x < y) {
				for(x = x + 1; x <= y; x++) {
					a++;
					if(a == 5) {
						System.out.println(x);
						a = 0;
					}
				}
			}

			if(y < x) {
				for(y = y + 1; y <= x; y++) {
					a++;
					if(a == 5) {
						System.out.println(y);
						a = 0;
					}
				}
			}
		}
	}
}
