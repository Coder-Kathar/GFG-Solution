public class FindElement {
    public static int findElementAtIndex(int key, int[] arr) {
        // code here
        return arr[key];
    }

    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        int key = 2;
        int result = findElementAtIndex(key, arr);
        System.out.println("Element at index " + key + " is: " + result);
    }
}

