import java.util.*;
public class ElseStmt {
    public static void main(String args[]) {
        // Your Code Here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n > 100)
            System.out.println("Big");
        else
            System.out.println("Number");
        sc.close();
    }
}

