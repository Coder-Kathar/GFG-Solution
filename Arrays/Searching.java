package Arrays;
import java.util.*;
public class Searching {

    static int search(int arr[], int x) {

        // Your code here
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i] == x)
                return i;
        }
        return -1;
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++)
            arr[i] = sc.nextInt();
        int x = sc.nextInt();
        System.out.println(search(arr,x));
        sc.close();
    }
}