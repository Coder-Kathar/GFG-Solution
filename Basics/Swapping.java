//import java.io.*;
import java.util.*;
// User function Template for Java
public class Swapping {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        // Write Code to Swap
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println(a + " " + b);
        sc.close();
    }
}
