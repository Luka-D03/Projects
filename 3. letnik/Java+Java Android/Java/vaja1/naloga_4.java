import java.util.Scanner;
/*
Napiši program, ki glede na vneseno število izriše zvezdice. Primer števila 3:

    *
   *  *
  *  *  *
*/
public class naloga_4 {
        public static void main(String[] args) {
            Scanner vhod = new Scanner(System.in);
            System.out.print("Vnesi poljubno število: ");
			int y = vhod.nextInt();
			int n = y-1;
			int z = 1;
			for (int i=1; i<=y; i++) {
				for(int x = n; x > 0; x--) {
					System.out.print(" ");
				}
				for(int d = 0; d < z; d++) {
					System.out.print("*");
					System.out.print(" ");
				}
				System.out.println();
				z++;
				n--;
        }
    }
}