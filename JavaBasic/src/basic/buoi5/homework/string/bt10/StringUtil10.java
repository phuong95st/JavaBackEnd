package basic.buoi5.homework.string.bt10;

public class StringUtil10
{
	public String exchangeFirAndLastChar(String str)
	{
		return str.substring(str.length() - 1) + str.substring(1, str.length() - 1) + str.charAt(0);
	}

	public static void main(String[] args)
	{
		System.out.println(new StringUtil10().exchangeFirAndLastChar("alohahoho"));
	}
}
