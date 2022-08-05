import java.util.Scanner;
class While4
{
	public static void main(String[] at)
	{
		Scanner z = new Scanner(System.in);
		System.out.println("Enter starting point:");
		int start = z.nextInt();
		System.out.println("Enter end point:");
		int end = z.nextInt();

		while(start<=end)
		{
			System.out.println(start);
			start++;
		}
	}
}