//-----------------------------------------------------
// To find largest number from given two numbers
//-----------------------------------------------------

import java.util.Scanner;
class Dynamic2
{
	public static void main(String[] args){
		
		Scanner z = new Scanner(System.in);

		System.out.println("Enter first number: ");

		int a = z.nextInt();

		System.out.println("Enter second number: ");

		int b = z.nextInt();

		int ans = a > b ? a : b;

		System.out.println(ans+" is greater from given number "+a+" and "+b);


	}
}