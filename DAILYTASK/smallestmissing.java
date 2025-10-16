import java.util.Scanner;

class Innersmallestmissing {
    public int missingvalue(int[] nums, int value) {
        int[] rem = new int[value];
        for (int x : nums) {
            int r = ((x % value) + value) % value;
            rem[r]++;
        }
        int res = 0;
        while (rem[res % value]-- > 0) res++;
        return res;
    }
}

public class smallestmissing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size: ");
        int size = sc.nextInt();
        int[] array = new int[size];
        System.out.println("Enter the array elements:");
        for (int i = 0; i < size; i++) {
            array[i] = sc.nextInt();
        }
        System.out.print("Enter the value: ");
        int value = sc.nextInt();
        Innersmallestmissing obj = new Innersmallestmissing();
        System.out.println("Smallest missing positive number: " + obj.missingvalue(array, value));
    }
}
