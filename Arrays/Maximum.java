package Arrays;
import java.util.*;
public class Maximum {
    public static int largest(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int x : arr) {
            if (x > max)
                max = x;
        }
        return max;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int result = largest(arr);
        System.out.println("Largest element: " + result);
        sc.close();
    }
}
