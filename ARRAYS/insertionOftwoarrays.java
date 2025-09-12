import java.util.*;

class insertionoftwo {
    public int[] insertionoftwoArray(int[] nums1, int[] nums2) {
        // Use HashSet to store unique elements
        Set<Integer> set1 = new HashSet<>();
        for (int n : nums1) {
            set1.add(n);
        }

        Set<Integer> result = new HashSet<>();
        for (int n : nums2) {
            if (set1.contains(n)) {
                result.add(n); // intersection
            }
        }

        // Convert Set -> Array
        int[] intersection = new int[result.size()];
        int i = 0;
        for (int n : result) {
            intersection[i++] = n;
        }

        return intersection;
    }
}

public class insertionOftwoarrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Size of 1");
        int size1 = sc.nextInt();
        int[] nums1 = new int[size1];
        System.out.println("Enter elements of first array:");
        for (int i = 0; i < size1; i++) {
            nums1[i] = sc.nextInt();
        }

        System.out.println("Size of 2");
        int size2 = sc.nextInt();
        int[] nums2 = new int[size2];
        System.out.println("Enter elements of second array:");
        for (int i = 0; i < size2; i++) {
            nums2[i] = sc.nextInt();
        }

        insertionoftwo it = new insertionoftwo();
        int[] result = it.insertionoftwoArray(nums1, nums2);

        System.out.println("Intersection: " + Arrays.toString(result));
    }
}
