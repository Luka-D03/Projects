import java.util.Scanner;

//Napiši program, ki prebere 12 števil in izpiše najveèje in drugo najveèje število. 
//Na intervalu med najmanjšim in najveèjim vnesenim številom sešteje vsako drugo število in izpiše rezultat.
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
				System.out.print("Vnesi "+i+". število: ");
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
			System.out.println("Najveèje število je: "+max);
			System.out.println("Drugo najveèje število je: "+max2);
			System.out.println("Najmanjše število je: "+min);

			for(min = min + 1; min < max; min++)
			{
				y++;
				if(y == 2)
				{
					vsota += min;
					y = 0;
				}
			}
			System.out.println("Vsota vsakega drugega števila je: "+vsota);
		}
	}
}
