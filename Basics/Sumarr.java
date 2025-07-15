public class Sumarr {
    static int arraySum(int arr[]) {
        // code here
        int sum = 0;
        for (int x : arr) {
            sum += x;
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] arr = {5, 10, 15, 20};
        int result = arraySum(arr);
        System.out.println("Sum of array elements: " + result);
    }
}
