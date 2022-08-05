/*
		A
		B A
		C B A
		D C B A
		E D C B A
*/
import java.util.Scanner;
class Pattern13
{
	public static void main(String[] args)
	{
		Scanner z = new Scanner(System.in);
		int n = z.nextInt();

		for(int i=1; i<=n ; i++)
		{
			for(int j=i ; j>0 ; j--)
			{
				System.out.print((char) (j+64) + " ");
			}
			System.out.println();
		}
	}
}