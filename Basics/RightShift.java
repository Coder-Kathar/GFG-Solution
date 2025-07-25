import java.util.*;
public class RightShift {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        // Perform operation and print
        int ans = a >> b;
        System.out.println(ans);
        sc.close();
    }
}

