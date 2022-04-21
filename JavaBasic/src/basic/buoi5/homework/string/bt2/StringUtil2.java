package basic.buoi5.homework.string.bt2;

import basic.buoi5.homework.string.bt13.StringUtil13;

import java.util.ArrayList;
import java.util.List;

public class StringUtil2
{
	public int countCharOfStr(char c, String str)
	{
		char[] inputChar = str.toCharArray();
		int count = 0;
		for (char value : inputChar)
		{
			if (c == value)
			{
				count++;
			}
		}
		return count;
	}

	public void countNumberOfChar(String str)
	{
		List<Character> listCharLoopped = new ArrayList<>();

		StringBuilder out = new StringBuilder("{");
		for (int i = 0; i < str.length(); i++)
		{
			char c = str.charAt(i);
			if (!listCharLoopped.contains(c))
			{
				out.append("'").append(c).append("': ").append(this.countCharOfStr(c, str)).append(",");
				listCharLoopped.add(c);
			}
		}
		out = new StringBuilder(out.substring(0, out.length() - 1));
		out.append("}");
		System.out.println(out);
	}

	public void countNumberOfChar2(String str)
	{
		// loop every char of str
		String strLooped = "";
		String out = "{";
		for (int i = 0; i < str.length(); i++)
		{
			//System.out.println(strLooped.indexOf(String.valueOf(str.charAt(i))));

			int count = 0;
			if (strLooped.indexOf(String.valueOf(str.charAt(i))) < 0)
			{
				for (int j = i; j < str.length(); j++)
				{
					if (str.charAt(i) == str.charAt(j))
					{
						count++;
					}
				}
				strLooped += String.valueOf(str.charAt(i));
				out += String.format("'%c': %d,", str.charAt(i), count);
			}
			//System.out.println(strLooped);
		}
		System.out.println(out.substring(0, out.length() - 1) + "}");
	}

	public static void main(String[] args)
	{
		new StringUtil2().countNumberOfChar("google.com");
		new StringUtil2().countNumberOfChar2("google.com");
	}

}
