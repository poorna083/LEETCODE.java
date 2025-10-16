import java.util.Scanner;
class Innersmallestmissing{
    public int missingvalue(int [] array , int value){
        java.util.HashSet<Integer> set = new java.util.HashSet<>();
        for (int v : array) {
            if (v > 0) set.add(v);
        }
        for (int i = 1; i <= array.length + 1; i++) {
            if (!set.contains(i)) return i;
        }
        return 1;
    }
}

public class smallestmissing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The size:");
        int size = sc.nextInt();
        System.out.println("Enter The array:");
        int [] array = new int[size];
        for(int i=0;i<size;i++){
            array[i]=sc.nextInt();
        }
        System.out.println("Enter The value:");
        int value = sc.nextInt();
        Innersmallestmissing i = new Innersmallestmissing();
        System.out.println(i.missingvalue(array, value));
    }
}
