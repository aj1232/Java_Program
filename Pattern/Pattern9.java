/*
		5 5 5 5 5
		4 4 4 4 4
		3 3 3 3 3
		2 2 2 2 2
		1 1 1 1 1

*/
import java.util.Scanner;
class Pattern9
{
	public static void main(String[] args)
	{
		Scanner z = new Scanner( System.in);
		int n = z.nextInt();

		for(int i=5;i>0;i--)
		{
			for(int j=0; j<n ; j++)
			{
				System.out.print(i + " ");
			}
			System.out.println();
		}
	}
}