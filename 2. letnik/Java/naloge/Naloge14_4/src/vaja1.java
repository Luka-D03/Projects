//Napi�i program, ki izpi�e vsoto �tevil na intervalu med 2 in 25 in �tevilo �tevil, ki so v vsoti.
public class vaja1 {

	public static void main(String[] args) {
		//inicialzizacija
		int vsota = 0;
		int vnosi = 0;
		//for loop
		for(int i = 3; i < 25;i++/*i = i +1*/) {
			vsota += i;//vsota = vsota + i-ra�unanje vsote
			vnosi += 1;//ra�unanje �tevil
		}
		System.out.println("Vsota �tevil je: "+vsota);
		System.out.println("Vnos �tevil je: "+vnosi);
	}

}
