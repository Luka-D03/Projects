package naloge27_1;

import java.util.Scanner;
//Napiši program, ki prebere dve števili. Ti dve števili vzame za meji intervala. Vsako drugo število na intervalu sešteje in izpiše rezultat. 
//Nalogo reši enkrat s for in drugic z while zanko.
public class vaja_4 {

	public static void main(String[] args) {
		Scanner vhod = new Scanner(System.in);
		//for zanka
		System.out.println("Uporaba zanke while:");
		System.out.println();
		System.out.print("Vnesi število, ki se uporabi za zacetek intervala: ");
		int z = vhod.nextInt();
		System.out.print("Vnesi število, ki se uporabi za konec intervala: ");
		int y = vhod.nextInt();;
		int v = 0;
		
		int x = z;
		x++;
		for(x = x; x<y; x++)
		{
			v = v+x;
		}
		System.out.print("Seštevek števil med "+z+ " in "+y+" je: "+v);
		System.out.println();
		System.out.println();
		//while zanka
		System.out.println("Uporaba zanke while:");
		System.out.println();
		System.out.print("Vnesi število, ki se uporabi za zacetek intervala: ");
		int q = vhod.nextInt();
		System.out.print("Vnesi število, ki se uporabi za konec intervala: ");
		int w = vhod.nextInt();;
		int e = 0;
		
		int r = q;
		r++;
		while(r<w)
		{
			e = e+r;
			r++;
		}
		System.out.print("Seštevek števil med "+q+ " in "+w+" je: "+e);
	
	}
}
