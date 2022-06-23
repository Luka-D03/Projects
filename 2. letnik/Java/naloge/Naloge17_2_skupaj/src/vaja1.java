
public class vaja1 {
//Napiši program, ki izpiše vsoto števil na intervalu med 3 in 35 in števila med 23 in 35.
	public static void main(String[] args) {
		
		int vsota = 0;
		
		System.out.println("Števila med 23 in 35 so: ");
		
		for(int i = 4; i < 35; i++)
		{
			vsota = vsota + i;
			if(i > 23)
			{
				System.out.print(i+", ");
			}
		}
		System.out.println();
		System.out.println("Vsota števil je: "+vsota);

	}

}
