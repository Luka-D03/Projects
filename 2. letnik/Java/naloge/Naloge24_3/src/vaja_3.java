import java.util.Scanner;

public class vaja_3 {
// Napi�i program, ki prebere meji intervala. Razlika med zgornjo in spodnjo mejo mora biti najmanj 14 in najve� 54.
//V primeru, da to ne dr�i, znova preberemo drugo mejo, �e je razlika manj�a od 14. V primeru, da je ve�ja od 54, pa ponovno preberemo prvo mejo.
//Na intervalu liha �tevila mno�imo s 4 in se�tejemo v vsota1, soda pa s 5 in se�tejemo v vsota2. Vsoti zmno�imo in na koncu izpi�emo rezultat.
	
	public static void main(String[] args) {
		try (Scanner vhod = new Scanner (System.in)){
			
			System.out.print("Vnesi prvo �tevilo: ");
			int x = vhod.nextInt();
			
			System.out.print("Vnesi drugo �tevilo: ");
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
					System.out.print("Znova vnesi �tevilo: ");
					y = vhod.nextInt();
				}
				
				if(z > 54)
				{
					System.out.print("Znova vnesi �tevilo: ");
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
			System.out.print("Zmno�ek je: "+vsota_skupaj);
			
		}

	}

}
