import java.util.Scanner;

public class vaja_2 {
	//Napi�i program, ki prebere deset �tevil, izpi�e najve�je �tevilo in vsoto prvih petih prebranih �tevil.
	public static void main(String[] args) {
		Scanner vhod = new Scanner(System.in);
		
		int max = 0;
		int v = 0;
		int y = 0;
		
		for(int i = 1; i<=10; i++)
		{
			y++;
			System.out.print("Vnesi "+i+". �tevilo: ");
			int x = vhod.nextInt();
			if(x>max)
			{
				max = x;
			}
			if(y<=5)
			{
				v = v+x;
			}
		}
		System.out.print("Najve�je �tevilo je: "+max);
		System.out.println();
		System.out.print("Vsota prvih petih �tevil je: "+v);
	}

}
