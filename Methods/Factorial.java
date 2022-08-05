import java.util.Scanner;
class Factorial
{
	public static void main(String[] ah)
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Number:");
		int num = sc.nextInt();

		fact(num);
	}

	public static void fact(int num)
	{
		int factorial = 1, num2 = num;
		for(int num1 = num ; num > 0 ; num--)
		{
			factorial = factorial * num;
		}
		System.out.println("Factorial for "+num2+" is "+factorial);
	}
}