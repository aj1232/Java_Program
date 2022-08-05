import java.util.Scanner;
class While8
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number:");
		int num = sc.nextInt();
		int fact = 1;

		do
		{
			fact = fact * num;
			num--;

		}
		while (num > 0);
		System.out.println(fact);
	}
}