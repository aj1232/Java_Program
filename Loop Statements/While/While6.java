//-------------------------------------------------
//	To print the given number in reverse order 
//-------------------------------------------------
class While6
{
	public static void main(String[] am)
	{
		int num = 4362;
		int rem;	

		while(num>0)
		{
			rem = num % 10;
			System.out.println(rem);
			num /= 10;
		}
	}
}