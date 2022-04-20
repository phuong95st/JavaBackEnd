package basic.buoi5.homework.string.bt11;


public class StringUtil11
{
	public String removeOddIndexChar(String str)
	{
		StringBuilder out = new StringBuilder();
		for (int i = 0; i < str.length(); i += 2)
		{
			out.append(str.charAt(i));
		}
		return out.toString();
	}

	public static void main(String[] args)
	{
		System.out.println(new StringUtil11().removeOddIndexChar("RemoveOddIndexChar"));
	}
}
