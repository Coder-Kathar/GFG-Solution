import java.util.ArrayList;
import java.util.Collections;
import java.util.*;
public class DistinctSort {
   // User function Template for Java
    public static ArrayList<Integer> uniqueSorted(int arr[]) {
        // Your code here
        ArrayList<Integer> ans = new ArrayList<>();
        for(int x : arr)
        {
            if(!ans.contains(x))
                ans.add(x);
        }
        Collections.sort(ans);
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++)
            arr[i] = sc.nextInt();
        ArrayList<Integer> ans = uniqueSorted(arr);
        System.out.println(ans);
        sc.close();
    }
} 

