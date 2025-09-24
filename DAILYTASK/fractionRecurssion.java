import java.util.*;
class InnerfractionRecurssion {
public String fractionToDecimal(int numerator, int denominator){
    double result = (double) numerator / denominator;
        return String.valueOf(result);
}
    
}
public class fractionRecurssion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numerator = sc.nextInt();
        int denominator = sc.nextInt();
        InnerfractionRecurssion i = new InnerfractionRecurssion();
        System.out.println(i.fractionToDecimal(numerator, denominator));
        sc.close();
    }
}
