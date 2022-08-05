//-------------------------------------------------
//	To make reverse of the given number & print.
//-------------------------------------------------

class For7
{
	public static void main(String[] args)
	{
		int reverse=0;
		for(int num = 352682; num > 0; num/=10)
		{
			int rem = num%10;
			reverse = reverse * 10 + rem;
		}
		System.out.println(reverse);
	}
}