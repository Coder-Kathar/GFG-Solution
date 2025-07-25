import java.util.*;
public class Lcm {
    // User function Template for Java
    public static int LCM(int a, int b) {

        // write your code here
        int gcd = 0;
        for(int i=1;i<=a && i<=b;i++)
        {
            if(a%i==0 && b%i==0)
                gcd = i;
        }
        // return LCM of a and b
        return (int)((a*b) / gcd);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(LCM(a, b));
        sc.close();
    }
}

