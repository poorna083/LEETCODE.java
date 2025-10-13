import java.util.*;
class InnercountingBytes{
    public int [] counting(int n){
        int[] f = new int[n + 1];
    for (int i=1; i<=n; i++) f[i] = f[i >> 1] + (i & 1);
    return f;
    }
}
public class countingBytes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Size:");
        int n = sc.nextInt();
        InnercountingBytes i = new InnercountingBytes();
        System.out.println(i.counting(n));
        sc.close();
    }
}
