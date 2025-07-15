public class Leap {
    static boolean isLeap(int N) {
        // code here
        if ((N % 4 == 0 && N % 100 != 0) || (N % 400 == 0)) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        int year = 2024;
        if (isLeap(year))
            System.out.println(year + " is a leap year");
        else
            System.out.println(year + " is not a leap year");
    }
}
