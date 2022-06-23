import java.util.Scanner;
//Napiši program, ki prebere 12 števil. Izmed teh števil poišèe najmanjšega, ga shrani v spremenljivko min in
//vrednost spremenljivke min izpiše.
//Nato prebere 6 števil in sešteje soda števila posebej (vsotasodih) in liha posebej (vsotalihih). Veèjo izmed vsot
//shrani v spremenljivko vsota in izpiše njeno vrednost.
public class Vaja1 {

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
			
			if(x%2==0)
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

	}

}
