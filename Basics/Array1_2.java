import java.util.ArrayList;
import java.util.*;
public class Array1_2 {
    public static ArrayList<Integer> array(int a[][], int b[], int n) {
        // Complete the function
        int sum = 0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(i == j)
                    sum += a[i][j];
            }
        }
        int max = Integer.MIN_VALUE;
        for(int x : b)
        {
            if(max < x)
                max = x;
        }
        ArrayList<Integer> ans = new ArrayList<>();
        ans.add(sum);
        ans.add(max);
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[][] = new int[n][n];
        int b[] = new int[n];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                a[i][j] = sc.nextInt();
            }
        }
        for(int i=0;i<n;i++)
            b[i] = sc.nextInt();
        ArrayList<Integer> ans = array(a, b, n);
        System.out.println(ans);
        sc.close();

    }
}


