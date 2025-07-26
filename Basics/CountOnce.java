import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class CountOnce {
    // User function Template for Java
    public static int countOnce(int arr[]) {
        // Your code here
        // Arrays.sort(arr);
        // int count = 1;
        // for(int i=0;i<arr.length-1;i++)
        // {
        //     if(arr[i] != arr[i+1])
        //         count++;
        // }
        // return count;
        Set<Integer> set = new HashSet<>();
        for(int x : arr)
        {
            set.add(x);
        }
        return set.size();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++)
            arr[i] = sc.nextInt();
        System.out.println(countOnce(arr));
        sc.close();
    }
}


