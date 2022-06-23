import java.util.Scanner;

//Napiši program, ki izpiše števila deljiva z X
//izmed petnajstih prebranih števil. 
//Pri tem izpiše vsoto tistih izpisanih števil, 
//ki niso deljiva z Y.




public class vaja7 {

	public static void main(String[] args) {
		//scanner import
		try (Scanner vhod = new Scanner(System.in)) {
			
			//inicializacija
			int vsota = 0;
			System.out.print("Vnesi prvo število: ");
			int X = vhod.nextInt();
			System.out.print("Vnesi drugo število: ");
			int Y = vhod.nextInt();
			//for loop
			for(int i = 1; i <= 15; i++) {
				//vnos števil
				System.out.print("Vnesi "+i+". število:");
				int D = vhod.nextInt();
				//if loop
				if(D % X == 0) {
					System.out.println("Število "+D+" je deljivo z "+X);
				}
				
				if(D % Y != 0) {
					vsota += D;
				}
				
			}
			System.out.println("Vsota je: "+vsota);
		}
	}
}
