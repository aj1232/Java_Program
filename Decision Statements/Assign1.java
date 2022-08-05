import java.util.Scanner;
class Assign1
{
	public static void main(String[] args)
	{
		Scanner z = new Scanner(System.in);

		System.out.println("Enter Name:");
		String name = z.next();
		
		System.out.println("Enter Age:");
		int age = z.nextInt();

		if(age >= 18)
		{
			System.out.println(name+" you are eligible to voting.");
		}
		else
		{
			System.out.println(name+" you are not eligible for voting.");
		}
	}
}