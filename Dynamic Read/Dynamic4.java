//-----------------------------------------------------
// To find largest number from given three numbers
//-----------------------------------------------------

import java.util.Scanner;
class Dynamic4
{
	public static void main(String[] args){
		
		Scanner z = new Scanner(System.in);

		System.out.println("Enter first number: ");

		int a = z.nextInt();

		System.out.println("Enter second number: ");

		int b = z.nextInt();

		System.out.println("Enter third number: ");

		int c = z.nextInt();

		int ans = (a > b ? a : b) > c ? (a > b ? a : b) : c;

		System.out.println(ans+" is greater than "+a+","+b+","+c);
	}
}