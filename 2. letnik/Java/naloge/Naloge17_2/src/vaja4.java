import java.util.Scanner;

public class vaja4 {
//Napiši program, ki izpiše vsako tretje število na intervalu med X in Y oziroma Y in X (glede na to katero izmed števil je veèje!).
	
	public static void main(String[] args) {
		Scanner vhod = new Scanner (System.in);
		
		System.out.print("Vnesi 1. število: ");
		int x = vhod.nextInt();
		
		System.out.print("Vnesi 2. število: ");
		int y = vhod.nextInt();
		
		int h = 2;
		
		System.out.print("Vsako tretje število na intervalu je: ");
		
		if(x>y)
		{
			for(y = y + 1; y<x; y++)
			{
				h++;
				if(h == 3)
				{
					System.out.println();
					System.out.println(y);
					h = 0;
				}
			}
		}
		
		if(y>x)
		{
			for(x = x + 1; x<y; x++)
			{
				h++;
				if(h == 3)
				{
					System.out.println();
					System.out.println(x);
					h = 0;
				}
			}
		}
	}

}
