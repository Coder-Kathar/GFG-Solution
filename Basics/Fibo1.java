import java.util.*;
public class Fibo1
{
    public static int fibonacci(int n) {
        // Write your code here to calculate
        // to calculate the nth fibonacci number
        if(n == 0)
            return 0;
        else if(n == 1)
            return 1;
        else
            return fibonacci(n-1) + fibonacci(n-2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(fibonacci(n));
        sc.close();        
    }
}