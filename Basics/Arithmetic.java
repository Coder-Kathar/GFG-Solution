import java.util.*;
public class Arithmetic {
    public static int[] computeOperations(int x, int y) {
        // code here
        int p = x + y; 
        int q = x - y;
        int r = x * y;
        int s = x / y;
        int t = x % y;
        int ans[] = new int[5];
        ans[0] = p;
        ans[1] = q;
        ans[2] = r;
        ans[3] = s;
        ans[4] = t;
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int[] ans = computeOperations(x,y);
        System.out.println(Arrays.toString(ans)); 
        sc.close();
    }
}

