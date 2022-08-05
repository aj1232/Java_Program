import java.util.Scanner;
class DivisibleBy3
{
	public static void divideBy3()
	{

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Starting Point:");
		int start = sc.nextInt();
		System.out.println("Enter End Point:");
		int end = sc.nextInt();

		System.out.println("The numbers divisible by 3 between "+start+" & "+end+" are:");
		
		for(int num=start; num<=end;num++)
		{
			if (num % 3 == 0)
			{
				System.out.println(num);
			}
		}
		
	}

	public static void main(String[] args)
	{
		
		divideBy3();
	}
}