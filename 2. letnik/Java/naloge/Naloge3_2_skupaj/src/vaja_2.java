import java.util.Scanner;

public class vaja_2 {
	//Napiši program, ki prebere deset števil, izpiše najveèje število in vsoto prvih petih prebranih števil.
	public static void main(String[] args) {
		Scanner vhod = new Scanner(System.in);
		
		int max = 0;
		int v = 0;
		int y = 0;
		
		for(int i = 1; i<=10; i++)
		{
			y++;
			System.out.print("Vnesi "+i+". število: ");
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
		System.out.print("Najveèje število je: "+max);
		System.out.println();
		System.out.print("Vsota prvih petih števil je: "+v);
	}

}
