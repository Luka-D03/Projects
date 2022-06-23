import java.util.Scanner;

public class vaja3 {
//Napiši program, ki prebere dve števili, ki morata biti manjši od 45,
//njuna razlika pa veèja od 9 in prvo število manjše od drugega. V primeru, da to ne drži
//izpiše, da je prišlo do napake. Števila na intervalu med prebranima številoma sešteje
//in izpiše vsoto in srednjo vrednost.
	public static void main(String[] args) {
		try (Scanner vhod = new Scanner(System.in)) {
			
			int razlika = 0, vsota = 0, srednja_vrednost = 0;
			
			System.out.print("Vnesi prvo število: ");
			int x = vhod.nextInt();
			System.out.print("Vnesi drugo število: ");
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
					System.out.print("Prišlo je do napake!");
				}
			} else {
				System.out.print("Prišlo je do napake!");
			}
		}
	}
}
