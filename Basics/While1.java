import java.util.*;
public class While1 {
    public static void solve() {
        Scanner sc = new Scanner(System.in);
        // Your Code Here
        int n = sc.nextInt();
        while(n >= 0)
        {
            System.out.print(n + " ");
            n--;
        }
        sc.close();
    }
    public static void main(String[] args) {
        solve();
    }
}

