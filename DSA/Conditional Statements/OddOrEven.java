import java.util.*;
public class OddOrEven {
    public static void main(String[] args) {
        System.out.println("Enter any number :");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if (a % 2 == 0) {
            System.out.println(a + " is even");
        }
        else {
            System.out.println(a + " is odd");
        }
    }
}