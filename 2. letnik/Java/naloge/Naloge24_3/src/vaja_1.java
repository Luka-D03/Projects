import java.util.Scanner;

public class vaja_1 {
// Napiši program, ki prebere 12 števil. Izmed teh števil poišèe najmanjšega, ga shrani v spremenljivko min in
//vrednost spremenljivke min izpiše.
//Nato prebere 6 števil in sešteje soda števila posebej (vsotasodih) in liha posebej (vsotalihih).
//Veèjo izmed vsot shrani v spremenljivko vsota in izpiše njeno vrednost.
	
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
