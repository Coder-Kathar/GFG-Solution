import java.util.*;
public class ElseifStmt {
    public static void solve() {
        // Your Code Here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n > 100)
            System.out.println("Big");
        else if(n < 10)
            System.out.println("Small");
        else
            System.out.println("Number");
        sc.close();
    }
    public static void main(String[] args) {
        solve();
    }
}

