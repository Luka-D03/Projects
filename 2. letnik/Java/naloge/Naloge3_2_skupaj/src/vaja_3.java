import java.util.Scanner;

public class vaja_3 {
	//Napiši program, ki izpiše vsako X število na intervalu med X in Y.
	public static void main(String[] args) {
		Scanner vhod = new Scanner(System.in);
		
		System.out.print("Vnesi prvo število: ");
		int x = vhod.nextInt();
		System.out.print("Vnesi drugo število: ");
		int y = vhod.nextInt();
		
		System.out.println("Števila med "+x+" in "+y+" so:");
		x++;
		for(x = x; x<y; x++)
		{
			System.out.print(x+" ");
		}
		
	}

}
