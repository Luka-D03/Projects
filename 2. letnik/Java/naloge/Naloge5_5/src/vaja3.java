import java.util.Scanner;

public class vaja3 {
//Napi�i program, ki prebere dve �tevili, ki morata biti manj�i od 45,
//njuna razlika pa ve�ja od 9 in prvo �tevilo manj�e od drugega. V primeru, da to ne dr�i
//izpi�e, da je pri�lo do napake. �tevila na intervalu med prebranima �teviloma se�teje
//in izpi�e vsoto in srednjo vrednost.
	public static void main(String[] args) {
		try (Scanner vhod = new Scanner(System.in)) {
			
			int razlika = 0, vsota = 0, srednja_vrednost = 0;
			
			System.out.print("Vnesi prvo �tevilo: ");
			int x = vhod.nextInt();
			System.out.print("Vnesi drugo �tevilo: ");
			int y = vhod.nextInt();
			
			if(x < 45 && y < 45) {
				razlika = y - x;
				if(razlika > 9) {
					for(x = x + 1; x < y; x++) {
						vsota += x;
						srednja_vrednost++;
					}
					System.out.println("Vsota je: "+vsota);
					srednja_vrednost = vsota / srednja_vrednost;
					System.out.println("Srednja vrednost je: "+srednja_vrednost);
				} else {
					System.out.print("Pri�lo je do napake!");
				}
			} else {
				System.out.print("Pri�lo je do napake!");
			}
		}
	}
}
