// Program to find out the first & second max from the given array
import java.util.*;

class Sec_Max
{
	public static void main(String[] args)
	{
		Scanner z = new Scanner(System.in);
		int n = z.nextInt();
		int[] arr1 = new int[n];

		// Take the array from user
		for(int i=0; i<n ; i++)
		{
			arr1[i] = z.nextInt();
		}

		// Print the array taken from user 
		for(int i=0 ; i<n ; i++)
		{
			System.out.print(arr1[i] + " ");
		}

		// call the findSum method to check the first 2 max from the given array
		int sum = findSum(arr1, n);
		System.out.println(sum);
	}

	public static int findSum(int[] arr1, int n)
	{
		int max=0, max1=0, temp=0;
		// To find out first max number
		for(int i=0; i<n ; i++)
		{
			if(arr1[i]>max)
			{
				max = arr1[i];
			}
		}
		// to check second max number
		for(int j=0 ; j<n ; j++)
		{
			if(arr1[j]>max1 && max1 < max)
			{
				temp = max1;
				max1 = arr1[j];
				if(max1==max)
				{
					max1=temp;
				}
			}
		}
		// Print the 2 max numbers to check
		System.out.print("\nFirst Max: "+max+"\nSecond Max: "+max1+"\n");

		// return the sum of two max numbers
		return max+max1;
	}
}