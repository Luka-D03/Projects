import java.util.Scanner;

public class vaja4 {
//Napi�i program, ki prebere 9 �tevil, najve�je prebrano �tevilo vzame za spodnjo mejo intervala, vsoto teh 9 prebranih �tevil pa za zgornjo mejo intervala. 
//Nato izpi�e povpre�no vrednost �tevil na tem intervalu.
	public static void main(String[] args) {
		Scanner vhod = new Scanner (System.in);
		
		int max = 0;
		int vsota = 0;
		int povp = 0;
		
		for(int i = 1; i <= 9; i++)
		{
			System.out.print("Vnesi "+i+". �tevilo: ");
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
		
		System.out.println("Povpre�je �tevil je: "+ povp);

	}

}
