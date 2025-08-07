import java.util.*;
public class CheckPow
{
    // User function Template for Java
    public static boolean isPowerOfAnother(int X, int Y) {
        // code here
        if(X == 1 && Y != 1)
            return false;
        int i=0;
        while(true)
        {
            if(Math.pow(X,i) == Y)
                return true;
            if(Math.pow(X,i) > Y)
                return false;
            i++;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        int Y = sc.nextInt();
        System.out.println(isPowerOfAnother(X,Y));
        sc.close();
    }
}