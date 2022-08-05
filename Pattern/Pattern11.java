/*
		1
		2 1
		3 2 1
		4 3 2 1
		5 4 3 2 1
*/
import java.util.Scanner;
class Pattern11
{
	public static void main(String[] args)
	{
		Scanner z = new Scanner(System.in);
		int n = z.nextInt();

		for(int i=1 ; i<=n ; i++)
		{
			for(int j=i ; j>0 ; j--)
			{
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}
}