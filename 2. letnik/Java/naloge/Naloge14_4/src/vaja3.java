import java.util.Scanner;

//Napi�i program, ki prebere 11 �tevil 
//in izpi�e prva tri prebrana �tevila 
//in vsoto zadnjih petih prebranih �tevil.

public class vaja3 {

	public static void main(String[] args) {
		//scanner import
		try (Scanner yeet = new Scanner(System.in)) {
		
		//inicialzizacija
		int vsota = 0;
		
		//for loop
		for(int i = 1; i <= 11;i++/*i = i +1*/) {
			System.out.print("Vnesi "+i+". �tevilo:");
			int x = yeet.nextInt();
			
			if(i < 4) {//izpis prvih treh �tevil
				System.out.println(x+" je "+i+". �tevilo.");
			}
			
			if(i >= 7) {//ra�unanje vsote pri zadnjih petih �tevilah
				vsota += x;
			}
		}
		System.out.println("Vsota �tevil je: "+vsota);//izpis vsote
		}
	}
}
