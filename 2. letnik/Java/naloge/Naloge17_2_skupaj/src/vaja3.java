import java.util.Scanner;

public class vaja3 {
//Nalogo 2 nadgradi tako, da program ne izpi�e tistih �tevil deljivih z X, ki so deljiva s 3.
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
				if(y % 3 == 0)
				{
					System.out.println();
				}
				else
				{
					System.out.println("To �tevilo je deljivo z "+x);
					System.out.println();
				}
			}
			else
			{
				System.out.println("To �tevilo NI deljivo z "+x);
				System.out.println();
			}
		}

	}

}
