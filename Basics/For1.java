import java.util.*;
public class For1 {
    public static void solve() {
        // Your Code Here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1;i<=10;i++)
        {
            System.out.print(i*n + " ");
        }
        sc.close();
    }
    public static void main(String[] args) {
        solve();
    }
}

