import java.util.Scanner;
class ArmStrong
{
	public static int leng(int num)
	{
		int count=0;
		while(num>0)
		{
			num/=10;
			count++;
		}
		return count;
	}

	public static boolean findArmStrong(int num)
	{
		int rem, sum=0,mul ,num2=num;
		int length = leng(num);
		while(num>0)
		{
			mul=1;
			rem = num%10;
			for(int i=0; i<length;i++)
			{
				mul*=rem;
			}
			sum += mul;
			num/=10;
		}
		

		boolean result = (sum==num2) ? true : false;

		return result;
	}

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number:");
		int num = sc.nextInt();
		if(findArmStrong(num))
		{
			System.out.println("The given number "+num+" is Arm Strong Number");
		}
		else
		{
			System.out.println("The given number "+num+" is NOT Arm Strong Number");
		}
	}
}