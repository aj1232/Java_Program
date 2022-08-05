//-----------------------------------------------------
// To find largest number from given three numbers
//-----------------------------------------------------
class Cond4
{
	public static void main(String[] amit)
	{
		int a, b, c;

		a = 10;

		b = 20;

		c = 30;

		int ans1 = a > b ? a : b;

		int ans2 = ans1 > c ? a : c;

		System.out.println("The larest number is "+ans2);			// 30

		int largest = a > b ? (a > c ? a : c) : (b > c ? b : c);

		System.out.println("The largest number is "+largest);		// 30

		int larger = (a > b ? a : b) > c ? (a > b ? a : b) : c ;

		System.out.println("The largest number is "+larger);		// 30
	}
}