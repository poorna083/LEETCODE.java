import java.util.Scanner;
class InnerarrangeCoins {
    public int arrangeCoins(int n) {
        int i = 1;
		while(n > 0){ 
			i++; 
			n = n-i; 
		}
		return i-1; 
    }
    
}
public class arrangeCoins {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The N:");
        int n = sc.nextInt();
        InnerarrangeCoins i = new InnerarrangeCoins();
        System.out.println(i.arrangeCoins(n));
        sc.close();
    }
}
