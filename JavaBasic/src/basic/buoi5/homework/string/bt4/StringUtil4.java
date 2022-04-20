package basic.buoi5.homework.string.bt4;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;

public class StringUtil4
{

	public String replaceString(String str)
	{
		String[] strInput = str.split("");
		List<String> listStrLopped = new ArrayList<>();
		String out = str;
		for (int i = 0; i < strInput.length; i++)
		{
			if (!listStrLopped.contains(strInput[i]))
			{
				out = out.substring(0, i + 1) + out.substring(i + 1).replaceAll(strInput[i], Matcher.quoteReplacement("$"));
				listStrLopped.add(strInput[i]);
			}
		}
		return out;

	}

	public String replaceString2(String str)
	{
		String firstChar = str.substring(0, 1);
		return firstChar + str.substring(1).replaceAll(firstChar, Matcher.quoteReplacement("$"));
	}

	public static void main(String[] args)
	{
		System.out.println(new StringUtil4().replaceString("restart"));
		System.out.println(new StringUtil4().replaceString2("restart"));
	}
}
