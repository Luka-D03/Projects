import java.util.Scanner;


//Napiši program, ki prebere tri števila in izpiše najveèjega 
//in najmanjšega. 
//Nato izpiše vsoto števil na intervalu med najmanjšim 
//in najveèjim številom.


public class vaja5 {

	public static void main(String[] args) {
		//scanner import
				try (Scanner vhod = new Scanner(System.in)) {
				
					//inicializacija
					int max = -9999999;
					int min = 9999999;
					int vsota = 0;
					//for loop
					for(int i = 1; i <= 3; i++) {
						System.out.print("Vnesi "+i+". število:");
						int x = vhod.nextInt();
						//if loop
						if(max < x) {
							max = x;
						}
						
						if(min > x) {
							min = x;
						}
					}
					System.out.println("Najmanjše število je: "+min+" Najveèje število je: "+max);
					//another for loop
					for(min = min + 1; min < max; min++) {
						vsota += min;
					}
					System.out.println("Vsota števil je: "+vsota);
		}
	}
}
