import java.util.Scanner;
import java.util.*;
class InnerheightChecker {
    public int heightChecker(int[] heights) {
        int[] expected = heights.clone();
        Arrays.sort(expected);
        int count = 0;
        for (int i = 0; i < heights.length; i++) {
            if (heights[i] != expected[i])
                count++;
        }
        return count;
    }
    
}
public class heightChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int [] array = new int[size];
        for(int i=0;i<size;i++){
            array[i]=sc.nextInt();
        }
    InnerheightChecker i = new InnerheightChecker();
    System.out.println(i.heightChecker(array));
    }
}
