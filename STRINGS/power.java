import java.util.Scanner;

class Innerpower {
    public double myPow(double d, int n) {
        if (n == 0) {
            return 1;
        }
        if (n < 0) {
            return 1 / myPow(d, -n); 
        }
        return d * myPow(d, n - 1);
    }
}

public class power {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double d = sc.nextDouble();
        int n = sc.nextInt();
        Innerpower i = new Innerpower();
        System.out.println(i.myPow(d, n));
        sc.close();
    }
}
