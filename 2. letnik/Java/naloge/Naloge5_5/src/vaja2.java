import java.util.Scanner;

public class vaja2 {
//Napiši program, ki prebere 5 števil in izpiše tista, ki so deljiva hkrati z 2 in s 3.
	public static void main(String[] args) {
		try (Scanner vhod = new Scanner(System.in)) {
			for(int i = 1; i <= 5; i++) {
				System.out.print("Vnesi "+i+". število:");
				int x = vhod.nextInt();
				
				if(x % 2 == 0 && x % 3 == 0) {
					System.out.println("Število "+x+" je deljivo z 2 in s 3");
				}
			}
		}
	}

}
