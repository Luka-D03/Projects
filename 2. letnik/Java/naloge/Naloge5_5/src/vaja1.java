
public class vaja1 {
//Napiši program, ki izpiše števila med 6 in 53 in vsoto teh števil deljeno s številom teh števil.
	public static void main(String[] args) {
		
		int vsota = 0;
		int vnosi = 0;
		
		for(int i = 7; i < 53; i++) {
			System.out.println(i);
			vnosi++;
			vsota += i;//vsota = vsota + i
		}
		vsota /= vnosi;//vosta = vsota / vnosi, / = deljenje
		System.out.println("Vsota števil je: "+vsota);
	}

}
