import java.util.Scanner;
//Napiši program, ki prebere doloèeno število vnosov (to mu doloèimo na zaèetku - vnesi število vnosov). Nato izpiše vnos in zaporedno številko vnosa.
public class vaja_1 {

	public static void main(String[] args) {
		Scanner vhod = new Scanner (System.in);
		
		System.out.println("Koliko števil boste vnesili?");
		int y = vhod.nextInt();
		int a = 1;
		
		for(int i = 1; i<=y; i++)
		{
			System.out.print("Vnesi "+a+". število: ");
			int x = vhod.nextInt();
			System.out.print("Vaše "+a+". je: "+x);
			System.out.println();
			a++;
		}

	}

}
