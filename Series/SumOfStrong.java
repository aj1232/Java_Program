import java.util.Scanner;
class SumOfStrong
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter start point:");
		int start = sc.nextInt();
		System.out.println("Enter end point:");
		int end = sc.nextInt();

		int sum=0;

		for(int i=start;i<=end;i++)
		{
			if(findStrong(i))
			{
				sum+=i;
			}

		}
		System.out.println("The sum of strong numbers between "+start+" & "+end+" is "+sum);
	}


	public static boolean findStrong(int num)
	{
		int rem, sum = 0, num2 = num;

		while(num>0)
		{
			rem = num%10;
			sum += fact(rem);
			num/=10;
		}

		boolean res = (sum == num2) ? true : false;

		return res;
	}

	public static int fact(int num)
	{
		int fact=1;
		while(num>0)
		{
			fact *= num;
			num--;
		}
		return fact;
	}

	
}