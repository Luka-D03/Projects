public class vaja2 {
//Napi�i program, ki izpi�e �tevila deljiva s 3 in hkrati s 5 in vsoto �tevil na intervalu med 3 in 53.
	
	public static void main(String[] args) {
		
		int vsota = 0;
		
		for(int i = 4; i<53; i++)
		{
			if(i % 3 == 0 & i % 5 == 0)
			{
				System.out.println("�tevila deljiva s 3 in hkrati s 5 so: "+i);
			}
			vsota = vsota + i;
		}
		
		System.out.print("Vsota �tevil je: "+vsota);
		
	}

}
