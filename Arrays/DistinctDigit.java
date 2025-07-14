package Arrays;

import java.util.*;
public class DistinctDigit {
    public  static int[] common_digits(int[] nums)
    {
        // code here
        int[] freq = new int[10];
        for(int x : nums)
        {
            while(x != 0)
            {
                freq[x%10]++;
                x/=10;
            }
        }
        List<Integer> arr = new ArrayList<>();
        for(int i=0;i<freq.length;i++)
        {
            if(freq[i] > 0)
                arr.add(i);
        }
        int ans[] = new int[arr.size()];
        for(int i=0;i<ans.length;i++)
        {
            ans[i] = arr.get(i);
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++)
            arr[i] = sc.nextInt();
        int[] ans = common_digits(arr);
        System.out.println(Arrays.toString(ans));
        sc.close();
    }
}

