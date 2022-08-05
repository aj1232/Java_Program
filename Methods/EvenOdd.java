import java.util.Scanner;
class EvenOdd
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number:");
		int num = sc.nextInt();

		evenOdd(num);
	}

	public static void evenOdd(int num)
	{
		if(num%2==0)
		{
			System.out.println(num+" is Even");
		}
		else
		{
			System.out.println(num+" is Odd");
		}
	}
}