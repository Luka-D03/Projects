import java.util.Scanner;

public class naloga2 {
//Napi?i program, ki prebere 8 ?tevil in izpi?e tista, ki so deljiva hkrati z 2 in s 5 in ne s 3.

	public static void main(String[] args) {
		try(Scanner vhod = new Scanner(System.in)){
		
			for(int i = 1; i <= 8; i++) {//interval, ki prebira vnesena ?tevila
				
				System.out.print("Vnesi "+i+". ?tevilo: ");//branje ?tevil
				int x = vhod.nextInt();//branje ?tevil
				
				if(x % 2 == 0 && x % 5 == 0 && x % 3 != 0) {//preverjanje deljivosti in izpis
					System.out.println("?tevilo "+x+" je deljivo z 2 in s 5 in ni deljivo s 3");
				}
			}
		}
	}
}
