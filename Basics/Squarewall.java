import java.util.*;
public class Squarewall {
    public static void main(String args[]) {
        // Your Code Here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}

