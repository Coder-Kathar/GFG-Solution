import java.util.*;
public class JavaRelation {
    // User function Template for Java
    static void relationalOperators(int A, int B) {
        // code here
        if(A > B)
            System.out.println(A + " is greater than " + B);
        else if(A < B)
            System.out.println(A + " is less than " + B);
        else
            System.out.println(A + " is equal to " + B);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        relationalOperators(A, B);
        sc.close();
    }
}

