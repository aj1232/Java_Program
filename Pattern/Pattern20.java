/*
		1
		2 6
		3 7 10
		4 8 11 13
		5 9 12 14 15
*/
import java.util.Scanner;
class Pattern20
{
	public static void main(String[] args)
	{
		Scanner z = new Scanner(System.in);
		int n = z.nextInt();

		for(int i=1 ; i<=n ; i++)
		{
			int x=i, y=4;
			for(int j=1; j<=i ; j++, y--)
			{
				System.out.print(x + " ");
				x+=y;
			}
			System.out.println();
		}
	}
}