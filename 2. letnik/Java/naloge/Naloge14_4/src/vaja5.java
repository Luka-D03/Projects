import java.util.Scanner;


//Napi�i program, ki prebere tri �tevila in izpi�e najve�jega 
//in najmanj�ega. 
//Nato izpi�e vsoto �tevil na intervalu med najmanj�im 
//in najve�jim �tevilom.


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
						System.out.print("Vnesi "+i+". �tevilo:");
						int x = vhod.nextInt();
						//if loop
						if(max < x) {
							max = x;
						}
						
						if(min > x) {
							min = x;
						}
					}
					System.out.println("Najmanj�e �tevilo je: "+min+" Najve�je �tevilo je: "+max);
					//another for loop
					for(min = min + 1; min < max; min++) {
						vsota += min;
					}
					System.out.println("Vsota �tevil je: "+vsota);
		}
	}
}
