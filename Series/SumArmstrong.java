import java.util.Scanner;
class SumArmstrong
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter start point:");
		int start = sc.nextInt();
		System.out.println("Enter end point:");
		int end = sc.nextInt();
		int sum=0;
		for(int i=start; i<=end;i++)
		{
			if(findArmstrong(i))
			{
				sum=sum+i;
			}
		}

		System.out.println("The sum of Arm Strong Numbers between "+start+" & "+end+" is "+sum);
	}

	public static boolean findArmstrong(int num)
	{
		int rem=0, num2=num, mul, sum=0;
		int leng=length(num);
		while(num>0)
		{
			mul=1;
			rem=num%10;
			for(int i=0;i<leng;i++)
			{
				mul*=rem;
			}

			sum+=mul;
		}

		if(sum==num2)
		{
			return true;
		}
		else
		{
			return false;
		}
	}

	public static int length(int num)
	{
		int count=0;
		while(num>0)
		{
			num/=10;
			count++;
		}
		return count;
	}
}