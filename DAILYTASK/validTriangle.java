import java.util.Scanner;
class InnervalidTriangle {
    
    
}

public class validTriangle {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int size = sc.nextInt();
       int [] array = new int[size];
       for (int i = 0; i < size; i++) {
        array[i]=sc.nextInt();
       } 
       InnervalidTriangle i = new InnervalidTriangle();
       System.out.println();
    }
}
