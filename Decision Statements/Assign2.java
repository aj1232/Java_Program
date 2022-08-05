import java.util.Scanner;
class Assign2
{
	public static void main(String[] args)
	{
		Scanner z = new Scanner(System.in);

		System.out.println("Enter number:");

		int ch = z.nextInt();

		if(ch > 7 || ch < 1)
		{
			System.out.println("!! Invalid Choice !!");
		}
		else if(ch == 1)
		{
			System.out.println("	It is Monday");
		}
		else if(ch == 2)
		{
			System.out.println("	It is Tuesday");
		}
		else if(ch == 3)
		{
			System.out.println("	It is Wednesday	");
		}
		else if(ch == 4)
		{
			System.out.println("	It is Thursday");
		}
		else if(ch == 5)
		{
			System.out.println("	It is Friday");
		}
		else if(ch == 6)
		{
			System.out.println("	It is Saturday");
		}
		else if(ch == 7)
		{
			System.out.println("	It is Sunday");
		}
	}
}