import java.util.Scanner;

public class vaja_1 {
// Napi�i program, ki prebere 12 �tevil. Izmed teh �tevil poi��e najmanj�ega, ga shrani v spremenljivko min in
//vrednost spremenljivke min izpi�e.
//Nato prebere 6 �tevil in se�teje soda �tevila posebej (vsotasodih) in liha posebej (vsotalihih).
//Ve�jo izmed vsot shrani v spremenljivko vsota in izpi�e njeno vrednost.
	
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
