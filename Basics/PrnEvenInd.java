import java.util.*;
public class PrnEvenInd {
    public static void printEvenIndices(String s) {
        // code here
        for(int i=0;i<s.length();i++)
        {
            if(i%2==0)
                System.out.print(s.charAt(i));
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        printEvenIndices(s);
        sc.close();
    }
}

