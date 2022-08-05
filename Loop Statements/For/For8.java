//-------------------------------------------------------
//	Calculate the factorial of the given number & print
//-------------------------------------------------------
import java.util.Scanner;
class For8
{
	public static void main(String[] rags)
	{
		Scanner sc = new Scanner(System.in);

		int fact = 1;
		System.out.println("Enter the number:");
		//int num = sc.nextInt();
		

		for(int num = sc.nextInt(); num > 0 ; num--)
		{
			fact = fact * num;
		}
		System.out.println(fact);
	}
}