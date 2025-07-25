import java.util.*;
public class Switchstmt {
    // User function Template for Java
    static double switchCase(int choice, List<Double> arr) {
        // code here
        double ans = 0.0;
        switch(choice)
        {
            case 1:
                ans = Math.PI * arr.get(0) * arr.get(0);
                break;
            case 2:
                ans = arr.get(0) * arr.get(1);
                break;
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        String s = sc.nextLine();
        String[] str_arr = s.split("\\s+");
        List<Double> arr = new ArrayList<>();
        for(String x : str_arr)
        {
            double val = (double) Integer.parseInt(x);
            arr.add(val);
        }
        System.out.println(switchCase(choice, arr));
        sc.close();
    }
}

