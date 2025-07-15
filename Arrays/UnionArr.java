package Arrays;

import java.util.*;
public class UnionArr {
    public static int findUnion(int a[], int b[]) {
        // code here
        Set<Integer> ans = new HashSet<>();
        for (int x : a) ans.add(x);
        for (int y : b) ans.add(y);
        return ans.size();
    }
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        int[] b = {1, 2, 3};
        int result = findUnion(a, b);
        System.out.println(result);
    }
}
