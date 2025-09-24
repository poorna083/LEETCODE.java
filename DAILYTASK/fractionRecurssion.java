import java.util.*;
class InnerfractionRecurssion {
public String fractionToDecimal(int numerator, int denominator){
    public String fractionToDecimal(int numerator, int denominator) {
        if (numerator == 0) return "0";
        StringBuilder res = new StringBuilder();
        if ((numerator < 0) ^ (denominator < 0)) res.append("-");
        long num = Math.abs((long) numerator);
        long den = Math.abs((long) denominator);
        res.append(num / den);
        long remainder = num % den;
        if (remainder == 0) return res.toString();
        res.append(".");
        Map<Long, Integer> map = new HashMap<>();
        while (remainder != 0) {
            if (map.containsKey(remainder)) {
                res.insert(map.get(remainder), "(");
                res.append(")");
                break;
            }
            map.put(remainder, res.length());
            remainder *= 10;
            res.append(remainder / den);
            remainder %= den;
        }
        return res.toString();
    }   return String.valueOf(result);
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
