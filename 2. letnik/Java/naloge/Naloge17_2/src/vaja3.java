import java.util.Scanner;

public class vaja3 {
//Napi�i program, ki prebere 12 �tevil, izpi�e najve�je in najmanj�e �tevilo in vsoto zadnjih petih prebranih �tevil.
	
	public static void main(String[] args) {
		Scanner vhod = new Scanner (System.in);
		
		int max = 0;
		int min = 999999999;
		int vsota = 0;
		
		for(int i = 1; i <= 12; i++)
		{
			System.out.print("Vnesi "+i+". �tevilo: ");
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
		
		System.out.println("Vsota �tevil je: "+vsota);
		System.out.println("Najve�je �tevilo je: "+max);
		System.out.println("Najmanj�e �tevilo je: "+min);
		
	}

}
