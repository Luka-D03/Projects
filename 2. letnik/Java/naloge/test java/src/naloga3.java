import java.util.Scanner;

public class naloga3 {
//Napi?i program, ki prebere 10 ?tevil in izpi?e najve?je in najmanj?e ?tevilo. 
//Na intervalu med drugim najve?jim vnesenim ?tevilom in najve?jim vnesenim ?tevilom se?teje vsako drugo ?tevilo 
//in izpi?e rezultat.

	public static void main(String[] args) {
		try(Scanner vhod = new Scanner(System.in)){
		
			int max = -999999999, min = 999999999, max2 = -999999999, rezultat = 0;//incializacija ?tevil
			
			for(int i = 1; i <= 10; i++) {	//interval za branje 10. ?tevil
				System.out.print("Vnesi "+i+". ?tevilo: ");//izpis Vnesi #. ?tevilo: 
				int x = vhod.nextInt();//branje ?tevila
				
				if(x > max) {//preverjanje najve?jega ?tevila in drugega najve?jega ?tevila
					max2 = max;
					max = x;
				}
				
				if(x < min) {//preverjanje najmanj?ega ?tevila
					min = x;
				}
			}
			
			System.out.println("Najve?je ?tevilo je: "+max);//izpis najve?jega ?tevila
			System.out.println("Najmanj?e ?tevilo je: "+min);//izpis najmanj?ega ?tevila
			System.out.println("Drugo najve?je ?tevilo je: "+max2);//izpis drugega najve?jega ?tevila
			
			for(max2 += 1; max2 < max; max2 = max2 + 2) {//	interval med drugim najve?jim vnesenim ?tevilom in najve?jim vnesenim ?tevilom
				rezultat += max2;//se?tevanje vsakega drugega ?tevila
			}
			
			System.out.println("Vsota ?tevil je: "+rezultat);//izpis rezultata.
		}
	}
}
