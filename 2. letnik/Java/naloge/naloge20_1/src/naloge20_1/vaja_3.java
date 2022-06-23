package naloge20_1;

import java.util.Scanner;

//Napiši program, ki izpiše vsoto vsakega petega števila na intervalu med X in Y.
public class vaja_3 {

	public static void main(String[] args) {
		Scanner vhod = new Scanner(System.in);
		
		System.out.print("Vnesi prvo št.: ");
		int i = vhod.nextInt();
		System.out.print("Vnesi drugo št.: ");
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
		System.out.println("Vsota vsakega petega števila je: "+v);
	}
}
