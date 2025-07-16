public class ReverseStr {
    static String revStr(String s) {
        // code here
        char[] ch = s.toCharArray();
        int i=0, j=s.length()-1;
        while(i < j)
        {
            char temp = ch[i];
            ch[i] = ch[j];
            ch[j] = temp;
            i++;
            j--;
        }
        return new String(ch);
    }
    public static void main(String[] args) {
        String s = "Hello";
        System.out.println(revStr(s));
    }
}
