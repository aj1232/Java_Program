//-----------------------------------------------------
// To find given number is odd or even
//-----------------------------------------------------

import java.util.Scanner;
class Dynamic3
{
	public static void main(String[] args){
		
		Scanner z = new Scanner(System.in);

		System.out.println("Enter the number: ");

		int a = z.nextInt();

		String ans = a%2==0 ? a+" is Even" : a+" is Odd";

		System.out.println(ans);

	}
}