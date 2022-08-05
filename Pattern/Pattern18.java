/*
		1 0 1 0 1
		0 1 0 1 1
		0 1 0 1 0
		1 0 1 1 0
		1 0 1 0 1
*/
import java.util.Scanner;
class Pattern18
{
	public static void main(String[] args)
	{
		Scanner z = new Scanner(System.in);
		int n = z.nextInt();

		int x=1;

		for(int i=0 ; i<n ; i++)
		{
			for(int j=0 ; j<n ; j++, x++)
			{
				System.out.print(x%2 + " ");
			}
			System.out.println();
		}
	}
}