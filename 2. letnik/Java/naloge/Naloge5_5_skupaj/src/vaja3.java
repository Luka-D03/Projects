import java.util.Scanner;

public class vaja3 {
//Napi�i program, ki prebere 12 �tevil in izpi�e najve�je �tevilo. Nato prebere 9 �tevil in izpi�e najmanj�e �tevilo. 
//Na intervalu med najmanj�im in najve�jim �tevilom se�teje �tevila deljiva s prvim prebranim �tevilom in izpi�e rezultat.
	public static void main(String[] args) {
		try(Scanner vhod = new Scanner(System.in)) {
		
			int d = 0, max = -999999999, min = 999999999, vsota = 0;
			
			for(int i = 1, f = 1; i <= 12; i++) {
				System.out.print("Vnesi "+i+". �tevilo: ");
				int x = vhod.nextInt();
				if(f == 1) {
					d = x;
				}
				if(x > max) {
					max = x;
				}
			}
			
			for(int i = 1; i <= 9; i++) {
				System.out.print("Vnesi "+i+". �tevilo: ");
				int x = vhod.nextInt();
				if(x < min) {
					min = x;
				}
			}
			for(min = min; min < max; min++) {
				if(min % d == 0) {
					vsota += min;
				}
			}
			System.out.println("Vsota je: "+vsota);
		}
	}
}
