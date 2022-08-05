import java.util.Scanner;
class Pallindrome
{
	public static void main(String[] args)
	{
		Scanner z = new Scanner(System.in);
		System.out.println("Enter the number:");
		int num=z.nextInt();
		System.out.println(pallindrome(num));
	}

	public static String pallindrome(int num)
	{
		int rev=0, num2 = num;
		while(num > 0){
			rev = rev * 10 + num%10;
			num/=10;
		}
		String res = (rev == num2) ? "The "+num2+" is Pallindrome" : "The "+num2+" is not Pallindrome";

		return res;
	}
}