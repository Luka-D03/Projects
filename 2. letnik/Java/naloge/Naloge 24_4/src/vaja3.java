import java.util.Scanner;

//Napiši program, ki prebere 18 števil in izpiše najvešje število. Na
//intervalu med najmanjšim in najvešjim vnesenim številom sešteje števila deljiva s 5 in
//izpiše rezultat.
public class vaja3 {

	public static void main(String[] args) {
		try(Scanner vhod = new Scanner(System.in)) {
			
			int max = -999999999;
			int min = 999999999;
			int rezultat = 0;
			
			for(int i = 1; i <= 18; i++) {
				System.out.print("Vnesi "+i+". število: ");
				int x = vhod.nextInt();
				
				if(x > max) {
					max = x;
				}
				if(x < min) {
					min = x;
				}
			}
				
			for(min = min + 1; min < max; min++) {
				if(min % 5 == 0) {
					rezultat += min;
				}
			}
			System.out.println("Rezultat je: "+rezultat);
		}		
	}
}
