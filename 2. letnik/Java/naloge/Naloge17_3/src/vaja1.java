//Napiši program, ki izpiše vsako drugo število med 3 in 43 in vsoto teh števil na intervalu
public class vaja1 {

	public static void main(String[] args) {
		
		int x = 1;
		int vsota = 0;
		
		System.out.println("Vsako drugo število je: ");
		
		for(int i = 4; i < 43; i++)
		{
			x++;
			if(x == 2)
			{
				System.out.println(i);
				x = 0;
			}
			vsota += i;
		}
		System.out.println("Vsota števil je:"+vsota);

	}

}
