//-------------------------------------------------------------------
//	Calculate the sum of each digit of given number & print
//-------------------------------------------------------------------

class For9
{
	public static void main(String[] agsh)
	{
		int sum = 0;
		for(int num = 83783 ; num > 0 ; num/=10 )
		{
			int rem = num%10;
			sum = sum + rem;
		}

		System.out.println(sum);

	}
}