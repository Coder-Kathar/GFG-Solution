import java.util.ArrayList;
import java.util.*;
public class Loops {
    // User function Template for Java
    static ArrayList<Integer> getSum(int N) {
        // code here
        ArrayList<Integer> ans = new ArrayList<>();
        int even = 0;
        int odd = 0;
        for(int i=1;i<=N;i++)
        {
            if(i%2==0)
                even += i;
            else
                odd += i;
        }
        ans.add(even);
        ans.add(odd);
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        ArrayList<Integer> ans = getSum(N);
        System.out.println(ans);
        sc.close();
    }
}

