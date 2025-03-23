import java.util.*;
public class Print1toN {
    public static void main(String[] args) {
        int i = 1;
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        while (i <= n) {
            System.out.println(i);
            i++;
        }
    }
}