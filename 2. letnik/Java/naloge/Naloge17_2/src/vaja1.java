import java.util.Scanner;

public class vaja1 {
//Napi�i program, ki izpi�e �tevila in vsoto �tevil na intervalu med X in 53. 
	
	public static void main(String[] args) {
		Scanner vhod = new Scanner (System.in);
		
		System.out.print("Vnesi �tevilo manj�e od 53: ");
		int x = vhod.nextInt();
		int vsota = 0;
		System.out.println();
		for(x = x + 1; x < 53; x++)
		{
			System.out.println("Stevilo na intervalu je : "+x);
			vsota = vsota + x;
		}
		
		System.out.print("Vsota �tevil je: "+vsota);
		
	}

}
