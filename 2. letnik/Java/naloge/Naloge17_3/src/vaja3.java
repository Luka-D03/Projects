import java.util.Scanner;

//Napi�i program, ki prebere 12 �tevil in izpi�e najve�je in drugo najve�je �tevilo. 
//Na intervalu med najmanj�im in najve�jim vnesenim �tevilom se�teje vsako drugo �tevilo in izpi�e rezultat.
public class vaja3 {

	public static void main(String[] args) {
		try (Scanner vhod = new Scanner(System.in)) {
			
			int max = -999999999;
			int max2 = -999999999;
			int min = 999999999;
			int y = 1;
			int vsota = 0;
			
		
			for(int i = 1; i <= 12; i++)
			{
				System.out.print("Vnesi "+i+". �tevilo: ");
				int x = vhod.nextInt();
				
				if (x >= max) 
				{
		            max2 = max;
		            max = x;
				}
				
				if(x < min)
				{
					min = x;
				}
			}
			System.out.println("Najve�je �tevilo je: "+max);
			System.out.println("Drugo najve�je �tevilo je: "+max2);
			System.out.println("Najmanj�e �tevilo je: "+min);

			for(min = min + 1; min < max; min++)
			{
				y++;
				if(y == 2)
				{
					vsota += min;
					y = 0;
				}
			}
			System.out.println("Vsota vsakega drugega �tevila je: "+vsota);
		}
	}
}
