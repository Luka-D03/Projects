
public class vaja1 {
// Napiši program, ki izpiše vsako tretje število med 5 in 67 in vsoto vsakega drugega števila na istem intervalu.
	public static void main(String[] args) {
		int vsota = 0, z2 = 1, z3 = 2;
		
		for(int i = 6; i < 67; i++, z2++, z3++) {
			if(z3 == 3) {
				System.out.println(i);
				z3 = 0;
			}
			
			if(z2 == 2) {
				vsota += i;
				z2 = 0;
			}
		}
		System.out.println("Vsota je: "+vsota);
	}
}
