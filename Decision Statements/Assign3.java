import java.util.Scanner;
class Assign3
{
	public static void main(String[] args)
	{
		Scanner z = new Scanner(System.in);
		System.out.println("Enter Option(1/2):");
		int op = z.nextInt();
		String name;
		int age;

		if(op == 1)
		{
			System.out.println("Enter Girl's Name:");
			 name = z.next();
			System.out.println("Enter her age:");
			 age = z.nextInt();

			if(age>=18)
			{
				System.out.println(name + " eligible for marriage");
			}
			else
			{
				System.out.println(name + " not eligible for marriage");
			}

		}
		else if(op == 2)
		{
			System.out.println("Enter Boy's Name:");
			 name = z.next();
			System.out.println("Enter his age:");
			 age = z.nextInt();

			if(age>=21)
			{
				System.out.println(name + " eligible for marriage");
			}
			else
			{
				System.out.println(name + " not eligible for marriage");
			}
		}
		else
		{
			System.out.println("!! Invalid Option !!");
		}
	}
}