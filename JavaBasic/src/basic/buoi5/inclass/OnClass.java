package basic.buoi5.inclass;

public class OnClass {

    public static void main(String[] args) {
        String a = "apple";
        String b = "" + a;
        System.out.println(a.equals(b));
        System.out.println(a == b);

        String s1 = null;
        String s2 = "abc";
        //System.out.println(s1.equals(s2));
        System.out.println(s2.equals(s1));
    }
}
