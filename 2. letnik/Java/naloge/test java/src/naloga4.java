import java.util.Scanner;

public class naloga4 {
//Napi?i program, ki glede na vneseno ?tevilo izri?e zvezdice. Primer ?tevila 4:
//	   *

//	  * *

//	 * *  *

//	* *  *   *

	public static void main(String[] args) {
		try(Scanner vhod = new Scanner(System.in)){
			
			//inicializacija ?tevil in poljubnega ?tevila
			System.out.print("Vnesi poljubno ?tevilo: ");//izpis Vnesi poljubno ?tevilo:
			int d = vhod.nextInt();//vnos poljubnega ?tevila
			int z = 1;
			int y = 1;
			for (int i = 1; i <= d; i++)//interval, ki glede na vne?eno ?tevilo se ponovi tolikokrat kolikor je vneseno ?tevilo
			{
				for (int x = d; x > z; x--)//interval, ki izpi?e presledke pred vsemi zvezdicami
				{
					System.out.print(" ");
				}
				for (int j = 1; j <= i; j++)//interval, ki izpi?e zvezdice
				{
					System.out.print("*");
					for(int x = 0; x <= y; x++)//interval, ki izpi?e presledke med zvezdicami
					{
						System.out.print(" ");
					}
					y++;//pove?ava ?tevca
				}
				z++;
				y=0;
				System.out.println();//pomik v novo vrstico
			}
		}
	}
}
