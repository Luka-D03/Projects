//Napi�i program, ki izpi�e vsako drugo �tevilo med 3 in 43 in vsoto teh �tevil na intervalu
public class vaja1 {

	public static void main(String[] args) {
		
		int x = 1;
		int vsota = 0;
		
		System.out.println("Vsako drugo �tevilo je: ");
		
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
		System.out.println("Vsota �tevil je:"+vsota);

	}

}
