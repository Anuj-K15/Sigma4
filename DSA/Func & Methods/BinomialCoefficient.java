public class BinomialCoefficient {
    
    public static int factorial(int n) {
        int f = 1;
        for (int i=1; i<=n; i++) {
            f = f * i;
        }
        return f; 
    }

    public static int binoCoeff (int n, int r) {
        int nFact = factorial(n);
        int rFact = factorial(r);
        int nrFact = factorial(n-r);
        
        int binoCoeff = nFact / (rFact * nrFact);
        return binoCoeff;
    }

    public static void main(String args[]) {
         System.out.println(binoCoeff(5, 2));
    }
}
