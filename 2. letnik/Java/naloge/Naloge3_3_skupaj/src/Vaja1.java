
public class Vaja1 {
	//Napi�i program, ki izpi�e vsoto �tevil na intervalu med 2 in 39 in �tevila med 9 in 20.

	public static void main(String[] args) {
		
		int v = 0;
		
		System.out.println("�tevila med 9 in 20: ");
		
		for(int i = 3; i < 39; i++)
		{
			v = v +i;
			if(i > 9 && i < 20)
			{
				System.out.println(i);
			}
		}
		System.out.print("Vsota �tevil med 2 in 39 je: "+v);
	}

}
