import java.util.Scanner;
class PrimeCount
{
	public static int primeCount(int start, int end)
	{
		int count=0;
		for(int num=start ; num<= end ; num++)
		{
			int j;
			for(j=2 ; j<=num ; j++)
			{
				if(num%j == 0)
				{
					break;
				}
				
			}
			if(j==num)
			{
				count = count+ 1;
			}
		}
		return count;
	}

	public static void main(String[] aj)
	{
		Scanner z = new Scanner(System.in);
		System.out.println("Enter start point:");
		int start = z.nextInt();
		System.out.println("Enter end point:");
		int end = z.nextInt();

		int result = primeCount(start, end);
		System.out.println("The count of prime numbers between "+start+" & "+end+" is "+result);
	}
}