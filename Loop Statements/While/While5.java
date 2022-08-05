class While5
{
	public static void main(String[] aj)
	{
		char alpha = 'a';
		
		while(alpha <= 'z')
		{
			if(alpha % 2 != 0)
			{
				System.out.println(alpha);
			}
			alpha++;
		}
	}
}