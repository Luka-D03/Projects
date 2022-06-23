import java.util.Scanner;

public class vaja4 {
//Napiši program, ki glede na vneseno število izriše zvezdice. Primer števila 5:
//* * * * *

//   *  *  *  *

//      *   *   *

//         *    *

//            *
	public static void main(String[] args) {
		try (Scanner vhod = new Scanner(System.in)) {
			
			System.out.print("Vnesi poljubno število: ");
			int y = vhod.nextInt();
			int n = y-1;
			int z = 0, b = 1;
			for (int i=1; i<=y; i++) {
				for(int d = 0; d < z; d++) {
					System.out.print(" ");
				}
				for(int x = n; x >= 0; x--) {
					System.out.print("*");
					for(int d = 0; d < b; d++) {
						System.out.print(" ");
					}
				}
				
				System.out.println();
				z = z + 2;
				n--;
				b++;
			}
		}
	}
}
