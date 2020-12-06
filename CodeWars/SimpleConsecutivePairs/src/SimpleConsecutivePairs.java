public class SimpleConsecutivePairs
{
	
	public static void main(String[] args)
	{

		System.out.println(solve(new int [] {1, 2, 5, 8, -4, -3, 7, 6, 5}));
	}
	public static int solve (int [] arr)
	{
		int count = 0;
		for(int i=0; i < arr.length - 1; i+=2)
		{	
			if(i % 2 == 0)
			{
				if(arr[i] - arr[i + 1] == 1 || arr[i + 1] - arr[i]  == 1 )
				{
					count++;
				}
			}
		}
		return count;
	}
}
