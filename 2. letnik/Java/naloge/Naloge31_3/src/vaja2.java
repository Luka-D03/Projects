import java.util.Scanner;

//Napi�i program, ki prebere osem �tevil in preveri, ali je posamezno �tevilo deljivo s 3.
//Izmed �tevil deljivih s 3 izpi�e �tevila, ki so deljiva z 2 in niso deljiva s 5.

public class vaja2 {

	public static void main(String[] args) {
		try (Scanner in = new Scanner(System.in)) {
			
			for(int i = 1; i <= 8; i++) {
				
				System.out.print("Vnesi "+i+". �tevilo: ");
				int x = in.nextInt();
				
				if(x % 3 == 0) {
					if(x % 2 == 0 && x % 5 != 0) {
						System.out.println("�tevilo "+x+" je deljivo z 2 in s 3 in ni deljivo s 5");
					}
						
				}
				
			}
			
		}

	}

}
