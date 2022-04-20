package basic.buoi5.homework.string.bt8;

import java.util.ArrayList;
import java.util.List;

public class StringUtil8
{
	public void longestWord(String str)
	{
		String[] listWord = str.split(" ");
		String longestWord = "";
		for (String word : listWord)
		{
			if (word.length() > longestWord.length())
			{
				longestWord = word;
			}
		}
		System.out.println("Longest word: " + longestWord);
		System.out.println("Length of the longest word: " + longestWord.length());
	}

	public void longestWord2(String str)
	{
		String[] listWord = str.split(" ");
		String longestWord = "";
		List<String> listLogestWord = new ArrayList<>();
		for (String word : listWord)
		{
			if (word.length() > longestWord.length())
			{
				longestWord = word;
				// xoa toan bo phan tu
				listLogestWord.clear();
				listLogestWord.add(longestWord);
			}
			else
			{
				listLogestWord.add(word);
			}
		}

		// print
		StringBuilder out = new StringBuilder();
		out.append("Longest word:");
		for (String word : listLogestWord)
		{
			out.append(String.format(" %s,", word));
		}
		out.deleteCharAt(out.length() - 1);

		System.out.println(out);
		System.out.println("Length of the longest word: " + longestWord.length());
	}


	public static void main(String[] args)
	{
		new StringUtil8().longestWord("Exercises");
		new StringUtil8().longestWord("new aloha hello world");
		new StringUtil8().longestWord2("new aloha hello world");
	}
}
