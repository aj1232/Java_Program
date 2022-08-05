/*
		1
		0 1
		0 1 0
		1 0 1 0
		1 0 1 0 1
*/
import java.util.Scanner;
class Pattern19
{
	public static void main(String[] args)
	{
		Scanner z = new Scanner(System.in);
		int n = z.nextInt();
		int x = 1;

		for(int i=1 ; i<=n ; i++)
		{
			for(int j=1 ; j<=i ; j++,x++)
			{
				System.out.print(x%2 + " ");
			}
			System.out.println();
		}
	}
}