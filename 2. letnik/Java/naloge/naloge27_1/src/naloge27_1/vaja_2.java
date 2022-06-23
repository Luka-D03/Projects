package naloge27_1;

import java.util.Scanner;

public class vaja_2 {
//Napiši program, ki izpiše števila na intervalu med X in 23.
	public static void main(String[] args) {
		Scanner vhod = new Scanner(System.in);
		
		System.out.print("Vnesi poljubno število: ");
		int x = vhod.nextInt();
		
		x++;
		System.out.println("Števila med vnesenim številom in številom 23:");
		for(x = x;x<23;x++)
		{
			System.out.println(x);
		}			
	}
}
