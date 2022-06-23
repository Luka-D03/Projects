import java.util.Scanner;

public class vaja2 {
//Napiši program, ki izpiše števila deljiva z X izmed petnajstih prebranih števil.
	public static void main(String[] args) {
		Scanner vhod = new Scanner (System.in);
		
		System.out.print("Vnesi število: ");
		int x = vhod.nextInt();
		
		for(int i = 1; i <= 15; i++)
		{
			System.out.print("Vnesi "+i+". število: ");
			int y = vhod.nextInt();
			
			if(y % x == 0)
			{
				System.out.println("To število je deljivo z "+x);
				System.out.println();
			}
			else
			{
				System.out.println("To število NI deljivo z "+x);
				System.out.println();
			}
		}

	}

}
