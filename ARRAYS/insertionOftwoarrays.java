import java.util.*;

class insertionoftwo {
    public int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer, Integer> count = new HashMap<>();
        for (int n : nums1) {
            count.put(n, count.getOrDefault(n, 0) + 1);
        }
        List<Integer> result = new ArrayList<>();
        for (int n : nums2) {
            if (count.getOrDefault(n, 0) > 0) {
                result.add(n);
                count.put(n, count.get(n) - 1);
            }
        }
        int[] intersection = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            intersection[i] = result.get(i);
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
