/*
		1
		1 2
		1 2 3
		1 2 3 4
		1 2 3 4 5
*/
import java.util.Scanner;
class Pattern4
{
	public static void main(String[] args)
	{
		Scanner z = new Scanner(System.in);
		int n = z.nextInt();

		for(int i=1 ; i <=n ;i++)
		{
			for(int j=1 ; j<=i ; j++)
			{
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}
}