package naloge20_1;

import java.util.Scanner;

//Napi�i program, ki izpi�e srednjo vrednost petih prebranih �tevil.
public class vaja_5 {

	public static void main(String[] args) {
		
		Scanner vhod = new Scanner(System.in);
		
		int i = 1;
		int v = 0;
		System.out.print("Vnesi "+i+". �tevilo: ");
		int x = vhod.nextInt();
		i++;
		v = v+x;
		System.out.print("Vnesi "+i+". �tevilo: ");
		int y = vhod.nextInt();
		i++;
		v = v+y;
		System.out.print("Vnesi "+i+". �tevilo: ");
		int z = vhod.nextInt();
		i++;
		v = v+z;
		System.out.print("Vnesi "+i+". �tevilo: ");
		int a = vhod.nextInt();
		i++;
		v = v+a;
		System.out.print("Vnesi "+i+". �tevilo: ");
		int d = vhod.nextInt();
		v = v+d;
		
		v = v/i;
		System.out.print("Srednja vrednost vnesenih �tevil je: "+v);
		
		
	}
}
