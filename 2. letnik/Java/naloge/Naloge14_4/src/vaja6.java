import java.util.Scanner;

//Napi�i program, ki izpi�e �tevila 
//in vsoto �tevil deljivih s 5 na intervalu med X in 34. 



public class vaja6 {

	public static void main(String[] args) {
		//scanner import
		try (Scanner vhod = new Scanner(System.in)) {
			
			//inicializacija
			int vsota = 0;
			System.out.print("Vnesi �tevilo: ");
			int X = vhod.nextInt();
			//for loop
			for(int i = X + 1; i < 34; i++) {
				if(i % 5 == 0) {
					vsota += i;
				}
				System.out.println(i);
			}
			System.out.println("Vsota je: "+vsota);
		}
	}
}
