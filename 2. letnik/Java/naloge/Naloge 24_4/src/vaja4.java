import java.util.Scanner;

//Napiši program, ki glede na vneseno število izriše zvezdice. Primer števila 3:

//*   *   *

//  *   *

//    *
public class vaja4 {

	public static void main(String[] args) {
		try(Scanner vhod = new Scanner(System.in)) {
			
			System.out.print("Vnesi poljubno število: ");
			int y = vhod.nextInt();
			int z=0;
			int n=y;
			for (int i=1; i<=5; i++)
			{
				for (int x=1; x<=z; x++)
				{
					System.out.print(" ");
				}
				for (int j=1; j<=n; j++)
				{
					System.out.print("*");
					System.out.print(" ");
				}
				z++;
				n--;
				System.out.println();
				}
			}
		}		
	}

