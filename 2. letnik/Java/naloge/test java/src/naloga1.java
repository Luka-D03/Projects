
public class naloga1 {
//Napi?i program, ki izpi?e vsa ?tevila med 9 in 53 in vsoto sodih ?tevil na tem intervalu.

	public static void main(String[] args) {
		
		int vsota = 0;//inicializacija vsote
		
		for(int i = 10; i < 53; i++) {//interval med 9 in 53
			
			System.out.print(i);//izpisava ?tevila
			
			if(i < 52) {//izpisava ',' in '.'
				System.out.print(", ");
			} else {
				System.out.print(".");
				System.out.println();
			}
			if(i % 2 == 0) {//se?tevanje vsote sodih ?tevil
				vsota += i;
			}
		}
		System.out.println("Vsota sodih ?tevil je: "+vsota);//izpis vsote
	}

}
