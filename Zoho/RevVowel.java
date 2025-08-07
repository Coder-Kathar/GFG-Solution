import java.util.Scanner;

public class RevVowel {
    // User function Template for Java
    static boolean isVowel(char c)
    {
        if("aeiou".indexOf(c) != -1)
            return true;
        return false;
    }
    static String modify(String s) {
        // your code here
        char[] ch = s.toCharArray();
        int i = 0;
        int j = s.length()-1;
        while(i < j)
        {
            boolean ibool = isVowel(ch[i]);
            boolean jbool = isVowel(ch[j]);
            if(ibool && jbool)
            {
                char temp = ch[i];
                ch[i] = ch[j];
                ch[j] = temp;
                i++;
                j--;
            }
            if(!ibool)
                i++;
            if(!jbool)
                j--;
        }
        return new String(ch);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(modify(s));
        sc.close();
    }
}

