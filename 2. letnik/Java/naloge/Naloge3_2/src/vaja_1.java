import java.util.Scanner;
//Napi�i program, ki prebere dolo�eno �tevilo vnosov (to mu dolo�imo na za�etku - vnesi �tevilo vnosov). Nato izpi�e vnos in zaporedno �tevilko vnosa.
public class vaja_1 {

	public static void main(String[] args) {
		Scanner vhod = new Scanner (System.in);
		
		System.out.println("Koliko �tevil boste vnesili?");
		int y = vhod.nextInt();
		int a = 1;
		
		for(int i = 1; i<=y; i++)
		{
			System.out.print("Vnesi "+a+". �tevilo: ");
			int x = vhod.nextInt();
			System.out.print("Va�e "+a+". je: "+x);
			System.out.println();
			a++;
		}

	}

}
