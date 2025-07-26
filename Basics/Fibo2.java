import java.util.*;
public class Fibo2 {
    public static void main(String args[]) {
        // Your Code Here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = 0, b = 1, c = 0;
        int i=0;
        while(i < n)
        {
             c = a + b;
             a = b;
             b = c;
             i++;
        }
        System.out.println(a);
        sc.close();
    }
}
