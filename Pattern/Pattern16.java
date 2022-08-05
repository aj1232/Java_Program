/*
		1
		2 3
		4 5 6
		7 8 9 1
		2 3 4 5 6
*/
import java.util.Scanner;
class Pattern16
{
	public static void main(String[] args)
	{
		Scanner z = new Scanner(System.in);
		int n = z.nextInt();
		int x = 1;

		for(int i=0 ; i<n ;i++)
		{
			for(int j=0 ; j<=i ; j++)
			{
				System.out.print(x++ + " ");
				if(x==10){x=1;}
			}
			System.out.println();
		}
	}
}