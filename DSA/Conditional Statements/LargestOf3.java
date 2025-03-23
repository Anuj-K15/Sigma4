public class LargestOf3 {
    public static void main(String[] args) {
        int a = 6;
        int b = 4;
        int c = 2;

        if (a > b && a > c) {
            System.out.println( a + " is greater than " + b + " & " + c );
        }
        else if (b > a && b > c) {
            System.out.println( b + " is greater than " + a + " & " + c );
        }
        else {
            System.out.println( c + " is greater than " + a + " & " + b );
        }
    }
}