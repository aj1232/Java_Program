import java.util.Scanner;
class Reverse
{
	public static void main(String[] args)
	{
		Scanner z = new Scanner(System.in);
		System.out.println("Enter Number:");
		int num = z.nextInt();
		reverse(num);
	}

	public static void reverse(int num)
	{
		int count=0;
		int rev=0;
		int rem; 
		int num2 = num;
		while(num>0)
		{
			rem = num % 10;
			rev = rev * 10 + rem;
			num /= 10;
			count++;
		}
		System.out.println("The count of digits of "+num2+" is "+count);
		System.out.println("The reverse of "+num2+" is "+rev);
	}
}