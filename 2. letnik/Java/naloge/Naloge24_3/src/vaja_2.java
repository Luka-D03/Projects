import java.util.Scanner;

public class vaja_2 {
// Prvo nalogo dopolni tako, da v primeru, ko je vrednost spremenljivke min soda, vrednost spremenljivke
//min mno�imo z vrednostjo spremenljivke vsotasodih in izpi�e rezultat.
//V primeru, da je vrednost spremenljivke min liha, pa vrednost spemenljivke vsotasodih mno�imo z vrednostjo
//spremenljivke vsotalihih in izpi�e rezultat.
	
	public static void main(String[] args) {
		try (Scanner vhod = new Scanner (System.in)){
			
			int min = 999999999;
			int vsotasodih = 0;
			int vsotalihih = 0;
			int vsota = 0;
			
			for(int i = 1; i <= 12; i++)
			{
				System.out.print("Vnesi "+i+". �tevilo: ");
				int x = vhod.nextInt();
				
				if(x < min)
				{
					min = x;
				}
			}
			System.out.println("Najmanj�e �tevilo je: "+min);
			
			for(int i = 1; i <= 6; i++)
			{
				System.out.print("Vnesi "+i+". �tevilo: ");
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
			
			System.out.println("Pomno�en minimum je: "+min);
			
			if(vsotasodih > vsotalihih)
			{
				vsota = vsotasodih;
			}
			else
			{
				vsota = vsotalihih;
			}
			System.out.print("Najve�je �tevilo je: "+vsota);
			
		}

	}

}
