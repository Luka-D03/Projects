package naloge27_1;

import java.util.Scanner;

public class vaja_1 {
//Napi�i program, ki prebere tri �tevila in izpi�e �tevila od najvecjega do najmanj�ega.
	public static void main(String[] args) {
		Scanner vhod = new Scanner(System.in);
		
		System.out.print("Vnesi prvo �tevilo: ");
		int x = vhod.nextInt();
		System.out.print("Vnesi drugo �tevilo: ");
		int y = vhod.nextInt();
		System.out.print("Vnesi tretje �tevilo: ");
		int z = vhod.nextInt();
		
		if(x>y)
		{
			if(x>z)
			{
				System.out.println(x);
				if(y>z)
				{
					System.out.println(y);
					System.out.println(z);
				}
				else
				{
					System.out.println(z);
					System.out.println(y);
				}
			}
		}
		
		if(y>x)
		{
			if(y>z)
			{
				System.out.println(y);
				if(x>z)
				{
					System.out.println(x);
					System.out.println(z);
				}
				else
				{
					System.out.println(z);
					System.out.println(x);
				}
			}
		}
		
		if(z>y)
		{
			if(z>x)
			{
				System.out.println(z);
				if(y>x)
				{
					System.out.println(y);
					System.out.println(x);
				}
				else
				{
					System.out.println(x);
					System.out.println(y);
				}
			}
		}
	}
}
