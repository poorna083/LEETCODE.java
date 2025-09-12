import java.util.Scanner;

public class insertionOftwoarrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Size of 1");
        int size = sc.nextInt();
        int [] nums1 = new int[size];
        System.out.println("Size of 2");
        int siz = sc.nextInt();
        int [] nums2 = new int[siz];
        for (int i = 0; i < nums1.length; i++) {
            nums1[i]=sc.nextInt();
        }
        for (int i = 0; i < nums2.length; i++) {
            nums2[i]=sc.nextInt();
        }
    }
}
