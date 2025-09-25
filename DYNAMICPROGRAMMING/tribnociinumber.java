import java.util.Scanner;
class Innertribnociinumber{
    public int tribnocii(int n){
        if(n<=0)return 0;
        if (n < 2) return n;
        int a = 0, b = 1, c = 1, d;
        while (n-- > 2) {
            d = a + b + c;
            a = b;
            b = c;
            c = d;
        }
        return c;
    }
}
public class tribnociinumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The number");
        int n = sc.nextInt();
        Innertribnociinumber i = new Innertribnociinumber();
        System.out.println(i.tribnocii(n));

    }
}
