import java.util.*;
class InnerritchCustomer {
    public int maximumWealth(int[][] array) {
        int res = 0;
        for(int i =0;i<array.length;i++){
            int temp = 0;
            for(int j = 0;j<array[i].length;j++){
                temp+=array[i][j];
            }
            res = Math.max(res,temp);
        }
        return res;
    }
    
}
public class ritchCustomer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[][] array = new int[size][size];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = sc.nextInt();
            }
        }
        InnerritchCustomer i = new InnerritchCustomer();
        System.out.println(i.maximumWealth(array));
    }
}

