import java.util.Scanner;

//Napiši program, ki izpiše vsoto števil deljivih z X, 2 in 5 na intervalu med 2 in Y+3.

public class vaja3 {

	public static void main(String[] args) {
		try (Scanner in = new Scanner(System.in)) {
			
			int vsota = 0;
			
			System.out.print("Vnesi prvo poljubno število: ");
			int x = in.nextInt();
			
			System.out.print("Vnesi prvo poljubno število: ");
			int y = in.nextInt();
			
			for(int i = 2; i < y + 2; i++) {
				
				if(i % x == 0) {
					vsota += i;
				}
				else {
					if(i % 2 == 0) {	
						vsota += i;
					}
					else {
						if(i % 5 == 0) {
							vsota += i;
						}
						
					}
					
				}

			}
			
			System.out.print("Vsota je: "+vsota);

		}

	}

}
