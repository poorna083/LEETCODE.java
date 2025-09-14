import java.util.Scanner;
import java.util.ArrayList;
import java.util.*;

class InnerinsertionofTwoarray {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        for (int n : nums1) {
            set1.add(n);
        }

        Set<Integer> resultSet = new HashSet<>();
        for (int n : nums2) {
            if (set1.contains(n)) {
                resultSet.add(n);
            }
        }

        int[] result = new int[resultSet.size()];
        int i = 0;
        for (int val : resultSet) {
            result[i++] = val;
        }
        return result;
    }
}
public class insertionofTwoarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array1: ");
        int n1 = sc.nextInt();
        int[] array1 = new int[n1];
        System.out.println("Enter elements of array1:");
        for (int i = 0; i < n1; i++) {
            array1[i] = sc.nextInt();
        }
        System.out.print("Enter size of array2: ");
        int n2 = sc.nextInt();
        int[] array2 = new int[n2];
        System.out.println("Enter elements of array2:");
        for (int i = 0; i < n2; i++) {
            array2[i] = sc.nextInt();
        }
        InnerinsertionofTwoarray helper = new InnerinsertionofTwoarray();
        int[] result = helper.intersection(array1, array2);
        System.out.println("Intersection of arrays:");
        for (int val : result) {
            System.out.print(val + " ");
        }
    }
}
