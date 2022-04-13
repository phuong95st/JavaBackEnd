package basic.buoi5.homework.string.bt4;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;

public class ReplaceString {

    public String replaceString(String str) {
        String[] strInput = str.split("");
        List<String> listStrLopped = new ArrayList<String>();
        String out = str;
        for (int i = 0; i < strInput.length; i++) {
            if (!listStrLopped.contains(strInput[i])) {
                out = out.substring(0, i + 1) + out.substring(i + 1).replaceAll(strInput[i], Matcher.quoteReplacement("$"));
                listStrLopped.add(strInput[i]);
            }
        }
        return out;

    }

    public static void main(String[] args) {
        System.out.println(new ReplaceString().replaceString("restarti"));
    }
}
