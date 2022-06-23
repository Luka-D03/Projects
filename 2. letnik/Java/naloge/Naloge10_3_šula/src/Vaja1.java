
public class Vaja1 {
//Napiši program, ki izpiše vsoto vsakega drugega števila na intervalu med 4 in 37 in števila med 12 in 20.
	public static void main(String[] args) {
		
		int vsota = 0;
		int r = 1;
		
		System.out.println("Števila med 12 in 20 so: ");
		
		for(int i = 5; i < 37; i++)
		{
			r++;
			if(r == 2)
			{
				vsota += i;
				r = 0;
			}
			
			if(i > 12 && i < 20)
			{
				System.out.println(i);
			}
			
		}
		System.out.println("Vsota je: "+vsota);

	}

}
