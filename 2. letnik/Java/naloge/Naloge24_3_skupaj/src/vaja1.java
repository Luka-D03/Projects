
public class vaja1 {
//Napi?i program, ki izpi?e vsoto lihih ?tevil na intervalu med 2 in 35 in ?tevila deljiv s tri med 9 in 18.
	public static void main(String[] args) {
		
		int vsota = 0;
		
		System.out.println("?tevila deljiva s 3 so: ");
		for(int i = 3; i<35; i++)
		{
			if(i % 2 == 1)
			{
				vsota += i;
			}
			
			if(i > 9 && i < 18)
			{
				if(i % 3 == 0)
				{
					System.out.println(i);
				}
			}
		}
		System.out.println("Vsota je: "+vsota);

	}

}
