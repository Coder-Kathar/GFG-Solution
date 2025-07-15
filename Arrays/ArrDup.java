package Arrays;

import java.util.*;
class Solution {
    public List<Integer> findDuplicates(int[] arr) {
        // code here
        int freq[] = new int[1000001];
        for (int x : arr)
        freq[x]++;
        List<Integer> ans = new ArrayList<>();
        for (int i = 0; i < freq.length; i++) {
            if (freq[i] > 1)
            ans.add(i);
        }
        return ans;
    }
}    
public class ArrDup {
    public static void main(String[] args) {
        Solution obj = new Solution();
        int[] arr = {4, 3, 2, 7, 8, 2, 3, 1};
        List<Integer> result = obj.findDuplicates(arr);
        System.out.println("Duplicate elements: " + result);
    }
}

