import java.util.*;
public class Ifstmt {
    public static void solve() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // check whether n is big or a number
        if(n > 100)
            System.out.println("Big");
        System.out.println("Number");
        sc.close();
    }
    public static void main(String[] args) {
        solve();
    }
}

