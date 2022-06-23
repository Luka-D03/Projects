import java.util.Scanner;

public class vaja4 {
//Napiši program, ki prebere 9 števil, najveèje prebrano število vzame za spodnjo mejo intervala, vsoto teh 9 prebranih števil pa za zgornjo mejo intervala. 
//Nato izpiše povpreèno vrednost števil na tem intervalu.
	public static void main(String[] args) {
		Scanner vhod = new Scanner (System.in);
		
		int max = 0;
		int vsota = 0;
		int povp = 0;
		
		for(int i = 1; i <= 9; i++)
		{
			System.out.print("Vnesi "+i+". število: ");
			int x = vhod.nextInt();
			
			if(x > max)
			{
				max = x;
			}
			vsota = vsota + x;
		}
		
		for(max = max+1; max < vsota; max++)
		{
			povp = povp + max;
		}
		povp = povp % 9;
		
		System.out.println("Povpreèje števil je: "+ povp);

	}

}
