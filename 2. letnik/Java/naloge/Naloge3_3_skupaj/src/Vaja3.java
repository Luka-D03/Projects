import java.util.Scanner;

public class Vaja3 {
	//Napi�i program, ki prebere 12 �tevil, najve�je prebrano �tevilo vzame za spodnjo mejo intervala, 
	//vsoto prvih �estih prebranih �tevil pa za zgornjo mejo intervala. 
	//Nato izpi�e vsoto na tem intervalu.


	public static void main(String[] args) {
		
		Scanner vhod = new Scanner(System.in);
		
		int spodnja = -999999999;
		int zgornja = 0;
		int v = 0;
		
		for(int i = 1; i <= 12; i++)
		{
			System.out.print("Vnesi "+i+". �tevilo: ");
			int x = vhod.nextInt();
			
			if(x > spodnja)
			{
				spodnja = x;
			}
			
			if(i <= 6)
			{
				zgornja = zgornja + x;
			}
		}
		System.out.print("Vsota �tevil med "+spodnja+" in "+zgornja+" je: ");
		
		for(int y = spodnja + 1; y < zgornja; y++)
		{
			v = v + y;
		}
		System.out.print(v);
	}

}
