import java.util.Scanner;

public class Vaja2 {
	//Napi�i program, ki prebere petnajst �tevil. 
	//Pri tem izpi�e �tevila deljiva z X izmed prvih desetih prebranih �tevil in �tevila deljiva z Y izmed ostalih pet prebranih �tevil.


	public static void main(String[] args) {
		
		Scanner vhod = new Scanner(System.in);
		
		System.out.print("Vnesi x: ");
		int x = vhod.nextInt();
		
		System.out.print("Vnesi y: ");
		int y = vhod.nextInt();
		
		for(int i = 1; i <= 15; i++)
		{
			System.out.print("Vnesi "+i+". �tevilo: ");
			int z = vhod.nextInt();
			
			if(i <= 10)
			{
				if(z % x == 0)
				{
					System.out.println("�tevilo "+z+" je deljivo z "+x);
				}
			}
			
			if(i > 10)
			{
				if(z % y == 0)
				{
					System.out.println("�tevilo "+z+" je deljivo z "+y);
				}
			}
		}
	}

}
