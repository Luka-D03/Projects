package naloge20_1;
	//Napi�i program, ki izpi�e vsoto vsakega petega �tevila na intervalu med 1 in 56.
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
		System.out.println("Vsota vsakega petega �tevila je: "+v);
	}
}
