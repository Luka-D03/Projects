import java.util.Scanner;

public class vaja2 {
//Napi?i program, ki prebere dvajset ?tevil. 
//Pri tem izpi?e ?tevila deljiva z X izmed prvih desetih prebranih ?tevil in ?tevila deljiva z Y izmed ostalih pet prebranih ?tevil. 
//Zadnjih pet prebranih ?tevil se?teje v vsoto in deli z drugim ?tevilom deljivim z X izmed prvih desetih prebranih ?tevil.
	public static void main(String[] args) {
		try(Scanner vhod = new Scanner(System.in)){
			
			int vsota = 0;
			int h = 0;
			int s = 0;
			
			System.out.print("Vnesi x: ");
			int x = vhod.nextInt();
			
			System.out.print("Vnesi y: ");
			int y = vhod.nextInt();
			
			for(int i = 1; i <= 20; i++)
			{
				System.out.print("Vnesi "+i+". ?tevilo: ");
				int z = vhod.nextInt();
				
				if(i <= 10)
				{
					if(z % x == 0)
					{
						h++;
						System.out.println("?tevilo "+z+" je deljivo z "+x);
						if(h == 2)
						{
							s = z;
						}
					}
				}
				
				if(i > 10 && i <= 15)
				{
					if(z % y == 0)
					{
						System.out.println("?tevilo "+z+" je deljivo z "+y);
					}
				}
				
				if(i > 15)
				{
					vsota += z;
				}
				
			}
			vsota = vsota/s;
			System.out.println("Vsota deljiva z drugim deljivim z "+x+" ?tevilom je: "+vsota);
			
		}

	}

}
