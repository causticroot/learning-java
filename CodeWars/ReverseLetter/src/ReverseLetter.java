/*
 Task
Given a string str, reverse it omitting all non-alphabetic characters.

Example
For str = "krishan", the output should be "nahsirk".

For str = "ultr53o?n", the output should be "nortlu".

Input/Output
[input] string str

A string consists of lowercase latin letters, digits and symbols.
*/
public class ReverseLetter
{
	public static void main(String[] args)
	{
		System.out.println(reverseLetter("ab[_]c3"));
	}
	
	public static String reverseLetter(String str)
	{
        StringBuffer insteadString = new StringBuffer(str).reverse(); 
        return insteadString.toString().replaceAll("[\\W\\d_]", "");
    }
}
