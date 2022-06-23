import java.util.Scanner;
//Napiši program, ki izpiše vsoto števil deljivih s 5 na intervalu med 2 in Y.
public class vaja_3 {

	public static void main(String[] args) {
		Scanner vhod = new Scanner (System.in);
		
		System.out.println("Vnesi število veèje od 3: ");
		int y = vhod.nextInt();
		int v = 0;
		
		for(int i = 3; i<=y; i++)
		{
			if(5 % i == 0)
			{
				v = v + i;
			}
		}
		System.out.print("Vsota števil deljivih s 5 je: "+v);
	}

}
