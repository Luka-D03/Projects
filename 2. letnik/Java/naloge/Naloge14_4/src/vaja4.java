import java.util.Scanner;

//Napi�i program, ki prebere X �tevil in izpi�e �tevila, 
//ki so deljiva s 5 in 3.



public class vaja4 {

	public static void main(String[] args) {
		//scanner import
				try (Scanner yeet = new Scanner(System.in)) {
				
					//inicializacija
					System.out.println("Koliko �tevil vnesemo?");
					int x = yeet.nextInt();
					//for loop
					for(int i = 1; i <= x; i++) {
						
						System.out.print("Vnesi "+i+". �tevilo:");
						int y = yeet.nextInt();
						
						//if loop
						if(y % 5 == 0 && y % 3 == 0) {
							System.out.println("�tevilo "+y+" je deljivo s 3 in 5");
						}
					}
		}
	}
}
