import java.util.Scanner;

//Napi�i program, ki izpi�e �tevila deljiva z X
//izmed petnajstih prebranih �tevil. 
//Pri tem izpi�e vsoto tistih izpisanih �tevil, 
//ki niso deljiva z Y.




public class vaja7 {

	public static void main(String[] args) {
		//scanner import
		try (Scanner vhod = new Scanner(System.in)) {
			
			//inicializacija
			int vsota = 0;
			System.out.print("Vnesi prvo �tevilo: ");
			int X = vhod.nextInt();
			System.out.print("Vnesi drugo �tevilo: ");
			int Y = vhod.nextInt();
			//for loop
			for(int i = 1; i <= 15; i++) {
				//vnos �tevil
				System.out.print("Vnesi "+i+". �tevilo:");
				int D = vhod.nextInt();
				//if loop
				if(D % X == 0) {
					System.out.println("�tevilo "+D+" je deljivo z "+X);
				}
				
				if(D % Y != 0) {
					vsota += D;
				}
				
			}
			System.out.println("Vsota je: "+vsota);
		}
	}
}
