import java.util.*;
public class IncomeTaxCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the total income :");
        int income = sc.nextInt();
        
        if (income < 500000) {
            double tax = 0 * income;
            System.out.println("As per 0% tax on income below 5Lakh, the tax levied is " + tax);
        }
        else if (income > 500000 && income < 1000000) {
            double tax1 = 0.2 * income;
            System.out.println("As per 20% tax on income between 5Lakh to 10Lakh, the tax levied is " + tax1);
        }
        else if (income > 1000000) {
            double tax2 = 0.3 * income;
            System.out.println("As per 30% tax on income above 10Lakh, the tax levied is " + tax2);
        }
    }
}