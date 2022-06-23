import java.util.Scanner;
//Napiši program, ki prebere tri števila in preveri, ali je posamezno število deljivo s 3. Na koncu izpiše tekst: Števila deljiva s tri so: (in izpiše ta števila).
public class vaja_2 {

	public static void main(String[] args) {
		Scanner vhod = new Scanner (System.in);
		
		System.out.print("Vnesi prvo število: ");
		int a = vhod.nextInt();
		System.out.print("Vnesi drugo število: ");
		int b = vhod.nextInt();
		System.out.print("Vnesi tretje število: ");
		int c = vhod.nextInt();
		
		int x = a;
		int y = b;
		int z = c;
		
		if(x % 3 == 0 && y % 3 == 0 && z % 3 == 0)
		{
			System.out.print("Vnešena števila, ki so deljiva s 3 so: "+x+", "+y+", "+z+".");
		}
		
		if(x % 3 == 0 && y % 3 == 0 && z % 3 != 0)
		{
			System.out.print("Vnešena števila, ki so deljiva s 3 so: "+x+", "+y+".");
		}
		
		if(x % 3 == 0 && y % 3 != 0 && z % 3 == 0)
		{
			System.out.print("Vnešena števila, ki so deljiva s 3 so: "+x+", "+z+".");
		}
		
		if(x % 3 != 0 && y % 3 == 0 && z % 3 == 0)
		{
			System.out.print("Vnešena števila, ki so deljiva s 3 so: "+y+", "+z+".");
		}
		
		if(x % 3 == 0 && y % 3 != 0 && z % 3 != 0)
		{
			System.out.print("Vnešena števila, ki so deljiva s 3 so: "+x+".");
		}
		
		if(x % 3 != 0 && y % 3 != 0 && z % 3 == 0)
		{
			System.out.print("Vnešena števila, ki so deljiva s 3 so: "+z+".");
		}
		
		if(x % 3 != 0 && y % 3 == 0 && z % 3 != 0)
		{
			System.out.print("Vnešena števila, ki so deljiva s 3 so: "+y+".");
		}
		
		if(x % 3 != 0 && y % 3 != 0 && z % 3 != 0)
		{
			System.out.print("Nobeno vneseno število ni deljivo s 3.");
		}

	}

}
