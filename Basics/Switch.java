import java.util.*;
public class Switch {
    //Back-end complete function Template for Java
    public static void main(String args[]) {
        // Your Code Here
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        switch(a)
        {
            case 1:
                System.out.println("One");
                break;
            case 2:
                System.out.println("Two");
                break;
            case 3:
                System.out.println("Three");
                break;
            case 4:
                System.out.println("Four");
                break;
            case 5:
                System.out.println("Five");
                break;
            case 6:
                System.out.println("Six");
                break;
            case 7:
                System.out.println("Seven");
                break;
            case 8:
                System.out.println("Eight");
                break;
            case 9:
                System.out.println("Nine");
                break;
            default:
                System.out.println("Unknown");
        }
        sc.close();
    }
}

