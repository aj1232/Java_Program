//-----------------------------------------------------------
//	Calculate the sum of each digit iof given number & print
//-----------------------------------------------------------
class While9
{
	public static void main(String[] args)
	{
		int num = 23782;
		int sum = 0, rem;

		System.out.println(num);
		while (num>0)
		{
			rem = num % 10;
			sum = sum + rem;
			num/=10;
		}
		System.out.println(sum);
	}
}