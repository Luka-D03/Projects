import java.util.Scanner;

//Napiši program, ki prebere doloèeno število vnosov (to mu doloèimo na zaèetku - vnesi število vnosov). 
//Nato izpiše vsoto zaporednih številk vnosov prebranih števil, 
//ki so deljiva s 5 in vsoto teh števil.





public class vaja8 {

	public static void main(String[] args) {
		//scanner import
		try (Scanner vhod = new Scanner(System.in)) {
			
			//inicializacija
			int vsota = 0;
			int vsota1 = 0;
			System.out.print("Vnesi prvo število: ");
			int X = vhod.nextInt();
			//for loop
			for(int i = 1; i <= X; i++) {
				System.out.print("Vnesi "+i+". število:");
				int y = vhod.nextInt();
				//if loop
				if(y % 5 == 0) {
					System.out.println("Število "+y+" je deljivo s 5");
					vsota += y;
					vsota1 += i;
				}
			}
			
			System.out.println("Vsota je: "+vsota);
			System.out.println("Vsota je: "+vsota1);
		}
	}
}
