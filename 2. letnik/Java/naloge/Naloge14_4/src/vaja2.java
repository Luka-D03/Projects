//Napi�i program, ki izpi�e vsoto vsakega petega �tevila na intervalu med 3 in 59. 
//Za�ni z izpisom �tevila 5.
public class vaja2 {

	public static void main(String[] args) {
		//inicialzizacija
		int vsota = 0;
		
		//for loop
		for(int i = 4; i < 59;i++/*i = i +1*/) {
			//if loop
			if(i % 5 == 0) {
				vsota += i;//ra�unanje vsote vsakega 5. �tevila
			}
		}
		System.out.println("Vsota �tevil je: "+vsota);
	}

}
