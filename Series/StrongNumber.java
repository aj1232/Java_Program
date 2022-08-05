import java.util.Scanner;
class StrongNumber
{
	public static void main(String[] ag)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number:");
		int num = sc.nextInt();

		if(num == findStrong(num))
		{
			System.out.println("The given number "+num+" is Strong Number");
		}
		else
		{
			System.out.println("The given number "+num+" is NOT Strong Number");
		}

	}

	public static int findStrong(int num)
	{
		int rem, sum=0;
		while(num>0)
		{
			rem = num%10;
			sum += fact(rem);
			num/=10;
		}

		return sum;
	}

	public static int fact(int num)
	{
		int fact=1;
		while(num>0)
		{
			fact*=num;
			num--;
		}
		return fact;
	}
}