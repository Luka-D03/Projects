package naloge27_1;

import java.util.Scanner;

public class vaja_2 {
//Napi�i program, ki izpi�e �tevila na intervalu med X in 23.
	public static void main(String[] args) {
		Scanner vhod = new Scanner(System.in);
		
		System.out.print("Vnesi poljubno �tevilo: ");
		int x = vhod.nextInt();
		
		x++;
		System.out.println("�tevila med vnesenim �tevilom in �tevilom 23:");
		for(x = x;x<23;x++)
		{
			System.out.println(x);
		}			
	}
}
