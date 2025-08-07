package Zoho;
import java.util.*;
public class CountChar
{
    // User function Template for Java
     static int getCount(String S, int N) {
        // your code here
        StringBuilder ans = new StringBuilder();
        int i=0;
        while(i<S.length() && i+1 < S.length())
        {
            if(S.charAt(i) != S.charAt(i+1))
                ans.append(S.charAt(i));
        }
        if(ans.charAt(ans.length()-1) != S.charAt(S.length()-1))
            ans.append(S.charAt(S.length()-1));
        Map<Character,Integer> map = new HashMap<>();
        for(char ch : ans.toString().toCharArray())
        {   
            map.put(ch, map.getOrDefault(ch,0)+1);
        }
        int count = 0;
        for(Character c : map.keySet())
        {
            if(map.get(c) == N)
                count++;
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();
        int N = sc.nextInt();
        System.out.println(getCount(S,N));
        sc.close();                 
    }
}