package Strings;

public class Removech {

    static String removeChars(String str1, String str2) {
        // code here
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str1.length(); i++) {
            char ch = str1.charAt(i);
            if (str2.indexOf(ch) == -1)
                sb.append(ch);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String str1 = "computer";
        String str2 = "cat";
        String result = removeChars(str1, str2);
        System.out.println(result);
    }
}
