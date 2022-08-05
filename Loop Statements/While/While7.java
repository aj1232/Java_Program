//-------------------------------------------------
//	To make reverse of the given number & print.
//-------------------------------------------------

import java.util.Scanner;
class While7
{
	public static void main(String[] aj)
	{
		Scanner z = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int num = z.nextInt();
		int rem, reverse = 0;

		while(num>0)
		{
			rem = num % 10;
			reverse = reverse * 10 + rem;
			num /= 10;
		}
		System.out.println(reverse);
	}
}