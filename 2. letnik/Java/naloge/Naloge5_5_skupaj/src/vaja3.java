import java.util.Scanner;

public class vaja3 {
//Napiši program, ki prebere 12 števil in izpiše najveèje število. Nato prebere 9 števil in izpiše najmanjše število. 
//Na intervalu med najmanjšim in najveèjim številom sešteje števila deljiva s prvim prebranim številom in izpiše rezultat.
	public static void main(String[] args) {
		try(Scanner vhod = new Scanner(System.in)) {
		
			int d = 0, max = -999999999, min = 999999999, vsota = 0;
			
			for(int i = 1, f = 1; i <= 12; i++) {
				System.out.print("Vnesi "+i+". število: ");
				int x = vhod.nextInt();
				if(f == 1) {
					d = x;
				}
				if(x > max) {
					max = x;
				}
			}
			
			for(int i = 1; i <= 9; i++) {
				System.out.print("Vnesi "+i+". število: ");
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
