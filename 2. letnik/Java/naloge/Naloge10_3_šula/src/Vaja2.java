import java.util.Scanner;

public class Vaja2 {
//Napi�i program, ki prebere dvajset �tevil. 
//Pri tem izpi�e �tevila deljiva z 2 izmed prvih desetih prebranih �tevil in �tevila deljiva z Y izmed ostalih desetih prebranih �tevil.

	public static void main(String[] args) {
		Scanner vhod = new Scanner (System.in);
		
		System.out.print("Vnesi poljubno �tevilo: ");
		int y = vhod.nextInt();
		
		for(int i = 1; i <= 20; i++)
		{
			System.out.print("Vnesi "+i+". �tevilo: ");
			int x = vhod.nextInt();
			
			if(i <= 10)
			{
				if(x % 2 == 0)
				{
					System.out.println("�tevilo "+x+" je deljivo z 2");
				}
			}
			else
			{
				if(x % y == 0)
				{
					System.out.println("�tevilo "+x+" je deljivo z "+y);
				}
			}
		}
	}

}
