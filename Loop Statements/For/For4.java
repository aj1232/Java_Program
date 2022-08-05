import java.util.Scanner;
class For4
{
	public static void main(String[] args)
	{
		Scanner z = new Scanner(System.in);
		System.out.println("Enter start point:");
		int start = z.nextInt();
		
		System.out.println("Enter end point:");
		int end = z.nextInt();

		for(int i=start ; i <= end; i++)
		{
			System.out.println(i);
		}
	}
}