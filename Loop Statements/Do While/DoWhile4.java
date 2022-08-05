import java.util.Scanner;
class DoWhile4
{
	public static void main(String[] args)
	{
		Scanner z = new Scanner(System.in);
		System.out.println("Enetr starting point:");
		int start = z.nextInt();
		System.out.println("Enetr end point:");
		int end = z.nextInt();

		do
		{
			System.out.println(start);
			start++;
		}
		while (start<=end);
	}
}