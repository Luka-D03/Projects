import java.util.Scanner;

//Napiši program, ki prebere 9 števil in izpiše tista, ki so deljiva hkrati s 5 in 7 in niso deljiva z 9.
public class vaja2 {

	public static void main(String[] args) {
		try(Scanner vhod = new Scanner(System.in)) {
			
			for(int i = 1; i <= 9; i++) {
				System.out.print("Vnesi "+i+". število: ");
				int x = vhod.nextInt();
				
				if(x % 5 == 0 && x % 7 == 0 && x % 9 != 0) {
					System.out.println("Število "+x+" je deljivo s 5 in 7 in ni deljivo z 9");
				}
			}
			
		}

	}

}
