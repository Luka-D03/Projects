package naloge27_1;

import java.util.Scanner;
//Napi�i program, ki izpi�e vsoto vsakega X �tevila na intervalu med 3 in Y.
public class vaja_3 {

	public static void main(String[] args) {
		Scanner vhod = new Scanner(System.in);
		
		System.out.print("Vnesi �tevilo, ki se uporabi za se�tevek vsakega tistega �tevila: ");
		int x = vhod.nextInt();
		System.out.print("Vnesi �tevilo za konec intervala: ");
		int y = vhod.nextInt();;
		int v = 0;
		int h = x-1;
		
		for(int i=4; i<y; i++)
		{
			h++;
			if(h==x)
			{
				v=v+i;
				h=0;
			}
		}
		System.out.print("Vsota vsakega "+x+" �tevila je: "+v);
	}
}
