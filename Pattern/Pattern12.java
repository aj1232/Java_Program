/*
		5 4 3 2 1
		4 3 2 1
		3 2 1
		2 1
		1
*/
import java.util.Scanner;
class Pattern12
{
	public static void main(String[] args)
	{
		Scanner z = new Scanner(System.in);
		int n = z.nextInt();

		for(int i=n ; i > 0 ; i--)
		{
			for(int j=i ; j>0 ; j--)
			{
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}
}