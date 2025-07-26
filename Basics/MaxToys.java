import java.util.Arrays;
import java.util.*;
public class MaxToys {
    // User function Template for Java
    public static int max_toys(int arr[], int k) {
        // Your code here
        Arrays.sort(arr);
        int count = 0;
        for(int x : arr)
        {
            if(k > 0 && x <= k)
            {
                k -= x;
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++)
            arr[i] = sc.nextInt();
        int k = sc.nextInt();
        System.out.println(max_toys(arr, k));
        sc.close();
    }
}

