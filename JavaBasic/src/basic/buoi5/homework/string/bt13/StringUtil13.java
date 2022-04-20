package basic.buoi5.homework.string.bt13;

import java.util.Scanner;

public class StringUtil13
{
	public static String inputString()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Please type a string: ");
		return sc.nextLine();
	}

	public void displayString()
	{
		String input = StringUtil13.inputString();

		System.out.println("Upper case: " + input.toUpperCase());
		System.out.println("Lower case: " + input.toLowerCase());

	}

	public static void main(String[] args)
	{
		new StringUtil13().displayString();
	}
}
