import java.util.Scanner;

//Napiši program, ki prebere doloèeno število vnosov (to mu doloèimo na zaèetku - vnesi število vnosov). 
//Nato izpiše prebrana števila, ki so deljiva s številko števila vnosov, ki smo jo doloèili na zaèetku.

public class vaja1 {

	public static void main(String[] args) {
		try (Scanner in = new Scanner(System.in)) {
			
			System.out.print("Vnesi število vnosov: ");
			int z = in.nextInt();
			
			for(int i = 1; i <= z; i++) {
				
				System.out.print("Vnesi "+i+". število: ");
				int x = in.nextInt();
				
				if(x % z == 0) {
					System.out.println("Število "+x+" je deljivo z "+z);
				}
				
			}
			
		}

	}

}
