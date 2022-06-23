
public class vaja_1 {
	//Napiši program, ki izpiše števila in vsoto števil na intervalu med 3 in 23.
	public static void main(String[] args) {
		
		int v = 0;
		
		System.out.println("Števila med 3 in 23 so:");
		
		for(int i = 4; i<23; i++)
		{
			System.out.print(i+" ");
			v = v + i;
		}
		System.out.println();
		System.out.print("Vsota števil med 3 in 23 je: "+v);
		
	}

}
