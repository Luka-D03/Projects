package naloge31_3_skupaj;

import java.util.Scanner;
//Napi�i program, ki izpi�e �tevila in vsoto �tevil na intervalu med X+5 in Z-3. 
public class vaja1 {

	public static void main(String[] args) {
		try (Scanner in = new Scanner(System.in)) {
			
			int vsota = 0;
			
			System.out.print("Vnesi �tevilo: ");
			int x = in.nextInt();
			
			System.out.print("Vnesi �tevilo: ");
			int z = in.nextInt();
			z = z - 3;
			for(x = x + 5 + 1; x < z; x++) {
				System.out.println(x);
				vsota += x;
			}
			
			System.out.print("Vsota je: "+vsota);
		}

	}

}
