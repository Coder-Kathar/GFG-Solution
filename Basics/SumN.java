import java.util.*;
public class SumN {
    // User function Template for Java
    public int sumOfNumbers(int n) {
        // code here
        return (int) ((n * (n+1)) / 2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        SumN obj = new SumN();
        obj.sumOfNumbers(n);
        sc.close();
    }
}

