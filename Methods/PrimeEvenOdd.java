import java.util.Scanner;
class PrimeEvenOdd
{
	public static String prime(int num)
	{
		int j;
		for(j=2;j<num;j++)
		{
			if(num%j==0)
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

	public static boolean evenOdd(int num)
	{
		boolean res = (num%2==0) ? true : false;
		return res;
	}

	public static void main(String[] amit)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter start point:");
		int start = sc.nextInt();
		System.out.println("Enter end point:");
		int end = sc.nextInt();
		int sum = 0;
		System.out.println("Prime Numbers between "+start+" & "+end+" are:");
		for(int i=start;i<=end;i++)
		{
			if(prime(i)=="Prime")
			{
				sum = sum + i;
				if(evenOdd(i))
				{
					System.out.println(i+" is Even");
				}
				else
				{
					System.out.println(i+" is Odd");
				}
			}
		}
		System.out.println("Sum of prime numbers between "+start+" & "+end+" is "+sum);
	}
}