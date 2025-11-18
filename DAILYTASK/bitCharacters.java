import java.util.Scanner;
class InnerbitCharacters {
    public boolean isOneBitCharacter(int[] bits) {
        int n = bits.length;
        int i = 0;
        while(i < n - 1)
            i += bits[i] + 1;
        return i == n - 1;
    }
    
}
public class bitCharacters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int [] bits = new int[size];
        for(int i=0;i<size;i++) bits[i]=sc.nextInt();
        sc.close();
    }
}
