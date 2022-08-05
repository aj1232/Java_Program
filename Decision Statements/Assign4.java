//-------------------------------------------------------------------
//	Speed = Distance / Time
//-------------------------------------------------------------------

import java.util.Scanner;
class Assign4
{
	public static void main(String[] args)
	{
		Scanner z = new Scanner(System.in);
		System.out.println("\n\t------------------- Speed, Distance & Time Calculator------------------- ");
		System.out.println("1. Calculate Speed \n2. Calculate Distance \n3. Calculate Time");
		System.out.println("Enter your choice:");
		int ch = z.nextInt();
		double speed, dist, time;

		switch(ch)
		{
			case 1:
			{
				System.out.println("Enter Distance (in Km):");
				dist = z.nextDouble();
				System.out.println("Enter Time (in hr):");
				time = z.nextDouble();
				speed = dist / time;
				System.out.println("Speed for "+dist+" km and for "+time+" hr is : "+speed+" km/hr.");
				break;
			}
			case 2:
			{
				System.out.println("Enter Speed (in Km/hr):");
				speed = z.nextDouble();
				System.out.println("Enter Time (in hr):");
				time = z.nextDouble();
				dist = speed * time;
				System.out.println("Distance for "+speed+" km/hr and for "+time+" hr is : "+dist+" km.");
				break;
			}
			case 3:
			{
				
				System.out.println("Enter Distance (in Km):");
				dist = z.nextDouble();
				System.out.println("Enter Speed (in Km/hr):");
				speed = z.nextDouble();
				time = dist / speed;
				System.out.println("Time for "+dist+" km and for "+speed+" km/hr is "+time+" hr.");
				break;
			}
			default:
			{
				System.out.println("        !! Invalid Choice !!");       
				System.out.println("!! Please enter value from 1 to 3 !!");
			}
		}

	}
}