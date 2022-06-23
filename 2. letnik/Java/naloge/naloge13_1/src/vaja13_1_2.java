import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class vaja13_1_2 {
	public static void main(String[] args)throws IOException{
    	BufferedReader vhod = new BufferedReader(new InputStreamReader(System.in));
    	 
	      int x = Integer.parseInt(vhod.readLine());
	      int y = Integer.parseInt(vhod.readLine());
	      if(x<y)
	      {
	    	  int z=y-x;
	    	  System.out.println("Razlika je "+z);
	      }
	      else
	      {
	    	  int z=x-y;
	    	  System.out.println("Razlika je "+z);
	      }
    }
}