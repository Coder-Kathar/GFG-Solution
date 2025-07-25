import java.util.Scanner;

public class Gcd {
    // User function Template for Java
    public static int gcd(int a, int b) {

        // code here to calculate and return gcd of a and b
        int gcd_num = 0;
        for(int i=1;i<=a && i<=b;i++)
        {
            if(a%i==0 && b%i==0)
                gcd_num = i;
        }
        return gcd_num;
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int ans = gcd(a, b);
        System.out.println(ans);
        sc.close();
    }
}

