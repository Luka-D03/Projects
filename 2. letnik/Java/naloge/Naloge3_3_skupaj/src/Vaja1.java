
public class Vaja1 {
	//Napiši program, ki izpiše vsoto števil na intervalu med 2 in 39 in števila med 9 in 20.

	public static void main(String[] args) {
		
		int v = 0;
		
		System.out.println("Števila med 9 in 20: ");
		
		for(int i = 3; i < 39; i++)
		{
			v = v +i;
			if(i > 9 && i < 20)
			{
				System.out.println(i);
			}
		}
		System.out.print("Vsota števil med 2 in 39 je: "+v);
	}

}
