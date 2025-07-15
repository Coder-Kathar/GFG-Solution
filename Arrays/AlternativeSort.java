package Arrays;

import java.util.*;
public class AlternativeSort {
    public static ArrayList<Integer> alternateSort(int[] arr) {
        // Your code goes here
        ArrayList<Integer> ans = new ArrayList<>();
        Arrays.sort(arr);
        int l = 0;
        int h = arr.length - 1;
        while (l <= h) {
            if (l == h)
                ans.add(arr[h]);
            else {
                ans.add(arr[h]);
                ans.add(arr[l]);
            }
            h--;
            l++;
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 2, 8, 7};
        ArrayList<Integer> result = alternateSort(arr);
        System.out.println(result);
    }
}
