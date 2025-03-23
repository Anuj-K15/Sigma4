import java.util.*;
public class Q3 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter cost of Pencil :");
        float pencil = sc.nextFloat();
        System.out.println("Enter cost of Pen :");
        float pen = sc.nextFloat();
        System.out.println("Enter cost of Eraser :");
        float eraser = sc.nextFloat();
        float sum = pencil + eraser + pen;
        float gst = sum * 18f / 100f ;
        float total = sum + gst ;
        System.out.println("Total cost including GST is " + total);
    }
}