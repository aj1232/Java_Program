//-------------------------------------------------
//	To print the given number in reverse order 
//-------------------------------------------------

class For6
{
	public static void main(String[] args)
	{
		for(int num = 62783; num > 0 ; num/=10)
		{
			int rem = num%10;
			System.out.print(rem);
		}
	}
}