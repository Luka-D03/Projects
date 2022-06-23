//Napiši program, ki izpiše vsoto vsakega petega števila na intervalu med 3 in 59. 
//Zaèni z izpisom števila 5.
public class vaja2 {

	public static void main(String[] args) {
		//inicialzizacija
		int vsota = 0;
		
		//for loop
		for(int i = 4; i < 59;i++/*i = i +1*/) {
			//if loop
			if(i % 5 == 0) {
				vsota += i;//raèunanje vsote vsakega 5. števila
			}
		}
		System.out.println("Vsota števil je: "+vsota);
	}

}
