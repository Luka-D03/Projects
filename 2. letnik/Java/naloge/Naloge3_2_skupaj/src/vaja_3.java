import java.util.Scanner;

public class vaja_3 {
	//Napi�i program, ki izpi�e vsako X �tevilo na intervalu med X in Y.
	public static void main(String[] args) {
		Scanner vhod = new Scanner(System.in);
		
		System.out.print("Vnesi prvo �tevilo: ");
		int x = vhod.nextInt();
		System.out.print("Vnesi drugo �tevilo: ");
		int y = vhod.nextInt();
		
		System.out.println("�tevila med "+x+" in "+y+" so:");
		x++;
		for(x = x; x<y; x++)
		{
			System.out.print(x+" ");
		}
		
	}

}
