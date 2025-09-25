import java.util.Scanner;
class InnerdivisorGame{
    public boolean Divisor(int n){
        if(n%2==0)return true;
        return false;
    }
}

public class divisorGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        InnerdivisorGame i = new InnerdivisorGame();
        System.out.println(i.Divisor(n));
    }
}
