
public class vaja_1 {
	//Napi�i program, ki izpi�e �tevila in vsoto �tevil na intervalu med 3 in 23.
	public static void main(String[] args) {
		
		int v = 0;
		
		System.out.println("�tevila med 3 in 23 so:");
		
		for(int i = 4; i<23; i++)
		{
			System.out.print(i+" ");
			v = v + i;
		}
		System.out.println();
		System.out.print("Vsota �tevil med 3 in 23 je: "+v);
		
	}

}
