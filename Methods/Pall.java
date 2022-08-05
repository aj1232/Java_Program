import java.util.Scanner;
class Pall
{
	public static void main(String[]args)
	{
		Scanner s=new Scanner(System.in);
			System.out.println("enter the number");
			int num=s.nextInt();
			int i;
			for(i=2;i<num;i++)
			{
				if(num%i==0)
				{
					break;
				}
			}
			if(i==num)
			{
				System.out.println("prime");
			}
			else
			{
				System.out.println("not prime");
			}
		
	}
}

