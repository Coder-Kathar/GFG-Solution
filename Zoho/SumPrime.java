import java.util.Scanner;
public class SumPrime {
    // User function Template for Java
    static boolean isPrime(int val)
    {
        if(val == 2 || val == 3 || val == 5 || val == 7)
            return true;
        return false;
    }
    static int primeSum(int n) {
        // code here
        int sum = 0;
        while(n != 0)
        {
            if(isPrime(n%10))
                sum += n % 10;
            n /= 10;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(primeSum(n));
        sc.close();   
    }
}
