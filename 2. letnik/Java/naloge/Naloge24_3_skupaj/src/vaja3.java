import java.util.Scanner;

public class vaja3 {
//Napi?i program, ki prebere 14 ?tevil, najve?je prebrano ?tevilo vzame za spodnjo mejo intervala, 
//vsoto zadnjih ?estih prebranih ?tevil pa za zgornjo mejo intervala. 
//Nato izpi?e povpre?no vrednost na tem intervalu.
	public static void main(String[] args) {
		try (Scanner vhod = new Scanner(System.in)){
			
			int max = -999999999;
			int zgo_meja = 0;
			int povp = 0;
			int vsota = 0;
			
			for(int i = 1; i <= 14; i++)
			{
				System.out.print("Vnesi "+i+". ?tevilo: ");
				int x = vhod.nextInt();
				
				if(x > max)
				{
					max = x;
				}
				
				if(i > 8)
				{
					zgo_meja += x;
				}
			}
			
			for(max = max + 1; max < zgo_meja; max++)
			{
				vsota = vsota + max;
			}
			zgo_meja  = zgo_meja - 2;
			povp = vsota/zgo_meja;
			System.out.println("Povpre?je je: "+povp);
			
		}
	}

}
