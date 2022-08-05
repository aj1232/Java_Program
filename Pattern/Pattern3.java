/*
		1 0 1 0 1
		1 0 1 0 1
		1 0 1 0 1
		1 0 1 0 1
		1 0 1 0 1
*/
import java.util.Scanner;
class Pattern3
{
	public static void main(String arg[])
	{
		Scanner z = new Scanner(System.in);
		int n = z.nextInt();
		int x = 1;

		for(int i=1 ; i<=n ; i++)
		{
			for(int j=1 ; j<=n ; j++)
			{
				System.out.print(j%2 + " ");
			}

			System.out.println();
		}
	}
}