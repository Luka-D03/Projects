package naloge20_1;
	//Napiši program, ki izpiše vsoto vsakega petega števila na intervalu med 1 in 56.
public class vaja_2 {

	public static void main(String[] args) {
		int v=0;
		int x=4;
		
		for(int i=2; i<56; i++)
		{
			x++;
			if(x==5)
			{
				v=v+i;
				x=0;
			}
		}
		System.out.println("Vsota vsakega petega števila je: "+v);
	}
}
