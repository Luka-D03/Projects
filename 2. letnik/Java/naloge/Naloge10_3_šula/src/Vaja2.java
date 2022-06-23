import java.util.Scanner;

public class Vaja2 {
//Napiši program, ki prebere dvajset števil. 
//Pri tem izpiše števila deljiva z 2 izmed prvih desetih prebranih števil in števila deljiva z Y izmed ostalih desetih prebranih števil.

	public static void main(String[] args) {
		Scanner vhod = new Scanner (System.in);
		
		System.out.print("Vnesi poljubno število: ");
		int y = vhod.nextInt();
		
		for(int i = 1; i <= 20; i++)
		{
			System.out.print("Vnesi "+i+". število: ");
			int x = vhod.nextInt();
			
			if(i <= 10)
			{
				if(x % 2 == 0)
				{
					System.out.println("Število "+x+" je deljivo z 2");
				}
			}
			else
			{
				if(x % y == 0)
				{
					System.out.println("Število "+x+" je deljivo z "+y);
				}
			}
		}
	}

}
