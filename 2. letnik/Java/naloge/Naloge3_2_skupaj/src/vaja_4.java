import java.util.Scanner;

public class vaja_4 {
	//Napi�i program, ki prebere dve �tevili. Ti dve �tevili vzame za meji intervala. 
	//Bodi pozoren, da manj�e prebrano �tevilo vzame� za spodnjo mejo, ve�je prebrano pa za zgornjo mejo intervala (preveri s pomo�jo if stavka!). 
	//Vsako tretje �tevilo na intervalu se�teje in izpi�e rezultat. 
	public static void main(String[] args) {
		Scanner vhod = new Scanner(System.in);
		
		System.out.print("Vnesi prvo �tevilo: ");
		int x = vhod.nextInt();
		System.out.print("Vnesi drugo �tevilo: ");
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
		System.out.print("Se�tevek vsakega trtjega �tevila na intervalu je: "+v);
	}

}
