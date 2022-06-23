import java.util.Scanner;

//Napiši program, ki prebere 7 števil in izpiše tista, ki so liha in hkrati deljiva s 5.
public class vaja2 {

	public static void main(String[] args) {
		try (Scanner vhod = new Scanner(System.in)) {
			for(int i = 1; i <= 7; i++)
			{
				System.out.print("Prosim vnesite "+i+". število: ");
				int x = vhod.nextInt();
				
				if(x % 2 == 1 && x % 5 == 0)
				{
					System.out.println();
					System.out.println(x+" je število ki je liho in hkrati deljivo s 5.");
					System.out.println();
				}
			}
		}

	}

}
