/*
		1 2 3 4 5
		1 2 3 4
		1 2 3
		1 2
		1
*/
import java.util.Scanner;
class Pattern5
{
	public static void main(String[] args)
	{
		Scanner z = new Scanner(System.in);
		int n = z.nextInt();

		for(int i=0 ; i<n ; i++)
		{
			for(int j=1 ; j <= (n-i) ; j++)
			{
				System.out.print(j + " ");
			}

			System.out.println();
		}
	}
}