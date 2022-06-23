import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class vaja13_1_3 {
	public static void main(String[] args)throws IOException{
    	BufferedReader vhod = new BufferedReader(new InputStreamReader(System.in));
    	
    	int v = 0;
    	for(int i=1;i<=5;i++)
    	{
    	int x = Integer.parseInt(vhod.readLine());
    	v = v + x;
    	}
    	System.out.println("Vsota je "+v);
    }
}