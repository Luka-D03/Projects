package naloge27_1;

import java.util.Scanner;
//Napi�i program, ki izpi�e srednjo vrednost X prebranih �tevil.
public class vaja_5 {

	public static void main(String[] args) {
		Scanner vhod = new Scanner(System.in);
		
		System.out.println("Koliko �tevilo boste vnesili?");
		int z = vhod.nextInt();
		int y = 1;
		int v = 0;
		
		for(int i = 1; i<=z;i++)
		{
			System.out.print("vnesite "+y+". �tevilo: ");
			int x = vhod.nextInt();
			y++;
			v = v+x;
		}
		
		v = v/z;
		System.out.print("Povprecje vnesenih �tevil je: "+v);
	}
}
