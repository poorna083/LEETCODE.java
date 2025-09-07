import java.util.*;

class NextGreaterEle {
    public int[] greaterElement(int[] array1, int[] array2, int size1) {
        int[] array3 = new int[size1];
        for (int i = 0; i < array1.length; i++) {
            int index = -1;
            for (int j = 0; j < array2.length; j++) {
                if (array2[j] == array1[i]) {
                    index = j;
                    break;
                }
            }
            int nextGreater = -1;
            if (index != -1) {
                for (int k = index + 1; k < array2.length; k++) {
                    if (array2[k] > array1[i]) {
                        nextGreater = array2[k];
                        break;
                    }
                }
            }
            array3[i] = nextGreater;
        }
        return array3;
    }
}

public class nextGreaterelement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size1 = sc.nextInt();
        int size2 = sc.nextInt();
        int[] array1 = new int[size1];
        int[] array2 = new int[size2];
        for (int i = 0; i < size1; i++) {
            array1[i] = sc.nextInt();
        }
        for (int i = 0; i < size2; i++) {
            array2[i] = sc.nextInt();
        }
        NextGreaterEle n = new NextGreaterEle();
        int[] result = n.greaterElement(array1, array2, size1);
        for (int val : result) {
            System.out.print(val + " ");
        }
    }
}
