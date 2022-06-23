import java.util.Scanner;

//Napiši program, ki prebere osem števil in preveri, ali je posamezno število deljivo s 3.
//Izmed števil deljivih s 3 izpiše števila, ki so deljiva z 2 in niso deljiva s 5.

public class vaja2 {

	public static void main(String[] args) {
		try (Scanner in = new Scanner(System.in)) {
			
			for(int i = 1; i <= 8; i++) {
				
				System.out.print("Vnesi "+i+". število: ");
				int x = in.nextInt();
				
				if(x % 3 == 0) {
					if(x % 2 == 0 && x % 5 != 0) {
						System.out.println("Število "+x+" je deljivo z 2 in s 3 in ni deljivo s 5");
					}
						
				}
				
			}
			
		}

	}

}
