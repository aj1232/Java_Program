class Pattern2
{
	public static void main(String[] Args)
	{
		for(int i=0 ; i<4 ; i++)
		{
			for(int j=0 ; j<4 ; j++)
			{
				if(i==j || (i+j)==3)
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.println(" ");
		}
	}
}