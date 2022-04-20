package basic.buoi5.homework.string.bt5;

public class StringUtil5
{
	public String swapFirst2Char(String str1, String str2)
	{
		return str2.substring(0, 2) + str1.substring(2) + " " + str1.substring(0, 2) + str2.substring(2);
	}

	public static void main(String[] args)
	{
		System.out.println(new StringUtil5().swapFirst2Char("abcd", "xyz"));
	}

}
