//-----------------------------------------------------
// To find largest character from given two characters
//-----------------------------------------------------

import java.util.Scanner;
class Dynamic1
{
	public static void main(String[] args){

		Scanner s = new Scanner(System.in);

		System.out.println("Enter First Character: ");

		char a = s.next().charAt(0);

		System.out.println("Enter Second Character: ");

		char b = s.next().charAt(0);

		String ans = a > b ? a+" is greater than "+b : b+" is greater than "+a;

		System.out.println(ans);

		
		double x = a;

		double y = b;

		System.out.println("--------------------------------");
		System.out.println(x);
		System.out.println(y);

	}

}