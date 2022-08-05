class DoWhile5
{
	public static void main(String[] args)
	{
		char alpha = 'z';

		do
		{
			if(alpha % 2 != 0)
			{
				System.out.print(alpha+"\t");
			}
			alpha--;
		}
		while (alpha >= 'a');
	}
}