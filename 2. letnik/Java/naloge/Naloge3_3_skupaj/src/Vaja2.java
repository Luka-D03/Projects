import java.util.Scanner;

public class Vaja2 {
	//Napiši program, ki prebere petnajst števil. 
	//Pri tem izpiše števila deljiva z X izmed prvih desetih prebranih števil in števila deljiva z Y izmed ostalih pet prebranih števil.


	public static void main(String[] args) {
		
		Scanner vhod = new Scanner(System.in);
		
		System.out.print("Vnesi x: ");
		int x = vhod.nextInt();
		
		System.out.print("Vnesi y: ");
		int y = vhod.nextInt();
		
		for(int i = 1; i <= 15; i++)
		{
			System.out.print("Vnesi "+i+". število: ");
			int z = vhod.nextInt();
			
			if(i <= 10)
			{
				if(z % x == 0)
				{
					System.out.println("Število "+z+" je deljivo z "+x);
				}
			}
			
			if(i > 10)
			{
				if(z % y == 0)
				{
					System.out.println("Število "+z+" je deljivo z "+y);
				}
			}
		}
	}

}
