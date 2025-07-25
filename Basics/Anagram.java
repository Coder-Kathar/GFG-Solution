import java.util.*;
public class Anagram {
    // User function template for Java
    static int areAnagram(String S1, String S2) {
        // code here
        if(S1.length() != S2.length())
            return 0;
        int freq[] = new int[26];
        for(char ch : S1.toCharArray())
            freq[ch - 'a']++;
        for(char ch : S2.toCharArray())
            freq[ch - 'a']--;
        for(int x : freq)
        {
            if(x != 0)
                return 0;
        }
        return 1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        System.out.println(areAnagram(s1,s2));
        sc.close();
    }
}

