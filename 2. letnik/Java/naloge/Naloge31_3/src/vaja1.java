import java.util.Scanner;

//Napi�i program, ki prebere dolo�eno �tevilo vnosov (to mu dolo�imo na za�etku - vnesi �tevilo vnosov). 
//Nato izpi�e prebrana �tevila, ki so deljiva s �tevilko �tevila vnosov, ki smo jo dolo�ili na za�etku.

public class vaja1 {

	public static void main(String[] args) {
		try (Scanner in = new Scanner(System.in)) {
			
			System.out.print("Vnesi �tevilo vnosov: ");
			int z = in.nextInt();
			
			for(int i = 1; i <= z; i++) {
				
				System.out.print("Vnesi "+i+". �tevilo: ");
				int x = in.nextInt();
				
				if(x % z == 0) {
					System.out.println("�tevilo "+x+" je deljivo z "+z);
				}
				
			}
			
		}

	}

}
