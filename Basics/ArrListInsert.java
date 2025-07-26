import java.util.*;
public class ArrListInsert {
    public static ArrayList<Integer> fillArrayList(int arr[]) {
        // Your code here
        ArrayList<Integer> ans = new ArrayList<>();
        for(int x : arr)
            ans.add(x);
        return ans;
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++)
            arr[i] = sc.nextInt();
        ArrayList<Integer> ans = fillArrayList(arr);
        System.out.println(ans);
        sc.close();
    }
}
