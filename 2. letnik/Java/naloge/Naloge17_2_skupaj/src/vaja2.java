import java.util.Scanner;

public class vaja2 {
//Napi�i program, ki izpi�e �tevila deljiva z X izmed petnajstih prebranih �tevil.
	public static void main(String[] args) {
		Scanner vhod = new Scanner (System.in);
		
		System.out.print("Vnesi �tevilo: ");
		int x = vhod.nextInt();
		
		for(int i = 1; i <= 15; i++)
		{
			System.out.print("Vnesi "+i+". �tevilo: ");
			int y = vhod.nextInt();
			
			if(y % x == 0)
			{
				System.out.println("To �tevilo je deljivo z "+x);
				System.out.println();
			}
			else
			{
				System.out.println("To �tevilo NI deljivo z "+x);
				System.out.println();
			}
		}

	}

}
