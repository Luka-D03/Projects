import java.util.Scanner;

//Napi�i program, ki prebere dolo�eno �tevilo vnosov (to mu dolo�imo na za�etku - vnesi �tevilo vnosov). 
//Nato izpi�e vsoto zaporednih �tevilk vnosov prebranih �tevil, 
//ki so deljiva s 5 in vsoto teh �tevil.





public class vaja8 {

	public static void main(String[] args) {
		//scanner import
		try (Scanner vhod = new Scanner(System.in)) {
			
			//inicializacija
			int vsota = 0;
			int vsota1 = 0;
			System.out.print("Vnesi prvo �tevilo: ");
			int X = vhod.nextInt();
			//for loop
			for(int i = 1; i <= X; i++) {
				System.out.print("Vnesi "+i+". �tevilo:");
				int y = vhod.nextInt();
				//if loop
				if(y % 5 == 0) {
					System.out.println("�tevilo "+y+" je deljivo s 5");
					vsota += y;
					vsota1 += i;
				}
			}
			
			System.out.println("Vsota je: "+vsota);
			System.out.println("Vsota je: "+vsota1);
		}
	}
}
