package basic.buoi6;

import java.util.Random;

public class StringBuilderUtil
{
	public void bt1(char[] chars)
	{
		StringBuilder sb = new StringBuilder();
		for (char c : chars)
		{
			sb.append(c);
		}
		System.out.println(sb);
	}

	public char randomChar()
	{
		String anphabet = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
		return anphabet.charAt(new Random().nextInt(anphabet.length()));
	}

	public void bt2()
	{
		StringBuilder sb = new StringBuilder();
		int i = 0;
		while (i < 5000)
		{
			sb.append(this.randomChar());
			i++;
		}
		System.out.println(sb);
	}

	public static void main(String[] args)
	{
		StringBuilderUtil sbu = new StringBuilderUtil();
		sbu.bt1(new char[]{'a','c','y','i','o','d'});
		sbu.bt2();
		//System.out.println(sbu.randomChar());
	}
}
