import java.util.Scanner;
//Napi�i program, ki prebere tri �tevila in preveri, ali je posamezno �tevilo deljivo s 3. Na koncu izpi�e tekst: �tevila deljiva s tri so: (in izpi�e ta �tevila).
public class vaja_2 {

	public static void main(String[] args) {
		Scanner vhod = new Scanner (System.in);
		
		System.out.print("Vnesi prvo �tevilo: ");
		int a = vhod.nextInt();
		System.out.print("Vnesi drugo �tevilo: ");
		int b = vhod.nextInt();
		System.out.print("Vnesi tretje �tevilo: ");
		int c = vhod.nextInt();
		
		int x = a;
		int y = b;
		int z = c;
		
		if(x % 3 == 0 && y % 3 == 0 && z % 3 == 0)
		{
			System.out.print("Vne�ena �tevila, ki so deljiva s 3 so: "+x+", "+y+", "+z+".");
		}
		
		if(x % 3 == 0 && y % 3 == 0 && z % 3 != 0)
		{
			System.out.print("Vne�ena �tevila, ki so deljiva s 3 so: "+x+", "+y+".");
		}
		
		if(x % 3 == 0 && y % 3 != 0 && z % 3 == 0)
		{
			System.out.print("Vne�ena �tevila, ki so deljiva s 3 so: "+x+", "+z+".");
		}
		
		if(x % 3 != 0 && y % 3 == 0 && z % 3 == 0)
		{
			System.out.print("Vne�ena �tevila, ki so deljiva s 3 so: "+y+", "+z+".");
		}
		
		if(x % 3 == 0 && y % 3 != 0 && z % 3 != 0)
		{
			System.out.print("Vne�ena �tevila, ki so deljiva s 3 so: "+x+".");
		}
		
		if(x % 3 != 0 && y % 3 != 0 && z % 3 == 0)
		{
			System.out.print("Vne�ena �tevila, ki so deljiva s 3 so: "+z+".");
		}
		
		if(x % 3 != 0 && y % 3 == 0 && z % 3 != 0)
		{
			System.out.print("Vne�ena �tevila, ki so deljiva s 3 so: "+y+".");
		}
		
		if(x % 3 != 0 && y % 3 != 0 && z % 3 != 0)
		{
			System.out.print("Nobeno vneseno �tevilo ni deljivo s 3.");
		}

	}

}
