/*
 The goal of this exercise is to convert a string to a new string where each
 character in the new string is "(" if that character appears only once in the
 original string, or ")" if that character appears more than once in the original
 string. Ignore capitalization when determining if a character is a duplicate.
 
Examples
"din"      =>  "((("
 */
public class DuplicateEncoder
{
	public static void main(String[] args)
	{
		System.out.println(encode("Success"));
	}
	
	public static String encode(String word)
	{
		//Array de caracteres
		String result = "";
		word = word.toLowerCase();
		char[] brokenString = new char[word.length()];
		for(int i=0; i < word.length(); i++)
		{
			brokenString[i] = word.charAt(i);
		}
		for(int i=0; i < word.length();i++)
		{
			int aux = 0;
			for(int j=0; j < word.length(); j++)
			{
				if(word.charAt(i) == word.charAt(j))
				{
					aux++;
				}
			}
			if(aux >= 2)
			{
				result += ")";
			}else
			{
				result += "(";
			}
		}
		word = result;
		return word;
	}
}
