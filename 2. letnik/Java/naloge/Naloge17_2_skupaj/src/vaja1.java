
public class vaja1 {
//Napi�i program, ki izpi�e vsoto �tevil na intervalu med 3 in 35 in �tevila med 23 in 35.
	public static void main(String[] args) {
		
		int vsota = 0;
		
		System.out.println("�tevila med 23 in 35 so: ");
		
		for(int i = 4; i < 35; i++)
		{
			vsota = vsota + i;
			if(i > 23)
			{
				System.out.print(i+", ");
			}
		}
		System.out.println();
		System.out.println("Vsota �tevil je: "+vsota);

	}

}
