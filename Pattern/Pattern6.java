/*
	5 4 3 2 1
	5 4 3 2
	5 4 3
	5 4
	5
*/
import java.util.Scanner;
class Pattern6
{
	public static void main(String[] args)
	{
		Scanner z = new Scanner(System.in);
		int n = z.nextInt();

		for(int i=0; i<n; i++)
		{
			for(int j=5; j>i;j--)
			{
				System.out.print(j + " ");
			}

			System.out.println();
		}
	}
}