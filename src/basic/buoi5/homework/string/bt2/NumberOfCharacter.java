package basic.buoi5.homework.string.bt2;

import java.util.ArrayList;
import java.util.List;

public class NumberOfCharacter {
    public int countCharOfStr(char c, String str) {
        char[] inputChar = str.toCharArray();
        int count = 0;
        for (int i = 0; i < inputChar.length; i++) {
            if (c == inputChar[i]) {
                count++;
            }
        }
        return count;
    }

    public void countNumberOfChar(String str) {
        List<Character> listCharLoopped = new ArrayList<Character>();

        String out = "{";
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (!listCharLoopped.contains(c)) {
                out += "'" + c + "': " + this.countCharOfStr(c, str) + ",";
                listCharLoopped.add(c);
            }
        }
        out = out.substring(0, out.length() - 1);
        out += "}";
        System.out.println(out);
    }

    public static void main(String[] args) {
        new NumberOfCharacter().countNumberOfChar("google.com");
    }

}
