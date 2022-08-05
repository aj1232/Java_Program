// Find Secreat key if msg = 34567835 then the key is 2.
// because 3 & 5 repeating so the key is 2.

import java.util.Scanner;
class Secret_Key
{

	public static int findKey(int msg)
	{
		int msg1 = msg;
		int msg2=0, count=0;
		int temp = msg;

		// take 1 digit from msg1 & compare it with msg2's all digit
		while(msg1!=0)
		{
			int rem = msg1%10;
			msg1/=10;
			temp = msg1;
			msg2 = temp;
			
			while(msg2!=0)
			{
				int rem2 = msg2%10;
				msg2/=10;
				// if digits get matched then increase count by 1
				if(rem == rem2)
				{
					count++;
				}
			}
		}
		return count;
	}

	public static void main(String[] args)
	{
		Scanner z = new Scanner(System.in);
		int msg = z.nextInt();

		// take the input from user & pass it to the findKey method
		System.out.println(" The hidden key is : "+findKey(msg));
	}
}