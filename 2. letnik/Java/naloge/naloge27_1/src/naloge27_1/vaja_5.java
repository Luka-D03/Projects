package naloge27_1;

import java.util.Scanner;
//Napiši program, ki izpiše srednjo vrednost X prebranih števil.
public class vaja_5 {

	public static void main(String[] args) {
		Scanner vhod = new Scanner(System.in);
		
		System.out.println("Koliko število boste vnesili?");
		int z = vhod.nextInt();
		int y = 1;
		int v = 0;
		
		for(int i = 1; i<=z;i++)
		{
			System.out.print("vnesite "+y+". število: ");
			int x = vhod.nextInt();
			y++;
			v = v+x;
		}
		
		v = v/z;
		System.out.print("Povprecje vnesenih števil je: "+v);
	}
}
