
//Napi�i program, ki glede na vneseno �tevilo izri�e zvezdice (bodi pozoren na �tevilo presledkov pred izpisom zvezdic v vrstici in �tevilo presledkov med zvezdicami). 
//Primer �tevila 3:

// *  *  *
//  *  *
//   *
public class vaja4 {

	public static void main(String[] args) {
		int z = 4;
		int y = 1;
		
		for(int i = 1; i <= 3; i++)
		{
			for(int x = 1; x <= y; x++)
			{
				System.out.print(" ");
			}
			y++;
			for(int j = 1; j < z; j++)
			{
				System.out.print("* ");
			}
			z--;
			
			System.out.println();
		}
		
	}
}
