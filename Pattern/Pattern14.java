/*
		5
		5 4
		5 4 3
		5 4 3 2
		5 4 3 2 1
*/
import java.util.*;
class Pattern14
{
	public static void main(String[] args)
	{
		Scanner z = new Scanner(System.in);
		int n = z.nextInt();

		for(int i=n ; i>0 ; i--)
		{
			for(int j=n ; j>=i ; j--)
			{
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}
}