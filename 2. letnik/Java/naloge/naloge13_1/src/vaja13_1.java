import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class vaja13_1 {
    public static void main(String[] args)throws IOException{
    	BufferedReader vhod = new BufferedReader(new InputStreamReader(System.in));
    	 
	      int x = Integer.parseInt(vhod.readLine());
	      int y = Integer.parseInt(vhod.readLine());
	      int v=x+y;
	      System.out.println("Vsota je "+v);
    }
}