//Napiši program, ki izpiše vsako drugo število med 5 in 47 in vsoto teh števil na intervalu.
public class vaja1 {

	public static void main(String[] args) {
		int vsota = 0;
		int x = 1;
		//for loop
		for(int i = 6; i < 47; i++) {
			x++;//x++
			//if loop
			if(x == 2) {
				System.out.println(i);//izpis
				x = 0;
			}
			vsota += i;//vsota je tu
		}
		System.out.println("Vsota je: "+vsota);//izpis

	}

}
