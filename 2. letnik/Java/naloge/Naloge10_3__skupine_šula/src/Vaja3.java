import java.util.Scanner;
//Napiši program, ki prebere meji intervala. Razlika med zgornjo in spodnjo mejo mora biti najmanj 14 in največ 54.
//V primeru, da to ne drži, znova preberemo drugo mejo, če je razlika manjša od 14. V primeru, da je večja od 54, pa ponovno preberemo prvo mejo.
//Na intervalu liha števila množimo s 4 in seštejemo v vsota1, soda pa s 5 in seštejemo v vsota2.
//Vsoti zmnožimo in na koncu izpišemo rezultat.
public class Vaja3 {

	public static void main(String[] args) {
		Scanner vhod = new Scanner(System.in);
		
		System.out.print("Vnesi prvo število: ");
		int x = vhod.nextInt();
		
		System.out.print("Vnesi drugo število: ");
		int y = vhod.nextInt();

		int z = 0;
		int d = 2;
		int vsota1 = 0;
		int vsota2 = 0;
		int vsota_skupaj = 0;
		int liha;
		int soda;
		
		if(x > y)
		{
			z = x - y;
		}
		else
		{
			z = y - x;
		}
		
		for(int i = 1; i < d; i++)
		{
			if(z < 14)
			{
				System.out.print("Znova vnesi število: ");
				y = vhod.nextInt();
			}
			
			if(z > 54)
			{
				System.out.print("Znova vnesi število: ");
				x = vhod.nextInt();
			}
			
			if(z > 14 && z < 54)
			{
				d++;
			}
		}
		
		for(x = x; x < y; x++)
		{
			if(x % 2 == 1)
			{
				liha = x * 4;
				vsota1 = vsota1 + liha;
			}
			else
			{
				soda = x * 5;
				vsota2 = vsota2 + soda;
			}
		}
		vsota_skupaj = vsota1 * vsota2;
		System.out.print("Zmnožek je: "+vsota_skupaj);
	}

}
