import java.util.*;
public class Q1 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st number: ");
        double a = sc.nextDouble();
        System.out.println("Enter 2nd number: ");
        double b = sc.nextDouble();
        System.out.println("Enter 3rd number: ");
        double c = sc.nextDouble();
        double avg = (a + b + c) / 3;
        System.out.println("Average of three numbers is " + avg);
    }
}