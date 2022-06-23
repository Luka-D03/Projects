//Napiši program, ki izpiše vsoto števil na intervalu med 2 in 25 in število števil, ki so v vsoti.
public class vaja1 {

	public static void main(String[] args) {
		//inicialzizacija
		int vsota = 0;
		int vnosi = 0;
		//for loop
		for(int i = 3; i < 25;i++/*i = i +1*/) {
			vsota += i;//vsota = vsota + i-raèunanje vsote
			vnosi += 1;//raèunanje števil
		}
		System.out.println("Vsota števil je: "+vsota);
		System.out.println("Vnos števil je: "+vnosi);
	}

}
