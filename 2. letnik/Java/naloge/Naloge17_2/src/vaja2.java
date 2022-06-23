public class vaja2 {
//Napiši program, ki izpiše števila deljiva s 3 in hkrati s 5 in vsoto števil na intervalu med 3 in 53.
	
	public static void main(String[] args) {
		
		int vsota = 0;
		
		for(int i = 4; i<53; i++)
		{
			if(i % 3 == 0 & i % 5 == 0)
			{
				System.out.println("Števila deljiva s 3 in hkrati s 5 so: "+i);
			}
			vsota = vsota + i;
		}
		
		System.out.print("Vsota števil je: "+vsota);
		
	}

}
