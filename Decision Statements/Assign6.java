//---------------------------------------------------------
//	Currency Exchanger (Dollear to Rs. & vice versa)
//---------------------------------------------------------

import java.util.Scanner;
class Assign6
{
	public static void main(String[] Args)
	{
		Scanner z = new Scanner(System.in);
		System.out.println("\n----------------------- Currency Convertor ----------------------- ");
		System.out.println("1. Dollar to Rupees \n2. Rupees to Dollar");
		System.out.println("Enter your choice:");
		int ch = z.nextInt();
		double dollar, rs;
		switch(ch)
		{
			case 1:
			{
				System.out.println("Enter Dollar:");
				 dollar = z.nextDouble();
				 rs = dollar * 75;
				 System.out.println("For "+dollar+" dollars equivalent rupees are "+rs);
				 break;
			}
			case 2:
			{
				System.out.println("Enter Rupees:");
				rs = z.nextDouble();
				dollar = rs * 0.013;
				System.out.println("For "+rs+" Rs. equivalent dollars are "+dollar);
				break;
			}
			default:
			{
				System.out.println("	  !! Invalid Choice !!");
				System.out.println("!! Please enter values 1 or 2 !!");
			}
		}
	}
}