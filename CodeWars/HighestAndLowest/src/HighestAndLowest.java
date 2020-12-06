/*
In this little assignment you are given a string of space separated numbers, 
and have to return the highest and lowest number.

Example:

highAndLow("1 2 3 4 5")  // return "5 1"
highAndLow("1 2 -3 4 5") // return "5 -3"
highAndLow("1 9 3 4 -5") // return "9 -5"
 */
public class HighestAndLowest
{
	public static void main(String[] args)
	{
		System.out.println(HighAndLow("-1 -1"));
	}
	
	public static String HighAndLow(String numbers)
	{
		int high = 0;
		int low = 0;
		int aux;
		String[] arrayNumber = new String[numbers.trim().length()];
		arrayNumber = numbers.split(" ");
		for(int i=0; i < arrayNumber.length; i++)
		{
			aux = Integer.parseInt(arrayNumber[i]);
			if(aux != 0 && low == 0)
			{
				low = aux;
			}
			
			if(aux < low)
			{
				low = aux;
			}else if(aux >= high || aux == low)
			{
				high = aux;
			}
		}
		return String.format("%d %d", high, low);
	}
}
