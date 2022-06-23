import java.util.Scanner;
//Prvo nalogo dopolni tako, da v primeru, ko je vrednost spremenljivke min soda, vrednost spremenljivke
//min množimo z vrednostjo spremenljivke vsotasodih in izpiše rezultat.
//V primeru, da je vrednost spremenljivke min liha, pa vrednost spemenljivke vsotasodih množimo z vrednostjo
//spremenljivke vsotalihih in izpiše rezultat.
public class Vaja2 {

	public static void main(String[] args) {
		Scanner vhod = new Scanner(System.in);
		int min = 999999;
		int vsotasodih = 0;
		int vsotalihih = 0;
		int vsota = 0;
		
		for(int i = 1; i<=12; i++)
		{
			System.out.print("vnesi " +i+". število: ");
			int x = vhod.nextInt();
			if(min>x)
			{
				min = x;
			}
		}
		System.out.println("Minimum je : "+min);
		
		for(int i = 1; i<=6; i++)
		{
			System.out.print("vnesi " +i+". število: ");
			int x = vhod.nextInt();
			
			if(x%2==0 )
			{
				vsotasodih = vsotasodih + x;
			}
			else
			{
				vsotalihih = vsotalihih + x;
			}
			vsota = vsotalihih;
			if(vsotasodih>vsotalihih)
			{
				vsota = vsotasodih;
			}
		}
		System.out.println("Vsota je "+vsota);
  
		if(min % 2 == 0)
		{
			min = min * vsotasodih;
		}
		else
		{
			min = min * vsotalihih;
		}
		System.out.println("Minimum je: "+min);

	}

}
