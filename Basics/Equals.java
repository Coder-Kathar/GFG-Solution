import java.util.Scanner;

public class Equals {
    // User function Template for Java
    public static boolean areEqual(int a[], int b[]) {
        // Your code here
        if(a.length != b.length)
            return false;
        for(int i=0;i<a.length;i++)
        {
            if(a[i] != b[i])
                return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        int b[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            b[i] = sc.nextInt();
        }
        System.out.println(areEqual(a, b));
        sc.close();
    }
}

