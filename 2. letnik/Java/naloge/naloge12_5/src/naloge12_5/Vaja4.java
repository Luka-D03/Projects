package naloge12_5;

import java.util.Scanner;

//Napi?i program, ki glede na vneseno ?tevilo izri?e zvezdice. Primer ?tevila 4:

//    **

//   ** ***

//  ** ***   ****

// ** ***   ****     *****
public class Vaja4 {

	public static void main(String[] args) {
		try(Scanner vhod = new Scanner(System.in)){
			
			System.out.print("Vnesi poljubno ?tevilo: ");
			int d = vhod.nextInt();
			
			int s = 3;
			int x = 2;
			int z = 1;
			int a = 1;
			int w = 1;
			int g = 1;
			int h = 1;
			int y = 2;
		
			for (int i = 1; i <= d; i++)
			{
				for (x = d; x > z; x--)
				{
					System.out.print(" ");
				}
				if(i == 1) {
					System.out.print("*");
				}
				for(x = w; x <= a; x++) {
					System.out.print("*");
					if(x == 1) {
						System.out.print(" ");
						g = 4;
						h = g - 1;
					}
					
					if(x == g) {
						for(int v = 0; v <= y; v++) {
						System.out.print(" ");
						}
						y++;
						h++;
						g += h;
					}
				}
				z++;
				a += s;
				w = 0;
				s++;
				y = 1;
				System.out.println();
			}
		}
	}
}
