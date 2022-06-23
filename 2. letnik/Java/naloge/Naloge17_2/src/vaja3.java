import java.util.Scanner;

public class vaja3 {
//Napiši program, ki prebere 12 števil, izpiše najveèje in najmanjše število in vsoto zadnjih petih prebranih števil.
	
	public static void main(String[] args) {
		Scanner vhod = new Scanner (System.in);
		
		int max = 0;
		int min = 999999999;
		int vsota = 0;
		
		for(int i = 1; i <= 12; i++)
		{
			System.out.print("Vnesi "+i+". število: ");
			int x = vhod.nextInt();
			
			if(x > max)
			{
				max = x;
			}
			
			if(x < min)
			{
				min = x;
			}
			if(i > 7)
			{
				vsota = vsota+x;
			}
		}
		
		System.out.println("Vsota števil je: "+vsota);
		System.out.println("Najveèje število je: "+max);
		System.out.println("Najmanjše število je: "+min);
		
	}

}
