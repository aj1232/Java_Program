/*
		5
		4 5
		3 4 5
		2 3 4 5
		1 2 3 4 5

*/
import java.util.Scanner;
class Pattern15
{
	public static void main(String[] args)
	{
		Scanner z = new Scanner(System.in);
		int n = z.nextInt();

		for(int i=n ; i>0 ; i--)
		{
			for(int j=i ; j<=n ; j++)
			{
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}
}