import java.util.Scanner;
class PrimeSum
{
	public static String prime(int num)
	{
		int j;
		for(j=2 ; j< num ; j++)
		{
			if(num%j == 0)
			{
				break;
			}
		}

		if(j==num)
		{
			return "Prime";
		}
		else
		{
			return "Not_Prime";
		}
	}

	public static void main(String[] agr)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter start point:");
		int start = sc.nextInt();
		System.out.println("Enter end point:");
		int end = sc.nextInt();
		System.out.println("Prime Numbers between "+start+" & "+end+" are:");
		int sum = 0;
		for(int i=start;i<=end;i++)
		{
			if(prime(i)=="Prime")
			{
				sum = sum + i;
				System.out.println(i);
			}
		}

		System.out.println("Sum of Prime numbers between "+start+" & "+end+" is "+sum);
	}
}