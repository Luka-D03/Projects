import java.util.Scanner;

public class vaja_2 {
// Prvo nalogo dopolni tako, da v primeru, ko je vrednost spremenljivke min soda, vrednost spremenljivke
//min množimo z vrednostjo spremenljivke vsotasodih in izpiše rezultat.
//V primeru, da je vrednost spremenljivke min liha, pa vrednost spemenljivke vsotasodih množimo z vrednostjo
//spremenljivke vsotalihih in izpiše rezultat.
	
	public static void main(String[] args) {
		try (Scanner vhod = new Scanner (System.in)){
			
			int min = 999999999;
			int vsotasodih = 0;
			int vsotalihih = 0;
			int vsota = 0;
			
			for(int i = 1; i <= 12; i++)
			{
				System.out.print("Vnesi "+i+". število: ");
				int x = vhod.nextInt();
				
				if(x < min)
				{
					min = x;
				}
			}
			System.out.println("Najmanjše število je: "+min);
			
			for(int i = 1; i <= 6; i++)
			{
				System.out.print("Vnesi "+i+". število: ");
				int x = vhod.nextInt();
				
				if(x % 2 == 0)
				{
					vsotasodih += x;
				}
				
				if(x % 2 == 1)
				{
					vsotalihih += x;
				}
			}
			
			if(min % 2 == 0)
			{
				min = min * vsotasodih;
			}
			else
			{
				min = vsotasodih * vsotalihih;
			}
			
			System.out.println("Pomnožen minimum je: "+min);
			
			if(vsotasodih > vsotalihih)
			{
				vsota = vsotasodih;
			}
			else
			{
				vsota = vsotalihih;
			}
			System.out.print("Najveèje število je: "+vsota);
			
		}

	}

}
