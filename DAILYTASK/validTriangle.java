import java.util.*;
class InnervalidTriangle {
    public int triangleNumber(int[] array) {
        Arrays.sort(array);
        int n = array.length;
        int count = 0;
        for (int i = n - 1; i >= 2; i--) {
            int left = 0, right = i - 1;
            while (left < right) {
                if (array[left] + array[right] > array[i]) {
                    count += right - left;
                    right--;
                } else {
                    left++;
                }
            }
        }
        return count;
    }
    
}

public class validTriangle {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int size = sc.nextInt();
       int [] array = new int[size];
       for (int i = 0; i < size; i++) {
        array[i]=sc.nextInt();
       } 
       InnervalidTriangle i = new InnervalidTriangle();
       System.out.println(i.triangleNumber(array));
    }
}
