
public class vaja1 {
//Napi�i program, ki izpi�e �tevila med 6 in 53 in vsoto teh �tevil deljeno s �tevilom teh �tevil.
	public static void main(String[] args) {
		
		int vsota = 0;
		int vnosi = 0;
		
		for(int i = 7; i < 53; i++) {
			System.out.println(i);
			vnosi++;
			vsota += i;//vsota = vsota + i
		}
		vsota /= vnosi;//vosta = vsota / vnosi, / = deljenje
		System.out.println("Vsota �tevil je: "+vsota);
	}

}
