package naloge27_1;

import java.util.Scanner;
//Napi�i program, ki prebere dve �tevili. Ti dve �tevili vzame za meji intervala. Vsako drugo �tevilo na intervalu se�teje in izpi�e rezultat. 
//Nalogo re�i enkrat s for in drugic z while zanko.
public class vaja_4 {

	public static void main(String[] args) {
		Scanner vhod = new Scanner(System.in);
		//for zanka
		System.out.println("Uporaba zanke while:");
		System.out.println();
		System.out.print("Vnesi �tevilo, ki se uporabi za zacetek intervala: ");
		int z = vhod.nextInt();
		System.out.print("Vnesi �tevilo, ki se uporabi za konec intervala: ");
		int y = vhod.nextInt();;
		int v = 0;
		
		int x = z;
		x++;
		for(x = x; x<y; x++)
		{
			v = v+x;
		}
		System.out.print("Se�tevek �tevil med "+z+ " in "+y+" je: "+v);
		System.out.println();
		System.out.println();
		//while zanka
		System.out.println("Uporaba zanke while:");
		System.out.println();
		System.out.print("Vnesi �tevilo, ki se uporabi za zacetek intervala: ");
		int q = vhod.nextInt();
		System.out.print("Vnesi �tevilo, ki se uporabi za konec intervala: ");
		int w = vhod.nextInt();;
		int e = 0;
		
		int r = q;
		r++;
		while(r<w)
		{
			e = e+r;
			r++;
		}
		System.out.print("Se�tevek �tevil med "+q+ " in "+w+" je: "+e);
	
	}
}
