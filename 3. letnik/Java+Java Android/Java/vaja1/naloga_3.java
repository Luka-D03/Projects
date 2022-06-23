import java.util.Scanner;

//Napiši program, ki prebere dve števili, ki morata biti manjši od 45, 
//njuna razlika pa večja od 9 in prvo število manjše od drugega. V primeru, da to ne drži
//izpiše, da je prišlo do napake. števila na intervalu med prebranima številoma sešteje
//in izpiše vsoto in srednjo vrednost.
public class naloga_3 {
    public static void main(String[] args) {
        Scanner vhod = new Scanner(System.in);
        
        System.out.print("vnesi število: ");
        int x = vhod.nextInt();
        System.out.print("vnesi število: ");
        int y = vhod.nextInt();
        int w = 0, v = 0, s = 0, a = 0;
        if (y > x) {
            w = y - x;
        }
        if (x < 45 && y < 45 && w > 9) {
            for(x = x + 1; x < y; x++) {
                v += x;
                a++;
            }
            s = v / a;
            System.out.println("Vsota števil je: "+v);
            System.out.println("Srednja vrednost števil je: "+s);
        } else {
            System.out.println("Prišlo je do napake!");
        }
    }
}
