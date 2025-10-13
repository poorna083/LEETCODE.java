import java.util.*;
class InnercountingBytes{
    public int [] counting(int [] array){
        int[] f = new int[array.length + 1];
    for (int i=1; i<=array.length; i++) f[i] = f[i >> 1] + (i & 1);
    return f;
    }
}
public class countingBytes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Size:");
        int size = sc.nextInt();
        System.out.println("Enter The array:");
        int [] array = new int[size];
        for(int i=0;i<size;i++){
            array[i]=sc.nextInt();
        }
        sc.close();
    }
}
