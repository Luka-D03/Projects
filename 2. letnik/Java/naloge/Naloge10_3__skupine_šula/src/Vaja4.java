import java.util.Scanner;
//Napiši program, ki izriše:
//*
//* *
//* * *
//* * * *
//* * * * *
public class Vaja4 {

	public static void main(String[] args) {
		int z=1;
		int n=1;
		for (int i=1; i<=5; i++)
		{
			for (int j=1; j<=i; j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
