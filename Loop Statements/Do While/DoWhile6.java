//-----------------------------------------------
//	To print the given number in reverse order
//-----------------------------------------------
class DoWhile6
{
	public static void main(String[] args)
	{
		int num = 253637;
		int rem;
		System.out.println(num);
		do
		{
			rem = num % 10;
			System.out.print(rem);
			num /= 10;
		}
		while (num > 0);
	}
}