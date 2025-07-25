package Arrays;

import java.util.*;
public class TwoSum {
    public static boolean twoSum(int arr[], int target) {
        // code here
        Set<Integer> s = new HashSet<>();
        for (int x : arr) {
            int diff = target - x;
            if (s.contains(diff)) return true;
            s.add(x);
        }
        return false;
    }
    public static void main(String[] args) {
        int[] arr = {2, 7, 11, 15};
        int target = 9;
        boolean result = twoSum(arr, target);
        System.out.println("Two elements with sum " + target + ": " + result);
    }
}

