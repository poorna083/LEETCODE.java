import java.util.Scanner;
import java.util.ArrayList;

class InnerinsertionofTwoarray {
    public int[] intersection(int[] array1, int[] array2) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                if(array1[i] == array2[j]){
                    arrayList.add(array1[i]);
                    break; 
                }
            }
        }
        int[] result = new int[arrayList.size()];
        for (int i = 0; i < arrayList.size(); i++) {
            result[i] = arrayList.get(i);
        }
        return result;
    }
}

public class insertionofTwoarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < array2.length; i++) {
            array2[i]=sc.nextInt();
        }
        InnerinsertionofTwoarray i = new InnerinsertionofTwoarray();
        int[] result = i.intersection(array1, array2);
        for (int val : result) {
            System.out.print(val + " ");
        }
    }
}
        for (int i = 0; i < array1.length; i++) {
            array2[i]=sc.nextInt();
        }
        InnerinsertionofTwoarray i = new InnerinsertionofTwoarray();
        System.out.println(i.intersection(array1, array2));
    }
}
