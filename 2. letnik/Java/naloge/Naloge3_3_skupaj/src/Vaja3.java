import java.util.Scanner;

public class Vaja3 {
	//Napiši program, ki prebere 12 števil, najveèje prebrano število vzame za spodnjo mejo intervala, 
	//vsoto prvih šestih prebranih števil pa za zgornjo mejo intervala. 
	//Nato izpiše vsoto na tem intervalu.


	public static void main(String[] args) {
		
		Scanner vhod = new Scanner(System.in);
		
		int spodnja = -999999999;
		int zgornja = 0;
		int v = 0;
		
		for(int i = 1; i <= 12; i++)
		{
			System.out.print("Vnesi "+i+". število: ");
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
		System.out.print("Vsota števil med "+spodnja+" in "+zgornja+" je: ");
		
		for(int y = spodnja + 1; y < zgornja; y++)
		{
			v = v + y;
		}
		System.out.print(v);
	}

}
