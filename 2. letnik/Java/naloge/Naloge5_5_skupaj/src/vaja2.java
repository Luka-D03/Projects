import java.util.Scanner;

public class vaja2 {
// Napiši program, ki prebere 8 števil in izpiše tista, ki so liha in niso deljiva z 9.
	public static void main(String[] args) {
		try(Scanner vhod = new Scanner(System.in)) {
		
			for(int i = 1; i <= 8; i++) {
				System.out.print("Vnesi "+i+". število: ");
				int x = vhod.nextInt();
				
				if(x % 2 == 1 && x % 9 != 0) {
					System.out.println(x);
				}
			}
		}
	}
}
