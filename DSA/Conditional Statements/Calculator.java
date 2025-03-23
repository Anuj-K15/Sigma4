import java.util.*;
public class Calculator {
    public static void main(String[] args) {
        int a = 6;
        int b = 2;
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter operation to be performed " );
        char operator = scanner.next().charAt(0);
        switch (operator) {
            case '+' -> System.out.println(a+b);
            case '-' -> System.out.println(a-b);
            case '*' -> System.out.println(a*b);
            case '/' -> System.out.println(a/b);
            default -> {
            }
        }
    }
}