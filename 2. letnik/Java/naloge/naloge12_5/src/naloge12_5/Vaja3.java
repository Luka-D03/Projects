package naloge12_5;

import java.util.Scanner;

//Napi?i program, ki prebere 16 ?tevil in izpi?e najve?je in najmanj?e ?tevilo. Na
//intervalu med drugim in ?estim prebranim ?tevilom se?teje liha ?tevilo in
//izpi?e rezultat. Pri tem vzame za spodnjo mejo manj?e izmed teh dveh ?tevil, za zgornjo pa ve?je.
public class Vaja3 {

	public static void main(String[] args) {
		try(Scanner vhod = new Scanner(System.in)){
			
			int max = -999999999, min = 999999999, prvo = 0, sesto = 0, vsota = 0;
			
			for(int i = 1; i <= 16; i++) {
				
				System.out.print("Vnesi "+i+". ?tevilo: ");
				int x = vhod.nextInt();
				
				if(x > max) {
					max = x;
				}
				
				if(x < min) {
					min = x;
				}
				
				if(i == 1) {
					prvo = x;
				}
				
				if(i == 6) {
					sesto = x;
				}
			}
				System.out.println("Najve?je ?tevilo je: "+max);
				System.out.println("Najmanj?e ?tevilo je: "+min);
			
			if(prvo < sesto) {
				for(prvo += 1; prvo < sesto; prvo++) {
					if(prvo % 2 != 0) {
						vsota += prvo;
					}
				}
			} else {
				for(sesto += 1; sesto < prvo; sesto++) {
					if(sesto % 2 != 0) {
						vsota += sesto;
					}
				}
			}
			System.out.println("Vsota ?tevil je: "+vsota);
		}
	}
}
