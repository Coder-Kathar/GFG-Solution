class Solution {
    int countFreq(int[] arr, int target) {
        // code here
        int count = 0;
        for (int x : arr) {
            if (x == target) count++;
        }
        return count;
    }
}
public class Numocc {
    public static void main(String[] args) {
        Solution obj = new Solution();
        int[] arr = {1, 2, 3, 2, 4, 2, 5};
        int target = 2;
        int result = obj.countFreq(arr, target);
        System.out.println(result);
    }
}
