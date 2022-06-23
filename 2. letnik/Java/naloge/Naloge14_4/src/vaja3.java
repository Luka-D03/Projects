import java.util.Scanner;

//Napiši program, ki prebere 11 števil 
//in izpiše prva tri prebrana števila 
//in vsoto zadnjih petih prebranih števil.

public class vaja3 {

	public static void main(String[] args) {
		//scanner import
		try (Scanner yeet = new Scanner(System.in)) {
		
		//inicialzizacija
		int vsota = 0;
		
		//for loop
		for(int i = 1; i <= 11;i++/*i = i +1*/) {
			System.out.print("Vnesi "+i+". število:");
			int x = yeet.nextInt();
			
			if(i < 4) {//izpis prvih treh števil
				System.out.println(x+" je "+i+". število.");
			}
			
			if(i >= 7) {//raèunanje vsote pri zadnjih petih številah
				vsota += x;
			}
		}
		System.out.println("Vsota števil je: "+vsota);//izpis vsote
		}
	}
}
