import java.util.Scanner;

class Innersmallestmissing {
    public int missingvalue(int[] array) {
        int n = array.length;
        for (int i = 0; i < n; i++) {
            if (array[i] <= 0 || array[i] > n) {
                array[i] = n + 1;
            }
        }
        for (int i = 0; i < n; i++) {
            int val = Math.abs(array[i]);
            if (val <= n) {
                array[val - 1] = -Math.abs(array[val - 1]);
            }
        }
        for (int i = 0; i < n; i++) {
            if (array[i] > 0) {
                return i + 1;
            }
        }
        return n + 1;
    }
}

public class smallestmissing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size:");
        int size = sc.nextInt();

        int[] array = new int[size];
        System.out.println("Enter the array:");
        for (int i = 0; i < size; i++) {
            array[i] = sc.nextInt();
        }

        Innersmallestmissing obj = new Innersmallestmissing();
        System.out.println("Smallest missing positive number: " + obj.missingvalue(array));
    }
}
