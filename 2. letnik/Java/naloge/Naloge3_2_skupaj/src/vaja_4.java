import java.util.Scanner;

public class vaja_4 {
	//Napiši program, ki prebere dve števili. Ti dve števili vzame za meji intervala. 
	//Bodi pozoren, da manjše prebrano število vzameš za spodnjo mejo, veèje prebrano pa za zgornjo mejo intervala (preveri s pomoèjo if stavka!). 
	//Vsako tretje število na intervalu sešteje in izpiše rezultat. 
	public static void main(String[] args) {
		Scanner vhod = new Scanner(System.in);
		
		System.out.print("Vnesi prvo število: ");
		int x = vhod.nextInt();
		System.out.print("Vnesi drugo število: ");
		int y = vhod.nextInt();
		int h = 2;
		int v = 0;
		
		if(y>x)
		{
			x++;
			for(x = x; x<y; x++)
			{
				h++;
				if(h == 3)
				{
					v = v + x;
					h = 0;
				}
			}
		}
		
		if(x>y)
		{
			y++;
			for(y = y; y<x; y++)
			{
				h++;
				if(h == 3)
				{
					v = v + y;
					h = 0;
				}
			}
		}
		System.out.print("Seštevek vsakega trtjega števila na intervalu je: "+v);
	}

}
