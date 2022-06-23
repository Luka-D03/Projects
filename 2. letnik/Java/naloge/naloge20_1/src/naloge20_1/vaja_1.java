package naloge20_1;
	//Napiši program, ki prebere dve števili in izpiše njun produkt.
import java.util.Scanner;

public class vaja_1 {

	public static void main(String[] args) {
		Scanner vhod = new Scanner(System.in);
		
		System.out.print("Vnesi prvo št.: ");
		int prvo = vhod.nextInt();
		System.out.print("Vnesi drugo št.: ");
		int drugo = vhod.nextInt();
		
		prvo = prvo * drugo;
		
		System.out.println("Produkt števil je: "+ prvo);
	}

}
