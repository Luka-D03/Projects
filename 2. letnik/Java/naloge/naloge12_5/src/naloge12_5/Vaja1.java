package naloge12_5;
//Napi?i program, ki izpi?e liha ?tevila med 3 in 58 in vsoto sodih ?tevil na tem intervalu.
public class Vaja1 {

	public static void main(String[] args) {
		
		int vsota = 0;
		
		for(int i = 4; i < 58; i++) {
			
			if(i % 2 != 0) {
				System.out.print(i);
				if(i < 57) {
					System.out.print(", ");
				} else {
					System.out.print(".");
					System.out.println();
				}
			}
			
			if(i % 2 == 0) {
				vsota += i;
			}
		}
		System.out.println("Vsota sodih ?tevil je: "+vsota);

	}

}
