package naloge20_1;

import java.util.Scanner;

//Napi�i program, ki prebere dve �tevili. Ti dve �tevili vzame za meji intervala. �tevila na intervalu se�teje in izpi�e rezultat. Nalogo re�i enkrat s for in drugi� z while zanko.
public class vaja_4 {

	public static void main(String[] args) {
		Scanner vhod = new Scanner(System.in);
		
		System.out.print("Vnesi �tevilo za spodnjo mejo intervala: ");
		int i = vhod.nextInt();
		System.out.print("Vnesi �tevilo za zgornjo mejo intervala: ");
		int y = vhod.nextInt();
		
		int x =0;
		int v = 0;
		x = i;
		System.out.println();
		System.out.println("Uporaba zanke for:");
		System.out.println();
		for(i++; i<y; i++)
		{
			v = v+i;
		}
		System.out.println("Vsota vseh �tevil je: "+v);
		
		v = 0;
		x++;
		System.out.println();
		System.out.println("Uporaba zanke while:");
		System.out.println();
		while(x<y)
		{
			v = v+x;
			x++;
		}
		System.out.println("Vsota vseh �tevil je: "+v);
	}
}
