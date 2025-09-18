import java.util.Scanner;

class Innerpower {
    public double myPow(double x, int n) {
        if (n == 0) return 1;
        if (n < 0) return 1 / myPow(x, -n);
        
        double half = myPow(x, n / 2);
        if (n % 2 == 0) {
            return half * half;
        } else {
            return half * half * x;
        }
    }
}
public class power {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();
        int n = sc.nextInt();
        Innerpower i = new Innerpower();
        System.out.printf("%.5f\n", i.myPow(x, n));
        sc.close();
    }
}
