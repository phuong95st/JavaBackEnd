package basic.buoi5.homework.string.bt6;

public class StringUtil6
{
	public String addIng(String str)
	{
		if (str.length() < 3)
		{
			return str;
		}
		if (str.substring(str.length() - 3).equalsIgnoreCase("ing"))
		{
			return str + "ly";
		}
		return str + "ing";
	}

	public static void main(String[] args)
	{
		System.out.println(new StringUtil6().addIng("abc"));
		System.out.println(new StringUtil6().addIng("string"));
		System.out.println(new StringUtil6().addIng("st"));
	}
}
