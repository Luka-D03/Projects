package naloge20_1;
	//Napi�i program, ki prebere dve �tevili in izpi�e njun produkt.
import java.util.Scanner;

public class vaja_1 {

	public static void main(String[] args) {
		Scanner vhod = new Scanner(System.in);
		
		System.out.print("Vnesi prvo �t.: ");
		int prvo = vhod.nextInt();
		System.out.print("Vnesi drugo �t.: ");
		int drugo = vhod.nextInt();
		
		prvo = prvo * drugo;
		
		System.out.println("Produkt �tevil je: "+ prvo);
	}

}
