import java.util.Scanner;

//Napiši program, ki prebere 5 števil in izpiše tista, ki so deljiva hkrati z 2 in s 3.
public class naloga_2 {
    public static void main(String[] args) {
        Scanner vhod = new Scanner(System.in);

        for(int i = 0; i < 5; i++) {
            System.out.print("vnesi število: ");
            int a = vhod.nextInt();
            if(a % 2 == 0 && a % 3 == 0) {
                System.out.println("Število "+a+" je deljivo z 2 in s 3");
            }
        }
    }
}
