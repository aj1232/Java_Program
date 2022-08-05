//-----------------------------------------------
//	To make reverse of given no. & print
//-----------------------------------------------
import java.util.Scanner;
class DoWhile7
{
	public static void main(String[] args)
	{
		Scanner z = new Scanner(System.in);
		System.out.println("Enter the number:");
		int num = z.nextInt();
		int rem,reverse=0;

		do
		{
			rem = num % 10;
			reverse = reverse * 10 + rem;
			num/=10;
		}
		while (num>0);
		System.out.println(reverse);
	}
}