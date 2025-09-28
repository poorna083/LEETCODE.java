import java.util.*;
class InnerlargestTriangle1 {
    public int largestPerimeter(int[] array) {
        Arrays.sort(array);
        for(int i = array.length-1; i>1; i--){
           if(array[i] < array[i-1] + array[i-2])
               return  array[i] + array[i-1]+ array[i-2];   
        }
        return 0;
    }
    
}

public class largestTriangle1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The size of an array");
        int size = sc.nextInt();
        System.out.println("enter The array Elements:");
        int [] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i]=sc.nextInt();
        }
        sc.close();
        InnerlargestTriangle1 i = new InnerlargestTriangle1();
        System.out.println(i.largestPerimeter(array));

    }
}
