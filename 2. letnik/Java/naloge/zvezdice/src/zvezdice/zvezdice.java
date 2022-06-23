package zvezdice;

public class zvezdice {

	public static void main(String[] args) {
		int z=1;
		int n=1;
		//prva
		for (int i=1; i<=4; i++)
		{
			for (int j=1; j<=i; j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		//prva konec
		System.out.println();
		//druga
		for (int i=1; i<=4; i++)
		{
			for (int x=3; x>=z; x--)
			{
				System.out.print(" ");
			}
			z++;
			for (int j=1; j<=i; j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		//druga konec
		System.out.println();
		//tretja
		z=1;
		for (int i=1; i<=5; i++)
		{
			for (int x=4; x>=z; x--)
			{
				System.out.print(" ");
			}
			for (int j=1; j<=n; j++)
			{
				System.out.print("*");
			}
			z++;
			n=n+2;
			System.out.println();
		}
		z=1;
		n=7;
		for (int i=1; i<=5; i++)
		{
			for (int x=1; x<=z; x++)
			{
				System.out.print(" ");
			}
			for (int j=1; j<=n; j++)
			{
				System.out.print("*");
			}
			z++;
			n=n-2;
			System.out.println();
		}
		//tretja konec
		//èetrta
		z=1;
		int y=1;
		for (int i=1; i<=5; i++)
		{
			for (int x=4; x>=z; x--)
			{
				System.out.print(" ");
			}
			for (int j=1; j<=i; j++)
			{
				System.out.print("*");
				for(int x=0; x<=y; x++)
				{
					System.out.print(" ");
				}
				y++;
			}
			z++;
			y=0;
			System.out.println();
		}
	}
}
