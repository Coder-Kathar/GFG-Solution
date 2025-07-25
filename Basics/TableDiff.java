import java.util.*;
public class TableDiff {
    // User function Template for Java
    public static void difference(int n1, int n2) {
        // Write your code here
        for(int i=1;i<=10;i++)
        {
            System.out.print((n1*i) - (n2*i) + " ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        difference(n1, n2);
        sc.close();
    }
}

