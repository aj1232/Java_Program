//-------------------------------------------------------------
//	Simple Intrest = Principal x Rate of Interest x Time
//-------------------------------------------------------------

import java.util.Scanner;
class Assign5
{
	public static void main(String[] args)
	{
		Scanner z = new Scanner(System.in);

		System.out.println("----------------- Simple Interest,Principal Amount, Rate of Interest, Time calculator -----------------");

		System.out.println("1. Calculate Interest \n2. Calculate Principal Amount \n3. Calculate Rate of Interest \n4. Calculate Time");

		System.out.println("Enter your choice:");

		int ch = z.nextInt();

		double interest, principal_amount, rateOfInterest, time;

		switch(ch)
		{
			case 1:
			{
				System.out.println("Enter Principal Amount (in Rs.):");

				principal_amount = z.nextDouble();

				System.out.println("Enter Rate of Interest (in %):");

				rateOfInterest = z.nextDouble();

				rateOfInterest /= 100;

				System.out.println("Enter Time (in Years):");

				time = z.nextDouble();

				interest = principal_amount * rateOfInterest * time;

				System.out.println("Simple Interest is Rs."+interest);

				break;

			}
			case 2:
			{
				System.out.println("Enter Simple interest (in Rs.):");

				interest = z.nextDouble();

				System.out.println("Enter Rate of Interest (in %):");

				rateOfInterest = z.nextDouble();

				rateOfInterest /= 100;

				System.out.println("Enter Time (in Years):");

				time = z.nextDouble();

				principal_amount = interest / (rateOfInterest * time);

				System.out.println("Principal Amount is Rs."+principal_amount);

				break;
			}
			case 3:
			{
				System.out.println("Enter Principal Amount (in Rs.):");

				principal_amount = z.nextDouble();

				System.out.println("Enter Interest (in Rs.):");

				interest = z.nextDouble();

				//rateOfInterest /= 100;

				System.out.println("Enter Time (in Years):");

				time = z.nextDouble();

				rateOfInterest = (interest / (principal_amount * time)) * 100;

				System.out.println("Rate of Interest is "+rateOfInterest+" %");

				break;
			}
			case 4:
			{
				System.out.println("Enter Principal Amount (in Rs.):");

				principal_amount = z.nextDouble();

				System.out.println("Enter Rate of Interest (in %):");

				rateOfInterest = z.nextDouble();

				rateOfInterest /= 100;

				System.out.println("Enter Interest (in Rs.):");

				interest = z.nextDouble();

				time = interest / (principal_amount * rateOfInterest);

				System.out.println("Time is "+time+" years");

				break;
			}
			default:
			{
				System.out.println("        !! Invalid Choice !!");       
				System.out.println("!! Please enter value from 1 to 4 !!");
			}
		}
	}
}