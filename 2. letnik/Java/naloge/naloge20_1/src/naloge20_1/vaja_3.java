package naloge20_1;

import java.util.Scanner;

//Napi�i program, ki izpi�e vsoto vsakega petega �tevila na intervalu med X in Y.
public class vaja_3 {

	public static void main(String[] args) {
		Scanner vhod = new Scanner(System.in);
		
		System.out.print("Vnesi prvo �t.: ");
		int i = vhod.nextInt();
		System.out.print("Vnesi drugo �t.: ");
		int y = vhod.nextInt();
		
		int x = 4;
		int v = 0;
		
		for(i++; i<y; i++)
		{
			x++;
			if(x==5)
			{
				v=v+i;
				x=0;
			}
		}
		System.out.println("Vsota vsakega petega �tevila je: "+v);
	}
}
